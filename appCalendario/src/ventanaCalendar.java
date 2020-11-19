import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class ventanaCalendar extends JFrame{
	
	private JPanel panel1;
	
	public ventanaCalendar(){
		setTitle("Calendario");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		componentes();
	}
	
	private void componentes(){
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(Color.GREEN);
		this.getContentPane().add(panel1);
	}
}
