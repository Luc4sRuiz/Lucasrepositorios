/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7Nº2;
import java.util.List;

/**
 *
 * @author Lucas
 */
public abstract class EMPLEADO {
    protected String id;
    protected String nombre;
    protected double salario;

    public EMPLEADO(String id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public abstract void calcularSalario();

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
}

class Desarrollador extends EMPLEADO {
    private String lenguaje;

    public Desarrollador(String id, String nombre, double salario, String lenguaje) {
        super(id, nombre, salario);
        this.lenguaje = lenguaje;
    }

    @Override
    public void calcularSalario() {
        // Implementar cálculo específico para desarrolladores
    }

    public String getLenguaje() {
        return lenguaje;
    }
}

class DiseñadorUX extends EMPLEADO {
    public DiseñadorUX(String id, String nombre, double salario) {
        super(id, nombre, salario);
    }

    @Override
    public void calcularSalario() {
        // Implementar cálculo específico para diseñadores UX
    }
}

class GerenteDeProyectos extends EMPLEADO {
    public GerenteDeProyectos(String id, String nombre, double salario) {
        super(id, nombre, salario);
    }

    @Override
    public void calcularSalario() {
        // Implementar cálculo específico para gerentes de proyectos
    }
}


