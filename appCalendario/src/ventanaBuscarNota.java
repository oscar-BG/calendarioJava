import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JPanel;


public class ventanaBuscarNota extends JFrame{
	
	private JComboBox cbxListaNotas;
	private JPanel panelVBN;
	
	public ventanaBuscarNota(){
		setTitle("Buscar mis notas");
		setSize(300,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(1);
		
		listaNotas();
		
	}
	
	public void listaNotas(){
		//Crear panel
		panelVBN = new JPanel();
		panelVBN.setLayout(null);
		
		this.getContentPane().add(panelVBN);
		
		//Lista desplegable
		String[] menu = {"Hola","Hola2"};
		
		cbxListaNotas = new JComboBox(menu);
		cbxListaNotas.setBounds(10,10,150,30);
		panelVBN.add(cbxListaNotas);
		
	}
}
