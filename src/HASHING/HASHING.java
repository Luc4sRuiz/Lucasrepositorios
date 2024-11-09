/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HASHING;
import java.security.MessageDigest;
/**
 *
 * @author Lucas
 */
public class HASHING {
    public static String generarHash(String texto) {
        try {
            // Crear instancia del algoritmo SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            // Aplicar hash al texto (convertido a bytes)
            byte[] hash = digest.digest(texto.getBytes("UTF-8"));
            // Convertir el hash a una cadena hexadecimal
            StringBuilder hashHex = new StringBuilder();
            for (byte b : hash) {
                hashHex.append(String.format("%02x", b));
            }
            return hashHex.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}
