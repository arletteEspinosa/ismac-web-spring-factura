package com.distribuida.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class PrubaConexionJdbc {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jdbcURL = "jdbc:sqlserver://localhost:1433;database=DbFactura;trustServerCertificate=True";
		String user = "user1";
		String password = "12345";

		try {

			System.out.println("Estableciendo conexión..." + jdbcURL);

			Connection connection = DriverManager.getConnection(jdbcURL, user, password);

			System.out.println("Conexión establecida!!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
