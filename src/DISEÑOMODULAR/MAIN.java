/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DISEÑOMODULAR;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class MAIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String name = scanner.nextLine();
        
        System.out.print("Ingrese el saldo inicial: ");
        double initialBalance = scanner.nextDouble();
        
        CUSTOMER customer = new CUSTOMER(name, initialBalance);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nOperaciones disponibles:");
            System.out.println("1. Depósito");
            System.out.println("2. Retiro");
            System.out.println("3. Ver saldo");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double depositAmount = scanner.nextDouble();
                    customer.getAccount().deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double withdrawAmount = scanner.nextDouble();
                    customer.getAccount().withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Saldo actual: " + customer.getAccount().getBalance());
                    break;
                case 4:
                    exit = true;
                    System.out.println("Gracias por usar el sistema bancario.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
        scanner.close();
    }
}

