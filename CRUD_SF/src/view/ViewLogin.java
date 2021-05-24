package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewLogin {

	private JFrame frame;
	private JPasswordField txtSenha;
	private JTextField txtLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin window = new ViewLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 381, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(44, 72, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(44, 112, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(100, 106, 158, 26);
		frame.getContentPane().add(txtSenha);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(100, 69, 158, 26);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (CheckLogin(txtLogin.getText(), new String (txtSenha.getPassword()))) {
					ViewPrimeiraTela telaDeContato = new ViewPrimeiraTela();
			        telaDeContato.setVisible(true);  
			        txtLogin.setText("");
			        txtSenha.setText("");
				}else {
					JOptionPane.showMessageDialog(null, "DADOS INVÁLIDOS");
				}
			}
		});
		btnNewButton.setBounds(134, 155, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
	
	public boolean CheckLogin(String login, String senha) {
		return login.equals("usuario")&& senha.equals("123");
		
	}
}
