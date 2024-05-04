/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3ejercicio1;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class TP3EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int Microondas;
        int Lavarropa;
        int Heladera;
        int Cocina;
        int Cafetera;
        System.out.println("ingrese la cantidad de energia anual para conocer el ahorro: ");
        double energiaanual = leer.nextDouble();
        energiaanual = Math.sqrt(energiaanual);
        System.out.println("El ahorro es de: "+energiaanual);
        
        System.out.println("Ingrese el consumo del Microondas");
        Microondas = leer.nextInt();
        System.out.println("Ingrese el consumo del Lavarropa");
        Lavarropa =leer.nextInt();
        System.out.println("Ingrese el consumo de la Heladera");
        Heladera = leer.nextInt();
        System.out.println("Ingrese el consumo de la Cocina");
        Cocina = leer.nextInt();
        System.out.println("Ingrese el consumo de la Cafetera");
        Cafetera = leer.nextInt();
        
        System.out.println("El maximo consumo de los electrodomestico es de: ");
        System.out.println(Math.max(Microondas,Math.max(Lavarropa,Math.max(Heladera,Math.max(Cocina,Cafetera)))));
        System.out.println("El minimo consumo de los electrodomesticos es de:");
        System.out.println(Math.min(Microondas,Math.min(Lavarropa,Math.min(Heladera,Math.min(Cocina,Cafetera)))));
    }
    
}
