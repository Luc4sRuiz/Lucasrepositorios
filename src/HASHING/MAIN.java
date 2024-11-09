/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HASHING;

import static HASHING.HASHING.generarHash;


/**
 *
 * @author Lucas
 */
public class MAIN {
        public static void main(String[] args) {
        String texto = "clave_secreta";
        String hashGenerado = generarHash(texto);
        System.out.println("Hash en SHA-256: " + hashGenerado);
    }
}





