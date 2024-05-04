/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP3;

/**
 *
 * @author Lucas
 */
public class TP3EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String password = "Password!12";
        
        if (validarLongitud(password) && contieneDigito(password) && contieneCaracterEspecial(password)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no cumple con los requisitos de seguridad.");
        }
        
        // Construir una contraseña segura
        String nuevaPassword = construirPasswordSegura();
        System.out.println("Nueva contraseña segura generada: " + nuevaPassword);
    }
    
    // Método para verificar si una contraseña tiene al menos 8 caracteres
    public static boolean validarLongitud(String password) {
        return password.length() >= 8;
    }
    
    // Método para comprobar si una contraseña contiene al menos un dígito numérico
    public static boolean contieneDigito(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
    
    // Método para verificar si una contraseña contiene al menos un carácter especial
    public static boolean contieneCaracterEspecial(String password) {
        String caracteresEspeciales = "!@#$%^&*";
        for (char c : password.toCharArray()) {
            if (caracteresEspeciales.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }
    
    // Método para construir una contraseña segura
    public static String construirPasswordSegura() {
        String letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        String caracteresEspeciales = "!@#$%^&*";
        
        StringBuilder passwordBuilder = new StringBuilder();
        
        // Agregar al menos una letra
        passwordBuilder.append(letras.charAt((int)(Math.random() * letras.length())));
        
        // Agregar al menos un número
        passwordBuilder.append(numeros.charAt((int)(Math.random() * numeros.length())));
        
        // Agregar al menos un carácter especial
        passwordBuilder.append(caracteresEspeciales.charAt((int)(Math.random() * caracteresEspeciales.length())));
        
        // Completar la contraseña con caracteres aleatorios
        for (int i = 3; i < 12; i++) { // Se generará una contraseña de 12 caracteres
            String conjunto = letras + numeros + caracteresEspeciales;
            passwordBuilder.append(conjunto.charAt((int)(Math.random() * conjunto.length())));
        }
        
        return passwordBuilder.toString();
    }
}
        
        
        
        
     

    
    

