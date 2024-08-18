
package PLATAFORMADESTREAMING;

/**
 *
 * @author Lucas
 */
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CATALOGO catalogo = new CATALOGO("THE HUMAN","NISKY", "CHERNOBYL");
                     
        PELICULAS peliculas = new PELICULAS("THE HUMAN","2022","ACCION",3,2, "Robert Laz");
        SERIES series = new SERIES("NISKY","2012","TERROR",5,1,24,5);
        DOCUMENTALES documentales = new DOCUMENTALES("CHERNOBYL","2019","SOCIAL",1,4,"EFECTOS AMBIENTALES");
        
        catalogo.Agregar(peliculas);
        catalogo.Buscar(series);
        catalogo.Quitar(documentales);
        
        
        
        
        
    }
}
 
    
    
    
    

