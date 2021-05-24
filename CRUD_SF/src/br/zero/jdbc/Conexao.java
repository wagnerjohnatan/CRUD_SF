package br.zero.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	
	private static Connection cnx = null;
	private static String usuario = "SA";
	private static String senha = "";
	private static String PathBase = "C:\\Projeto\\TesteInterface\\base\\zero";
	private static final String URL = "jdbc:hsqldb:file:" + PathBase+ "shutdown = true ; hsqldb.write_delay=false;";
	
	
	public static Connection conectar() {
		if (cnx == null){
		
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			
			try {
				cnx = DriverManager.getConnection(URL, usuario, senha);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		return cnx;

	}
	
	public static void fecharConexao() {
		try {
			cnx.close();
			cnx = null;
		}catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
}
