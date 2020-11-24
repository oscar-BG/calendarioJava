import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;


public class ventanaBuscarNota extends JFrame implements ItemListener{
	
	private JComboBox cbxListaNotas;
	private JPanel panelVBN;
	private File archivo = null;
    private FileReader fr = null;
    private BufferedReader br = null;
    
	private File archivo2 = null;
    private FileReader fr2 = null;
    private BufferedReader br2 = null;
    
    private String nombreNota;
    private String contenidoNota;
    private String lineaCadena;
    private String url;
    private JTextArea txtAreaMostrarContenido;
    private JLabel lblPruebaItem;
	
	public ventanaBuscarNota(){
		setTitle("Buscar mis notas");
		setSize(300,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(1);
		
		listaNotas();
		mostrarContenidoNota();
	}
	
	public void listaNotas(){
		
		//Inicio
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("nombreNotas.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea = br.readLine();
         nombreNota = linea;
         //while((linea=br.readLine())!=null)
            //System.out.println(linea);
            
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      
      //Fin
		
		//Crear panel
		panelVBN = new JPanel();
		panelVBN.setLayout(null);
		
		this.getContentPane().add(panelVBN);
		
		//Lista desplegable
		String[] menu = {"Eleguir",nombreNota};
		
		cbxListaNotas = new JComboBox(menu);
		cbxListaNotas.setBounds(10,10,150,30);
		cbxListaNotas.addItemListener(this);
		panelVBN.add(cbxListaNotas);
		
		
		/*/
		lblPruebaItem = new JLabel();
		lblPruebaItem.setBounds(10,300,30,20);
		lblPruebaItem.setText("Hola");
		panelVBN.add(lblPruebaItem);
		/*/
		
	}
	public void itemStateChanged(ItemEvent e){
		if(e.getSource() == cbxListaNotas){
			String seleccionado = cbxListaNotas.getSelectedItem().toString();
			if(seleccionado == nombreNota){
				//lblPruebaItem.setText(seleccionado);
				//Inicio
				try{
					url = "notas/"+nombreNota+".txt";
					
					archivo2 = new File(url);
					fr2 = new FileReader(archivo2);
					br2 = new BufferedReader(fr2);
					
					//Lectura del archivo
					lineaCadena = br2.readLine();
					contenidoNota = lineaCadena;
					txtAreaMostrarContenido.setText(contenidoNota);
					
				}catch(Exception a){
					a.printStackTrace();
					
				}finally{
					try{
						if(null != fr2){
							fr2.close();
						}
						
					}catch(Exception e2){
						e2.printStackTrace();
					}
				}
				
				//Fin
			}
		}
	}
	public void mostrarContenidoNota(){
		txtAreaMostrarContenido = new JTextArea();
		txtAreaMostrarContenido.setBounds(10,50,250,200);
		panelVBN.add(txtAreaMostrarContenido);
	}
}
