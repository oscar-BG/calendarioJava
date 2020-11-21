import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ventanaNotas extends JFrame implements ActionListener{
	
	private JPanel panel;
	private JLabel lblMensaje;
	private JTextField txtNota;
	private JButton btnCrearNota;
	private JTextArea txtAreaNota;
	
	public ventanaNotas(){
		setTitle("Crear nota");
		setSize(300,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(1);
		
		componentes();
	}
	
	public void componentes(){
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.CYAN);
		this.getContentPane().add(panel);
		
		lblMensaje = new JLabel();
		lblMensaje.setText("Crear nueva nota");
		lblMensaje.setBounds(100,20,100,20);
		panel.add(lblMensaje);
		
		txtAreaNota = new JTextArea();
		txtAreaNota.setBounds(15,50,250,200);
		panel.add(txtAreaNota);
		
		/*/Codigo por borrar
		txtNota = new JTextField();
		txtNota.setBounds(15,50,250,200);
		panel.add(txtNota);
		/*/
		
		
		btnCrearNota = new JButton();
		btnCrearNota.setText("Crear nota");
		btnCrearNota.setBounds(100,280,100,20);
		panel.add(btnCrearNota);
		
		btnCrearNota.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btnCrearNota){
			
			//Obtener fecha del sistema Operativo
			Date date = new Date();
			DateFormat horaFecha = new SimpleDateFormat("HHmmssddMMyyyy");
			JLabel lblFechaHora = new JLabel();
			String CadenahoraFecha = horaFecha.format(date);
			//
			
			try{
				PrintWriter escribir = new PrintWriter(CadenahoraFecha+".txt","UTF-8");
				//escribir.println(txtNota.getText());
				escribir.println(txtAreaNota.getText());
				escribir.close();
			} catch (Exception e1){
				e1.printStackTrace();
			}
		}
	}
		
}
