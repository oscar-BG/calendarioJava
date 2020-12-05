import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class nuevoUsuario extends JFrame{
	
	private JLabel lblBienvenida;
	private JLabel lblIdUsuario;
	private JLabel lblNombreUsu;
	private JLabel lblClave;
	private JLabel lblRepiteClave;
	private JTextField txtIdUsuario;
	private JTextField txtNombreUsu;
	private JTextField txtClave;
	private JTextField txtRepiteClave;
	private JButton btnRegistrar;
	private JPanel panel;
	
	public nuevoUsuario(){
		setTitle("Registrar nuevo Usuario");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(1);
		
		componentes();
	}
	
	public void componentes(){
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.CYAN);
		this.getContentPane().add(panel);
		
		lblBienvenida = new JLabel();
		lblBienvenida.setText("Registrar Nuevo Usuario");
		lblBienvenida.setBounds(110,10,200,20);
		panel.add(lblBienvenida);
		
		//ID usuario
		lblIdUsuario = new JLabel();
		lblIdUsuario.setText("ID Usuario");
		lblIdUsuario.setBounds(100,30,150,20);
		panel.add(lblIdUsuario);
		
		txtIdUsuario = new JTextField();
		txtIdUsuario.setBounds(100,60,150,20);
		panel.add(txtIdUsuario);
		
		//Nombre Usuario
		lblNombreUsu = new JLabel();
		lblNombreUsu.setText("Nombre del Usuario");
		lblNombreUsu.setBounds(100,90,150,20);
		panel.add(lblNombreUsu);
		
		txtNombreUsu = new JTextField();
		txtNombreUsu.setBounds(100,120,150,20);
		panel.add(txtNombreUsu);
		
		//Clve
		lblClave = new JLabel();
		lblClave.setText("Ingrese su Contraseña");
		lblClave.setBounds(100,150,150,20);
		panel.add(lblClave);
		
		txtClave = new JTextField();
		txtClave.setBounds(100,180,150,20);
		panel.add(txtClave);
		
		//Repite clave
		lblRepiteClave = new JLabel();
		lblRepiteClave.setText("Confirmar Contrseña");
		lblRepiteClave.setBounds(100,210,150,20);
		panel.add(lblRepiteClave);
		
		txtRepiteClave = new JTextField();
		txtRepiteClave.setBounds(100,230,150,20);
		panel.add(txtRepiteClave);
		
		//Boton
		btnRegistrar = new JButton();
		btnRegistrar.setText("Registrar");
		btnRegistrar.setBounds(110,260,100,20);
		panel.add(btnRegistrar);
	}
}
