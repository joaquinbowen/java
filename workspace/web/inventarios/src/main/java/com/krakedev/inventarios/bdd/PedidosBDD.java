package com.krakedev.inventarios.bdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import com.krakedev.inventarios.entidades.DetallePedido;
import com.krakedev.inventarios.entidades.EstadoPedido;
import com.krakedev.inventarios.entidades.Pedido;
import com.krakedev.inventarios.entidades.Proveedor;
import com.krakedev.inventarios.excepciones.KrakedevException;
import com.krakedev.inventarios.utils.ConexionBDD;

public class PedidosBDD {

	public void crear(Pedido pedido) throws KrakedevException {
		Connection con = null;
		PreparedStatement ps = null;
		PreparedStatement psDet = null;
		ResultSet rsClave = null;
		int codigoCabecera = 0;

		Date fechaActual = new Date();
		java.sql.Date fechaSQL = new java.sql.Date(fechaActual.getTime());

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("insert into cabecera_pedido(proveedor,fecha,estado)" + " values(?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, pedido.getProveedor().getIdentificador());
			ps.setDate(2, fechaSQL);
			ps.setString(3, "S");

			ps.executeUpdate();
			rsClave = ps.getGeneratedKeys();

			if (rsClave.next()) {
				codigoCabecera = rsClave.getInt(1);
			}

			ArrayList<DetallePedido> detallesPedido = pedido.getPedidos();
			DetallePedido det;
			for (int i = 0; i < detallesPedido.size(); i++) {
				det = detallesPedido.get(i);
				psDet = con.prepareStatement(
						"insert into detalle_pedido(cabecera_pedido,producto,cantidad_solicitada,subtotal,cantidad_recibida)"
								+ " values(?,?,?,?,?);");
				psDet.setInt(1, codigoCabecera);
				psDet.setInt(2, det.getProducto().getCodigo());
				psDet.setInt(3, det.getCantidadSolicitada());
				BigDecimal pv = det.getProducto().getPrecioVenta();
				BigDecimal cantidad = new BigDecimal(det.getCantidadSolicitada());
				BigDecimal subtotal = pv.multiply(cantidad);
				psDet.setBigDecimal(4, subtotal);
				psDet.setInt(5, 0);
				psDet.executeUpdate();
			}

		} catch (KrakedevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakedevException("Error al insertar Detalle:" + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public void recibir(Pedido pedido) throws KrakedevException {
		Connection con = null;
		PreparedStatement ps = null;
		PreparedStatement psEstado = null;
		PreparedStatement psHistorial = null;

		try {
			con = ConexionBDD.obtenerConexion();

			ArrayList<DetallePedido> detallesPedido = pedido.getPedidos();
			DetallePedido det;
			for (int i = 0; i < detallesPedido.size(); i++) {
				det = detallesPedido.get(i);
				ps = con.prepareStatement(
						"update detalle_pedido" + " set cantidad_recibida=?,subtotal=?" + " where codigo=?");
				psHistorial = con.prepareStatement(
						"insert into historial_stock(fecha,referencia,producto,cantidad) " + " values(?,?,?,?)");

				det = detallesPedido.get(i);
				Date fechaAct = new Date();
				Timestamp fechaSQL = new Timestamp(fechaAct.getTime());

				psHistorial.setTimestamp(1, fechaSQL);
				psHistorial.setString(2, "Pedido " + pedido.getCodigo());
				psHistorial.setInt(3, det.getProducto().getCodigo());
				psHistorial.setInt(4, det.getCantidadRecibida());

				ps.setInt(3, det.getCodigo());
				ps.setInt(1, det.getCantidadRecibida());
				BigDecimal cantidadRecibida = new BigDecimal(det.getCantidadRecibida());
				BigDecimal pv = det.getProducto().getPrecioVenta();
				BigDecimal subtotal = pv.multiply(cantidadRecibida);
				ps.setBigDecimal(2, subtotal);
				ps.executeUpdate();
				psHistorial.executeUpdate();
			}
			psEstado = con.prepareStatement("update cabecera_pedido set estado=? where numero=?");
			psEstado.setString(1, "R");
			psEstado.setInt(2, pedido.getCodigo());
			psEstado.executeUpdate();

		} catch (KrakedevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakedevException("Error al insertar Detalle:" + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public ArrayList<Pedido> buscarPorProveedor(String subcadena) throws KrakedevException {
		ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Pedido pe = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("select * from cabecera_pedido where proveedor like ?");
			ps.setString(1, "%" + subcadena.toUpperCase() + "%");
			rs = ps.executeQuery();
			while (rs.next()) {
				int codigo = rs.getInt("numero");
				String proveedor = rs.getString("proveedor");
				Proveedor pro = new Proveedor();
				pro.setIdentificador(proveedor);
				Date fecha = rs.getDate("fecha");
				String estado = rs.getString("estado");
				EstadoPedido est = new EstadoPedido();
				est.setCodigo(estado);
				pe = new Pedido();
				pe.setCodigo(codigo);
				pe.setProveedor(pro);
				pe.setFecha(fecha);
				pe.setEstado(est);
				pedidos.add(pe);
				System.out.println(pe);
			}

		} catch (KrakedevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakedevException("Error al consultar Detalle:" + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return pedidos;
	}

}
