/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package INTERFACESYABSTRACCION;

/**
 *
 * @author Lucas
 */
public class NOTIFICACION {

    void enviar(String hola_desde_el_correo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // Interfaz
interface Notificacion {
    void enviar(String mensaje);
}

// Implementación 1: Notificación por Correo
class NotificacionCorreo implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando por Correo: " + mensaje);
    }
}

// Implementación 2: Notificación por SMS
class NotificacionSMS implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando por SMS: " + mensaje);
    }
}
}
