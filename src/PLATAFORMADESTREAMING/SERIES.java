/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PLATAFORMADESTREAMING;

/**
 *
 * @author Lucas
 */
public class SERIES extends CONTENIDOMULTIMEDIA{
    private int Capitulos;
    private int Temporadas;
    
    public SERIES(String Titulo, String Año,String Clasificacion,int Popularidad,int tiempo,int Capitulos, int Temporadas ){
        this.Capitulos = Capitulos;
        this.Temporadas = Temporadas;
    }  
}
