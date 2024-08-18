/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PLATAFORMADESTREAMING;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class CATALOGO {
    PELICULAS ASOCIADO1;
    SERIES ASOCIADO2;
    DOCUMENTALES ASOCIADO3;
    private List<PELICULAS> peliculass;
    private List<SERIES> seriess;
    private List<DOCUMENTALES> documentaless;
    public CATALOGO (String Peliculas, String Series, String Documentales){
        this.peliculass = new ArrayList<>();
        this.seriess = new ArrayList<>();
        this.documentaless = new ArrayList<>();
    }
    
    
    public void Agregar(PELICULAS peliculas){
        peliculass.add(peliculas);
        System.out.println("Se Agrego la "+peliculas);
    }
  
    public void Buscar(SERIES series){
      seriess.contains(series);
      System.out.println("Se busco la "+series);
    }
    public void Quitar(DOCUMENTALES documentales){
        documentaless.remove(documentales);
         System.out.println("Se Quito el "+documentales);
    }
    
}
