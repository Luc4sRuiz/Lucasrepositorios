/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6Nº1;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lucas
 */
public class RADIOTT {
  
    private List<DISPOSITIVOS> dispositivos;

    public RADIOTT() {
        this.dispositivos = new ArrayList<>();
    }

    public void agregarDispositivo(DISPOSITIVOS dispositivo) {
        dispositivos.add(dispositivo);
        System.out.println(dispositivo.getNombre() + " agregado a la red.");
    }

    public void encenderDispositivo(String nombre) {
        for (DISPOSITIVOS dispositivo : dispositivos) {
            if (dispositivo.getNombre().equals(nombre)) {
                dispositivo.encender();
                return;
            }
        }
        System.out.println("Dispositivo no encontrado: " + nombre);
    }

    public void apagarDispositivo(String nombre) {
        for (DISPOSITIVOS dispositivo : dispositivos) {
            if (dispositivo.getNombre().equals(nombre)) {
                dispositivo.apagar();
                return;
            }
        }
        System.out.println("Dispositivo no encontrado: " + nombre);
    }

    public void mostrarEstadoDispositivo(String nombre) {
        for (DISPOSITIVOS dispositivo : dispositivos) {
            if (dispositivo.getNombre().equals(nombre)) {
                System.out.println("Estado de " + nombre + ": " + dispositivo.obtenerEstado());
                return;
            }
        }
        System.out.println("Dispositivo no encontrado: " + nombre);
    }

    public void mostrarHistorialDispositivo(String nombre) {
        for (DISPOSITIVOS dispositivo : dispositivos) {
            if (dispositivo.getNombre().equals(nombre)) {
                System.out.println("Historial de " + nombre + ":");
                for (String registro : dispositivo.obtenerHistorial()) {
                    System.out.println("- " + registro);
                }
                return;
            }
        }
        System.out.println("Dispositivo no encontrado: " + nombre);
    }
}   

