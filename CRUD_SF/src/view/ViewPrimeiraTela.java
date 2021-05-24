package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ViewPrimeiraTela {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPrimeiraTela window = new ViewPrimeiraTela();
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
	public ViewPrimeiraTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 513, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(46, 65, 48, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(86, 62, 184, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(46, 90, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setBounds(46, 118, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(86, 90, 184, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(86, 115, 184, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(84, 156, 111, 23);
		frame.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setBounds(50, 190, 426, 72);
		frame.getContentPane().add(table);
		
		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.setBounds(84, 273, 111, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("CADASTRO DE USU\u00C1RIOS");
		lblNewLabel_3.setBounds(184, 27, 171, 24);
		frame.getContentPane().add(lblNewLabel_3);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
