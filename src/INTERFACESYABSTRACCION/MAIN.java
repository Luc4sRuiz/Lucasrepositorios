/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package INTERFACESYABSTRACCION;

/**
 *
 * @author Lucas
 */
public class MAIN {
    public static void main(String[] args) {
        NOTIFICACION correo = new NotificacionCorreo();
        NOTIFICACION sms = new NotificacionSMS();

        correo.enviar("Hola desde el correo!");
        sms.enviar("Hola desde el SMS!");
    }
}
