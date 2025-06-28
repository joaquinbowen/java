package com.krakedev.persisencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.People;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPrestamos {

	private static final Logger LOGGER = LogManager.getLogger(AdminPrestamos.class);

	public static void insertar(People person) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		PreparedStatement ps2;
		LOGGER.error("Persona a ingresar>>>" + person + " Con su prestamo>>>" + person.getPrestamo());

		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"insert into persona(cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos)"
							+ "values(?,?,?,?,?,?,?,?)");
			ps.setString(1, person.getCedula());
			ps.setString(2, person.getNombre());
			ps.setString(3, person.getApellido());
			ps.setDouble(4, person.getEstatura());
			ps.setDate(5, new java.sql.Date(person.getFechaNacimiento().getTime()));
			ps.setTime(6, new Time(person.getHoraNacimiento().getTime()));
			ps.setBigDecimal(7, person.getCantidadAhorrada());
			ps.setInt(8, person.getNumeroHijos());

			ps2 = con.prepareStatement(
					"insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)" + "values(?,?,?,?,?)");
			ps2.setString(1, person.getPrestamo().getCedula());
			ps2.setBigDecimal(2, person.getPrestamo().getMonto());
			ps2.setDate(3, new java.sql.Date(person.getPrestamo().getFechaPrestamo().getTime()));
			ps2.setTime(4, new Time(person.getPrestamo().getHoraPrestamo().getTime()));
			ps2.setString(5, person.getPrestamo().getGarante());

			ps.executeUpdate();
			ps2.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al insertar",e);
			throw new Exception("Error con la base de dato");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}

	}

	public static void actualizar(People person) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		PreparedStatement ps2;
		LOGGER.error("Persona a ingresar>>>" + person + " Con su prestamo>>>" + person.getPrestamo());

		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"update persona set nombre=?, apellido=?, estatura=?, fecha_nacimiento=?,hora_nacimiento=?, cantidad_ahorrada=?, numero_hijos=? where cedula=?");
			ps2 = con.prepareStatement(
					"update prestamo set monto=?,fecha_prestamo=?,hora_prestamo=?,garante=? where cedula=?");

			ps.setString(8, person.getCedula());
			ps.setString(1, person.getNombre());
			ps.setString(2, person.getApellido());
			ps.setDouble(3, person.getEstatura());
			ps.setDate(4, new java.sql.Date(person.getFechaNacimiento().getTime()));
			ps.setTime(5, new Time(person.getHoraNacimiento().getTime()));
			ps.setBigDecimal(6, person.getCantidadAhorrada());
			ps.setInt(7, person.getNumeroHijos());

			ps2.setString(5, person.getPrestamo().getCedula());
			ps2.setBigDecimal(1, person.getPrestamo().getMonto());
			ps2.setDate(2, new java.sql.Date(person.getPrestamo().getFechaPrestamo().getTime()));
			ps2.setTime(3, new Time(person.getPrestamo().getHoraPrestamo().getTime()));
			ps2.setString(4, person.getPrestamo().getGarante());

			ps.executeUpdate();
			ps2.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al insertar",e);
			throw new Exception("Error con la base de dato");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}

	}
	
	public static void eliminar(String cedula) throws Exception {
		Connection con=null;
		PreparedStatement ps;
		PreparedStatement ps2;
		
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("delete from persona where cedula=?");
			ps2=con.prepareStatement("delete from prestamo where cedula=?");
			
			ps.setString(1, cedula);
			ps2.setString(1, cedula);
			
			ps2.executeUpdate();
			ps.executeUpdate();
			
			
		} catch (Exception e) {
			LOGGER.error("Error al insertar",e);
			throw new Exception("Error con la base de dato");
		}finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
		
		
		
		
		
	}
}
