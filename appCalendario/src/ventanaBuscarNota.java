import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class ventanaBuscarNota extends JFrame{
	
	private JComboBox cbxListaNotas;
	private JPanel panelVBN;
	 File archivo = null;
     FileReader fr = null;
     BufferedReader br = null;
    private String nombreNota;
	
	public ventanaBuscarNota(){
		setTitle("Buscar mis notas");
		setSize(300,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(1);
		
		listaNotas();
		
	}
	
	public void listaNotas(){
		//
		
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
      
		
		//Crear panel
		panelVBN = new JPanel();
		panelVBN.setLayout(null);
		
		this.getContentPane().add(panelVBN);
		
		//Lista desplegable
		String[] menu = {nombreNota};
		
		cbxListaNotas = new JComboBox(menu);
		cbxListaNotas.setBounds(10,10,150,30);
		panelVBN.add(cbxListaNotas);
		
	}
}
