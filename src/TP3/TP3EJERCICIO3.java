/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP3;

/**
 *
 * @author Lucas
 */
public class TP3EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String tweet = "Hola soy @lucas";
        System.out.println("Longitud del tweet: " + calcularLongitud(tweet));
        System.out.println("¿Cumple con el límite de caracteres? " + cumpleLimite(tweet));
        System.out.println("Tweet con hashtag: " + agregarHashtag(tweet, "programacion"));
        System.out.println("Nombre de usuario: " + extraerUsuario(tweet));
    }
    
    // Método para calcular la longitud de un tweet
    public static int calcularLongitud(String tweet) {
        StringBuilder builder = new StringBuilder(tweet);
        return builder.length();
    }
    
    // Método para verificar si un tweet cumple con el límite de caracteres (280)
    public static boolean cumpleLimite(String tweet) {
        StringBuilder builder = new StringBuilder(tweet);
        return builder.length() <= 280;
    }
    
    // Método para agregar un hashtag al final de un tweet
    public static String agregarHashtag(String tweet, String hashtag) {
        StringBuilder builder = new StringBuilder(tweet);
        builder.append(" #").append(hashtag);
        return builder.toString();
    }
    
    // Método para extraer el nombre de usuario de un tweet
    public static String extraerUsuario(String tweet) {
        StringBuilder builder = new StringBuilder(tweet);
        int index = builder.indexOf("@");
        if (index != -1) {
            int endIndex = builder.indexOf(" ", index);
            if (endIndex == -1) {
                endIndex = builder.length();
            }
            return builder.substring(index, endIndex);
        }
        return null;
    }
}
        
    
    

