/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8.EJERCICIO1.EJERCICIO2.EJERCICIO3.EJERCICIO4.EJERCICIO5;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class MAIN {
    public static void main(String[] args) {
 
        GESTOR playlist = new GESTOR();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("¿Desea añadir una canción? (Sí/No): ");
                String action = scanner.nextLine().trim().toLowerCase();
                
                if (action.equals("sí")) {
                    System.out.print("Ingrese el nombre de la canción: ");
                    String song = scanner.nextLine();
                    playlist.addSong(song);
                } else if (action.equals("no")) {
                    System.out.println("Saliendo del gestor de playlists.");
                    break;
                } else {
                    System.out.println("Opción no válida. Por favor, ingrese 'Sí' o 'No'.");
                }

                playlist.showPlaylist();  // Mostrar la playlist después de cada acción

            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}


