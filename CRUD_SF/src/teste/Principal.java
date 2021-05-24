package teste;

import java.util.ArrayList;

import br.zero.DAO.UsuarioDAO;
import br.zero.entidade.Usuario;

public class Principal {
	
	public static void main(String[] args) {
		UsuarioDAO usrDAO = new UsuarioDAO();
		Usuario umUsr = new Usuario();
		
		umUsr.setNome("teste");
		umUsr.setEmail("teste@email.com");
		
		 usrDAO.inserirUsuario(umUsr);
		
		ArrayList<Usuario> listUsuarios = usrDAO.listarTodosUsuarios();
		for (Usuario umUsuario : listUsuarios)
			
			System.out.println(umUsuario.toString());
		
	}




}
