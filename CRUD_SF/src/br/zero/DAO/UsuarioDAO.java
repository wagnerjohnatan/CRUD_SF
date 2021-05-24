package br.zero.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.zero.entidade.Usuario;
import br.zero.jdbc.Conexao;

public class UsuarioDAO {
	
	private final String SQL_INSERE_USUARIO= "INSERT INTO \"PUBLIC\".\"USUARIO\" (\"NOME\", \"EMAIL\") VALUES (?, ?);";
	private final String SQL_ALTERA_USUARIO= "UPDATE USUARIO SET NOME=?, EMAIL=? WHERE ID=?";
	private final String SQL_EXCLUI_USUARIO= "DELETE FROM USUARIO WHERE ID=?;";
	private final String SQL_SELECIONA_USUARIO= "SELECT * FROM USUARIO";

	
	private PreparedStatement pst = null;
	
	
	public boolean  inserirUsuario(Usuario umUsuario) {
		boolean ret = false;
		Connection cnx = Conexao.conectar();
		try {
			pst = cnx.prepareStatement(SQL_INSERE_USUARIO);
			pst.setString(1, umUsuario.getNome());
			pst.setString(2, umUsuario.getEmail());
			ret = pst.execute();
			Conexao.fecharConexao();
			
		}catch( SQLException e) {
			System.out.println("ERRO AO EXECUTAR O STATEMENT"+e.toString());
		}
		return ret;
	}
 public ArrayList<Usuario> listarTodosUsuarios(){
	 
	 ArrayList<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
	 Connection cnx = Conexao.conectar()
;
	 Usuario umUsuario;
	 
	 try {
		    pst = cnx.prepareStatement(SQL_SELECIONA_USUARIO);
		    ResultSet rs = pst.executeQuery();
		    while(rs.next()) {
		    	umUsuario = new Usuario();
		    	umUsuario.setCodigo(rs.getInt("ID"));
		    	umUsuario.setNome(rs.getString("NOME"));
		    	umUsuario.setEmail(rs.getString("EMAIL"));
		    	listaDeUsuarios.add(umUsuario);
		    }
		    rs.close();
		    pst.close();
		    Conexao.fecharConexao();
	 }catch (SQLException e) {
		 
		 System.out.println("erro ao executar o statement"+ e.toString());
	 }
	return listaDeUsuarios;
	 
 }
 
 public boolean alterarUsuario(Usuario umUsuario) {
	 boolean ret = false;
	 Connection cnx = Conexao.conectar();
	 try {
		 pst = cnx.prepareStatement(SQL_ALTERA_USUARIO);
		 pst.setString(1,umUsuario.getNome());
		 pst.setString(2,umUsuario.getEmail());
		 pst.setInt(3,umUsuario.getCodigo());
		 ret = pst.execute();
		 pst.close();
		 Conexao.fecharConexao();
	 }catch(SQLException e) {
		 System.out.println("erro ao executar o statement"+ e.toString());
	 }
	return ret;
 }
 
 public boolean excluirUsuario(Usuario umUsuario) {
	 boolean ret = false;
	 Connection cnx = Conexao.conectar();
	 try {
		 pst = cnx.prepareStatement(SQL_EXCLUI_USUARIO);
		 pst.setInt(1,umUsuario.getCodigo());
		 ret = pst.execute();
		 pst.close();
		 Conexao.fecharConexao();
		 
		 }catch(SQLException e) {
			 System.out.println("erro ao executar o statement"+ e.toString());
		 }
	return ret;
 }

	}


