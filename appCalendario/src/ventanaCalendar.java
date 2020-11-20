import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ventanaCalendar extends JFrame implements ActionListener{
	
	private JPanel panel1;
	private JTable tbSemana;
	private DefaultTableModel modelo;
	private JScrollPane barra;
	
	private JMenuBar barraMenu;
	private JMenu menuArchivo;
	private JMenuItem menuItemNuevo;
	private JMenuItem menuItemBuscarNota;
	private JPopupMenu menuEmergente;
	
	//Caracteristicas
	public ventanaCalendar(){
		setTitle("Calendario");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		componentes();
		tablaSemana();
		menu();
	}
	
	//crearPanel
	private void componentes(){
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(Color.GREEN);
		this.getContentPane().add(panel1);
	}
	
	//Crear Tabla que muestre la semana
	private void tablaSemana(){
		
		tbSemana = new JTable();
		String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		Object datos[][] = {};
		modelo = new DefaultTableModel(datos,dias){
		};
		
		tbSemana.setModel(modelo);
		tbSemana.getColumnModel().getColumn(0).setMaxWidth(64);
		tbSemana.getColumnModel().getColumn(1).setMaxWidth(64);
		tbSemana.getColumnModel().getColumn(2).setMaxWidth(64);
		tbSemana.getColumnModel().getColumn(3).setMaxWidth(64);
		tbSemana.getColumnModel().getColumn(4).setMaxWidth(64);
		tbSemana.getColumnModel().getColumn(5).setMaxWidth(64);
		tbSemana.getColumnModel().getColumn(6).setMaxWidth(64);
		
		barra = new JScrollPane();
		barra.setBounds(15,60,450,300);
		panel1.add(barra);
		panel1.add(tbSemana);
		barra.setViewportView(tbSemana);
	}
	
	//Crear menu
	private void menu(){
		
		barraMenu = new JMenuBar();
		menuArchivo = new JMenu();
		menuItemNuevo = new JMenuItem();
		menuItemBuscarNota = new JMenuItem();	
		menuEmergente = new JPopupMenu();
		
		//Crear los items
		menuItemNuevo.setText("Nueva nota");
		menuArchivo.add(menuItemNuevo);
		menuArchivo.addSeparator();
		menuItemBuscarNota.setText("Buscar Nota");
		menuArchivo.add(menuItemBuscarNota);
		
		
		//Agregamos los menus de la barra de Menu
		menuArchivo.setText("Archivo");
		barraMenu.add(menuArchivo);
		setJMenuBar(barraMenu);
		
		//Agregamos el menu en el panel
		panel1.setComponentPopupMenu(menuEmergente);
		
		//Creamos los eventos para las opciones
		menuItemNuevo.addActionListener(this);
		menuItemBuscarNota.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == menuItemNuevo){
			//JOptionPane.showMessageDialog(null, "Hola","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
			
			ventanaNotas vNotas = new ventanaNotas();
			vNotas.setVisible(true);
		}
		else if(e.getSource() == menuItemBuscarNota){
			JOptionPane.showMessageDialog(null, "Hola","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
