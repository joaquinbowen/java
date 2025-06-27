package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InsertarBDD {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		PreparedStatement ps2 = null;

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"impacto2580");
			System.out.println("conexion exitosa :0");

			ps = connection.prepareStatement(
					"insert into persona(cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos)"
							+ " values(?,?,?,?,?,?,?,?)");
			ps2 = connection.prepareStatement(
					"insert into prestamo(cedula,monto,fecha_prestamo,hora_prestamo,garante)" + " values(?,?,?,?,?)");

			ps.setString(1, "1710028225");
			ps.setString(2, "Ana");
			ps.setString(3, "Suarez");
			ps.setDouble(4, 1.54);
			ps.setInt(8, 4);
			ps.setBigDecimal(7, new BigDecimal(12000.77));

			ps2.setString(1, "1710028225");
			ps2.setBigDecimal(2, new BigDecimal(50477.33));
			ps2.setString(5, "HOlaque hace");

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

			String fechaN = "1981/11/28 18:35:40";
			String fechaP = "2001/01/28 23:35:40";

			try {
				// tabla persona
				Date fechaNacimiento = sdf.parse(fechaN);
				long fechaMilisN = fechaNacimiento.getTime();
				java.sql.Date fechaNSQL = new java.sql.Date(fechaMilisN);
				Time timeNSQL = new Time(fechaMilisN);

				// tabla prestamo
				Date fechaPrestamo = sdf2.parse(fechaP);
				long fechaMilisP = fechaPrestamo.getTime();
				java.sql.Date fechaPSQL = new java.sql.Date(fechaMilisP);
				Time timePSQL = new Time(fechaMilisP);

				ps.setDate(5, fechaNSQL);
				ps.setTime(6, timeNSQL);

				ps2.setDate(3, fechaPSQL);
				ps2.setTime(4, timePSQL);

				ps.executeUpdate();
				System.out.println("Tabla Persona");
				ps2.executeUpdate();
				System.out.println("Tabla Prestamo");

			} catch (ParseException e) {

				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}

}
