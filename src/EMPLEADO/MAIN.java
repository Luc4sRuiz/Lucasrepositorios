/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EMPLEADO;

/**
 *
 * @author Lucas
 */
public class MAIN {
    public static void main(String[] args) {
    EMPLEADO empleado1 = new EMPLEADO("Juan Perez", "12345678", 50000);
        DESARROLLADOR desarrollador1 = new DESARROLLADOR("Ana Gomez", "87654321", 60000, "Java", 10);
        GERENTE gerente1 = new GERENTE("Carlos López", "11223344", 70000, 5, 10000);

        System.out.println("Detalles del Empleado:");
        empleado1.mostrarDetalles();

        System.out.println("\nDetalles del Desarrollador:");
        desarrollador1.mostrarDetalles();

        System.out.println("\nDetalles del Gerente:");
        gerente1.mostrarDetalles();
    }

}
