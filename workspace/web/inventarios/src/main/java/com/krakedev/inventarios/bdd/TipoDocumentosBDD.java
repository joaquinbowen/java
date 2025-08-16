package com.krakedev.inventarios.bdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.inventarios.entidades.TipoDocumento;
import com.krakedev.inventarios.excepciones.KrakedevException;
import com.krakedev.inventarios.utils.ConexionBDD;

public class TipoDocumentosBDD {
	
	public ArrayList<TipoDocumento> recuperar() throws KrakedevException {
		ArrayList<TipoDocumento> documentos = new ArrayList<TipoDocumento>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		TipoDocumento tipoDocumento = null; 
		try {
			con = ConexionBDD.obtenerConexion(); 
			ps = con.prepareStatement("select * from tipo_documento");
			rs = ps.executeQuery();

			while (rs.next()) {
				String codigo = rs.getString("codigo");
				String descripcion = rs.getString("descripcion");
				
				tipoDocumento = new TipoDocumento(codigo,descripcion);

				documentos.add(tipoDocumento);

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
		return documentos;
	}
	
	
	public void crear(TipoDocumento tipoDocumento) throws KrakedevException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement(
					"insert into tipo_documento(codigo,descripcion) values(?,?)");

			ps.setString(1, tipoDocumento.getCodigo());
			ps.setString(2, tipoDocumento.getDescripcion());

			ps.executeUpdate();

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
	
	
}
