/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BASEDEDATOS.TP1.EJERCICIO2;

/**
 *
 * @author Lucas
 */
public class Notificacion {
    private String mensaje;
    private boolean leida;

    public Notificacion(String mensaje) {
        this.mensaje = mensaje;
        this.leida = false;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void marcarComoLeida() {
        this.leida = true;
    }
}
