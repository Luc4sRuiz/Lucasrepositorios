/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7Nº2;
import java.io.*;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author Lucas
 */
    public class SISTEMASDEGESTION {
    private List<PROYECTO> proyectos;
    private List<EMPLEADO> empleados;
    private List<CLIENTE> clientes;

    public SISTEMASDEGESTION() {
        proyectos = new ArrayList<>();
        empleados = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    // Métodos para leer y escribir datos desde/hacia archivos CSV
    public void leerDatosDesdeCSV(String archivoProyectos, String archivoEmpleados, String archivoClientes) throws IOException {
        // Implementar lectura desde archivos CSV
    }

    public void escribirDatosAArchivoCSV(String archivoProyectos, String archivoEmpleados, String archivoClientes) throws IOException {
        // Implementar escritura a archivos CSV
    }

    public void asignarTrabajadorAProyecto(String idProyecto, EMPLEADO empleado) {
        for (PROYECTO proyecto : proyectos) {
            if (proyecto.getCodigo().equals(idProyecto)) {
                proyecto.agregarEmpleado(empleado);
                return;
            }
        }
    }

    public void asignarTareaATrabajador(String idProyecto, String idEmpleado, TAREA tarea) {
        for (PROYECTO proyecto : proyectos) {
            if (proyecto.getCodigo().equals(idProyecto)) {
                for (EMPLEADO empleado : proyecto.getEmpleados()) {
                    if (empleado.getId().equals(idEmpleado)) {
                        proyecto.agregarTarea(tarea);
                        return;
                    }
                }
            }
        }
    }

    public Map<String, Double> generarReporteHorasTrabajadas() {
        Map<String, Double> reporte = new HashMap<>();
        // Implementar generación de reporte de horas trabajadas
        return reporte;
    }

    Object getClientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getEmpleados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getProyectos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


