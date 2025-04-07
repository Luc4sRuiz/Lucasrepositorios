/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BASEDEDATOS.TP1.EJERCICIO2;

/**
 *
 * @author Lucas
 */
public class Comentario {
     private Usuario autor;
    private String texto;

    public Comentario(Usuario autor, String texto) {
        this.autor = autor;
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
