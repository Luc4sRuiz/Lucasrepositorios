/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EMPLEADO;

/**
 *
 * @author Lucas
 */
public class EMPLEADO {
    protected String nombre;
    protected String dni;
    protected double salarioBase;

    public EMPLEADO(String nombre, String dni, double salarioBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.salarioBase = salarioBase;
    }

    // Método para calcular el salario, aquí se deja el salario base sin cambios
    public double calcularSalario() {
        return salarioBase;
    }

    // Método para mostrar detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Salario Base: " + salarioBase);
    }
}

