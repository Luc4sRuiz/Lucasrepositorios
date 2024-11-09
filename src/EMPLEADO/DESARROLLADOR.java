/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EMPLEADO;

/**
 *
 * @author Lucas
 */
public class DESARROLLADOR extends EMPLEADO {
    private String lenguajePrincipal;
    private int horasExtras;
    private final double TARIFA_HORA_EXTRA = 50.0; // Ejemplo: 50 por cada hora extra

    public DESARROLLADOR(String nombre, String dni, double salarioBase, String lenguajePrincipal, int horasExtras) {
        super(nombre, dni, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
        this.horasExtras = horasExtras;
    }

    // Método para calcular el salario del desarrollador con horas extra
    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtras * TARIFA_HORA_EXTRA);
    }

    // Método para mostrar detalles del desarrollador
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Lenguaje Principal: " + lenguajePrincipal);
        System.out.println("Horas Extras: " + horasExtras);
        System.out.println("Salario Total: " + calcularSalario());
    }
}
    
