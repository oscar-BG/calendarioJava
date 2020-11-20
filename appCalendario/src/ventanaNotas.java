import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ventanaNotas extends JFrame implements ActionListener{
	
	private JPanel panel;
	private JLabel lblMensaje;
	private JTextField txtNota;
	private JButton btnCrearNota;
	
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
		
		txtNota = new JTextField();
		txtNota.setBounds(15,50,250,200);
		panel.add(txtNota);
		
		btnCrearNota = new JButton();
		btnCrearNota.setText("Crear nota");
		btnCrearNota.setBounds(100,280,100,20);
		panel.add(btnCrearNota);
		
		btnCrearNota.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btnCrearNota){
			try{
				PrintWriter escribir = new PrintWriter("nota1.txt","UTF-8");
				escribir.println(txtNota.getText());
				escribir.close();
			} catch (Exception e1){
				e1.printStackTrace();
			}
		}
	}
		
}
