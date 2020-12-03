import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

class usuario extends JFrame{
	
	private JPanel panel;
	private JLabel lblBienvenida;
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JTextField txtUsuario;
	private JTextField txtPassword;
	private JButton btnAceptar;
	
	public usuario(){
		setTitle("Ingresar Usuario");
		setSize("300,400");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void componetes(){
		panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
		//Bienvenido
		lblBienvenida = new JLabel();
		lblBienvenida.setText("Registro de Usuario");
		lblBienvenida.setBounds(100,10,150,20);
		panel.add(lblBienvenida);
		
		//Poner Usuario
		lblUsuario = new JLabel();
		lblUsuario.setText("Ingrese su usuario");
		lblUsuario.setBounds(10,30,100,20);
		panel.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(10,50,100,20);
		panel.add(txtUsuario);
		
		//Poner contraseña
		lblPassword = new JLabel();
		lblPassword.setText("Ingrese su contraseña");
		lblPassword.setBounds(10,70,100,20);
		panel.add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(10,90,100,20);
		panel.add(txtPassword);
		
		//Colocar botones
		btnAceptar = new JButton();
		btnAceptar.setText("Ingresar");
		btnAceptar.setBounds(100,110,50,20);
		panel.add(btnAceptar);
		
	}
}
