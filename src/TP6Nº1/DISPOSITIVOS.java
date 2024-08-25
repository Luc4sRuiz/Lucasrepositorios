/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6Nº1;
import java.util.List;

/**
 *
 * @author Lucas
 */
public abstract class DISPOSITIVOS {
    protected String nombre;
    protected boolean encendido;
    protected HISTORIAL historial;

    public DISPOSITIVOS(String nombre) {
        this.nombre = nombre;
        this.encendido = false;
        this.historial = new HISTORIAL();
    }

    public String getNombre() {
        return nombre;
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            historial.agregarRegistro("Encendido");
            System.out.println(nombre + " encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            historial.agregarRegistro("Apagado");
            System.out.println(nombre + " apagado.");
        }
    }

    public String obtenerEstado() {
        return encendido ? "Encendido" : "Apagado";
    }

    public List<String> obtenerHistorial() {
        return historial.obtenerRegistros();
    }

    public abstract void funcionEspecifica();
}
    

