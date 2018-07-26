import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jdom2.Document;         // |
import org.jdom2.Element;          // |\ Librer�as
import org.jdom2.JDOMException;    // |/ JDOM
import org.jdom2.input.SAXBuilder; // |
public class LeerXML2 {
	public static void main(String[] args) {
		//Se crea un SAXBuilder para poder parsear el archivo
	    SAXBuilder builder = new SAXBuilder();
	    File xmlFile = new File("datos.xml");
	    try
	    {
	        //Se crea el documento a traves del archivo
	        Document document = (Document) builder.build( xmlFile );
	 
	        //Se obtiene la raiz 'tables'
	        Element rootNode = document.getRootElement();
	 
	        //Se obtiene la lista de hijos de la raiz 'tables'
	        List<Element> list = rootNode.getChildren( "tabla" );
	 
	        //Se recorre la lista de hijos de 'tables'
	        for ( int i = 0; i < list.size(); i++ )
	        {
	            //Se obtiene el elemento 'tabla'
	            Element tabla = (Element) list.get(i);
	 
	            //Se obtiene el atributo 'nombre' que esta en el tag 'tabla'
	            String nombreTabla = tabla.getAttributeValue("nombre");
	 
	            System.out.println( "Tabla: " + nombreTabla );
	 
	            //Se obtiene la lista de hijos del tag 'tabla'
	            List<Element> lista_campos = tabla.getChildren();
	 
	            System.out.println( "\tNombre\t\tTipo\t\tValor" );
	 
	            //Se recorre la lista de campos
	            for ( int j = 0; j < lista_campos.size(); j++ )
	            {
	                //Se obtiene el elemento 'campo'
	                Element campo = (Element)lista_campos.get( j );
	         
	                //Se obtienen los valores que estan entre los tags '&lt;campo&gt;&lt;/campo&gt;'
	                //Se obtiene el valor que esta entre los tags '&lt;nombre&gt;&lt;/nombre&gt;'
	                String nombre = campo.getChildTextTrim("nombre");
	 
	                //Se obtiene el valor que esta entre los tags '&lt;tipo&gt;&lt;/tipo&gt;'
	                String tipo = campo.getChildTextTrim("tipo");
	 
	                //Se obtiene el valor que esta entre los tags '&lt;valor&gt;&lt;/valor&gt;'
	                String valor = campo.getChildTextTrim("valor");
	 
	                System.out.println( "\t"+nombre+"\t\t"+tipo+"\t\t"+valor);
	            }
	        }
	    }catch ( IOException io ) {
	        System.out.println( io.getMessage() );
	    }catch ( JDOMException jdomex ) {
	        System.out.println( jdomex.getMessage() );
	 
	    }
	}
	
}
