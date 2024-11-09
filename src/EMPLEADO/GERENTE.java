/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EMPLEADO;

/**
 *
 * @author Lucas
 */
public class GERENTE extends EMPLEADO {
     private int antiguedad; // en años
    private double bonusGestion;

    public GERENTE(String nombre, String dni, double salarioBase, int antiguedad, double bonusGestion) {
        super(nombre, dni, salarioBase);
        this.antiguedad = antiguedad;
        this.bonusGestion = bonusGestion;
    }

    // Método para calcular el salario del gerente con antigüedad y bonus
    @Override
    public double calcularSalario() {
        return salarioBase + bonusGestion + antiguedad;
    }

    // Método para mostrar detalles del gerente
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Antigüedad: " + antiguedad + " años");
        System.out.println("Bonus de Gestión: " + bonusGestion);
        System.out.println("Salario Total: " + calcularSalario());
    }
}

