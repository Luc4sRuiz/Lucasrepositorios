
package PLATAFORMADESTREAMING;

/**
 *
 * @author Lucas
 */
public class CONTENIDOMULTIMEDIA {
    
    //ATRIBUTOS
    protected String Titulo;
    protected String Año;
    protected String Clasificacion;
    protected int Popularidad;
    protected int tiempo;
    //METODOS 
    public void reproducir(){
        System.out.println("Se esta reproduciendo " +Titulo);
    }
    public void pausa(){
        System.out.println("Se esta reproduciendo " +Titulo);
    } 
     public void play(){
        System.out.println("Se esta reproduciendo " +Titulo);
    }
    public void popularidad(){
       if((Popularidad>=1) && (Popularidad<=5)){   
        }
            if(Popularidad<= 1){
             System.out.println("El "+Titulo+" es de 1 Estrella");
              
            }else if(Popularidad>=2){
             System.out.println("El "+Titulo+" es de 2 Estrella");
             
            }if(Popularidad>=3){
             System.out.println("El "+Titulo+" es de 3 Estrella"); 
             
            }else if(Popularidad>=4){
             System.out.println("El "+Titulo+" es de 4 Estrella"); 
             
            }if(Popularidad<= 5){
             System.out.println("El "+Titulo+" es de 5 Estrella");
        }  
    }
    public void Duracion(){
        for (tiempo=1;tiempo<=4;tiempo++){ 
            if(tiempo<=1){
            System.out.println("El "+Titulo+" dura una 1 hora");
            }else if(tiempo>=2){
            System.out.println("El "+Titulo+" dura una 2 hora");
            }if(tiempo>=3){
            System.out.println("El "+Titulo+" dura una 3 hora");
            }if(tiempo<=4){
            System.out.println("El "+Titulo+" dura una 4 hora");
            }
        
        }
            
    }
}     
    
