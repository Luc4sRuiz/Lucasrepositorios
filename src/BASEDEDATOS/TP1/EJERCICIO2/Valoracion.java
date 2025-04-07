/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BASEDEDATOS.TP1.EJERCICIO2;

/**
 *
 * @author Lucas
 */
class Valoracion {
    private Usuario usuario;
    private int puntuacion; // Ej: 1 a 5 estrellas

    public Valoracion(Usuario usuario, int puntuacion) {
        this.usuario = usuario;
        this.puntuacion = puntuacion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }
}
