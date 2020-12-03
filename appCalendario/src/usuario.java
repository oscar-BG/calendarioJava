import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class usuario extends JFrame implements  ActionListener{
	
	private JPanel panel;
	private JLabel lblBienvenida;
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JTextField txtUsuario;
	private JTextField txtPassword;
	private JButton btnAceptar;
	
	public usuario(){
		setTitle("Ingresar Usuario");
		setSize(300,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		componetes();
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
		lblUsuario.setBounds(10,40,150,20);
		panel.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(10,60,150,20);
		panel.add(txtUsuario);
		
		//Poner contraseņa
		lblPassword = new JLabel();
		lblPassword.setText("Ingrese su contraseņa");
		lblPassword.setBounds(10,80,150,20);
		panel.add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(10,100,150,20);
		panel.add(txtPassword);
		
		//Colocar botones
		btnAceptar = new JButton();
		btnAceptar.setText("Ingresar");
		btnAceptar.setBounds(100,150,100,20);
		panel.add(btnAceptar);
		btnAceptar.addActionListener(this);	
	}
	
	public void actionPerformed(ActionEvent e){
		ventanaCalendar cal = new ventanaCalendar();
		cal.setVisible(true);
	}
}
