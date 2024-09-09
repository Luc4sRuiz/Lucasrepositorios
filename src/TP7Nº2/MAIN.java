/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7Nº2;
import java.io.IOException;
import java.time.LocalDate;
/**
 *
 * @author Lucas
 */
public class MAIN {

    public static void main(String[] args) {
        SISTEMASDEGESTION sistema = new SISTEMASDEGESTION();

        // Crear algunos clientes
        CLIENTE cliente1 = new CLIENTE("Cliente A", "Direccion A");
        CLIENTE cliente2 = new CLIENTE("Cliente B", "Direccion B");

        // Agregar clientes al sistema
        sistema.getClientes().equals(cliente1);
        sistema.getClientes().equals(cliente2);

        // Crear algunos empleados
        EMPLEADO desarrollador1 = new Desarrollador("E001", "Juan", 3000, "Java");
        EMPLEADO disenador1 = new DiseñadorUX("E002", "Ana", 2500);
        EMPLEADO gerente1 = new GerenteDeProyectos("E003", "Luis", 4000);

        // Agregar empleados al sistema
        sistema.getEmpleados().equals(desarrollador1);
        sistema.getEmpleados().equals(disenador1);
        sistema.getEmpleados().equals(gerente1);

        // Crear algunos proyectos
        PROYECTO proyecto1 = new PROYECTO("P001", "Proyecto A", LocalDate.of(2024, 9, 1), LocalDate.of(2024, 12, 31), cliente1);
        PROYECTO proyecto2 = new PROYECTO("P002", "Proyecto B", LocalDate.of(2024, 10, 1), LocalDate.of(2024, 11, 30), cliente2);

        // Agregar proyectos al sistema
        sistema.getProyectos().equals(proyecto1);
        sistema.getProyectos().equals(proyecto2);

        // Crear algunas tareas
        TAREA tarea1 = new TAREA("T001", "Desarrollar módulo X", TAREA.Estado.PENDIENTE, LocalDate.of(2024, 9, 2), LocalDate.of(2024, 9, 10), 40);
        TAREA tarea2 = new TAREA("T002", "Diseñar interfaz Y", TAREA.Estado.PENDIENTE, LocalDate.of(2024, 9, 11), LocalDate.of(2024, 9, 20), 30);

        // Asignar tareas a proyectos
        proyecto1.agregarTarea(tarea1);
        proyecto1.agregarTarea(tarea2);

        // Asignar empleados a proyectos
        sistema.asignarTrabajadorAProyecto("P001", desarrollador1);
        sistema.asignarTrabajadorAProyecto("P001", disenador1);

        // Asignar tarea a trabajador
        sistema.asignarTareaATrabajador("P001", "E001", tarea1);
        sistema.asignarTareaATrabajador("P001", "E002", tarea2);

        // Calcular progreso del proyecto
        double progreso = proyecto1.calcularProgreso();
        System.out.println("Progreso del Proyecto P001: " + progreso + "%");

        // Listar tareas pendientes de un trabajador
        System.out.println("Tareas pendientes de Juan:");
        for (TAREA tarea : proyecto1.obtenerTareasPendientes()) {
            System.out.println(tarea.getDescripcion());
        }

        // Generar reporte de horas trabajadas
        try {
            sistema.escribirDatosAArchivoCSV("proyectos.csv", "empleados.csv", "clientes.csv");
        } catch (IOException e) {
            System.out.println("Error al escribir datos a archivos CSV: " + e.getMessage());
        }

        // Leer datos desde archivos CSV (si se necesita)
        try {
            sistema.leerDatosDesdeCSV("proyectos.csv", "empleados.csv", "clientes.csv");
        } catch (IOException e) {
            System.out.println("Error al leer datos desde archivos CSV: " + e.getMessage());
        }
    }
}


