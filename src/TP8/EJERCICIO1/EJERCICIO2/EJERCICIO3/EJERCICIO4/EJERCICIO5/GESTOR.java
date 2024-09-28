/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8.EJERCICIO1.EJERCICIO2.EJERCICIO3.EJERCICIO4.EJERCICIO5;
 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class GESTOR {
    private List<String> songs;

    public GESTOR() {
        this.songs = new ArrayList<>();
        // Añadiendo canciones de ejemplo
        songs.add("Starboy - Zell");
        songs.add("ROCKSTAR GIRL - DON TOLIVER");
        songs.add("MG - Lara91k");
        songs.add("Otra vez - KHEA");
        songs.add("KFC - Muerejoven");
        songs.add("LA PRIMERA - Dillom");
        songs.add("No hables mas - DAVUS");
    }

    public void addSong(String song) {
        if (songs.contains(song)) {
            System.out.println("La canción '" + song + "' ya existe en la playlist.");
            askToMoveSong(song);
        } else {
            songs.add(song);
            System.out.println("La canción '" + song + "' ha sido añadida a la playlist.");
        }
    }

    private void askToMoveSong(String song) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Desea moverla al final de la lista? (Sí/No): ");
        String move = scanner.nextLine().trim().toLowerCase();
        if (move.equals("sí")) {
            songs.remove(song);  // Eliminar la canción de su posición actual
            songs.add(song);     // Añadirla al final de la lista
            System.out.println("La canción '" + song + "' ha sido movida al final de la playlist.");
        } else {
            System.out.println("No se ha movido la canción.");
        }
    }

    public void showPlaylist() {
        if (songs.isEmpty()) {
            System.out.println("La playlist está vacía.");
        } else {
            System.out.println("Playlist actual:");
            for (int i = 0; i < songs.size(); i++) {
                System.out.println((i + 1) + ". " + songs.get(i));
            }
        }
    }
}

