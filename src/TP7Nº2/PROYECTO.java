/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7Nº2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lucas
 */
public class PROYECTO {
    private String codigo;
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaEstimadaFin;
    private CLIENTE cliente;
    private List<EMPLEADO> empleados;
    private List<TAREA> tareas;

    public PROYECTO(String codigo, String nombre, LocalDate fechaInicio, LocalDate fechaEstimadaFin, CLIENTE cliente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaEstimadaFin = fechaEstimadaFin;
        this.cliente = cliente;
        this.empleados = new ArrayList<>();
        this.tareas = new ArrayList<>();
    }

    public void agregarEmpleado(EMPLEADO empleado) {
        empleados.add(empleado);
    }

    public void agregarTarea(TAREA tarea) {
        tareas.add(tarea);
    }

    public double calcularProgreso() {
        int totalTareas = tareas.size();
        int tareasCompletadas = (int) tareas.stream().filter(t -> t.getEstado() == TAREA.Estado.COMPLETADA).count();
        return (totalTareas == 0) ? 0 : (tareasCompletadas / (double) totalTareas) * 100;
    }

    public List<TAREA> obtenerTareasPendientes() {
        List<TAREA> tareasPendientes = new ArrayList<>();
        for (TAREA tarea : tareas) {
            if (tarea.getEstado() == TAREA.Estado.PENDIENTE) {
                tareasPendientes.add(tarea);
            }
        }
        return tareasPendientes;
    }

    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaEstimadaFin() {
        return fechaEstimadaFin;
    }

    public CLIENTE getCliente() {
        return cliente;
    }

    public List<EMPLEADO> getEmpleados() {
        return empleados;
    }

    public List<TAREA> getTareas() {
        return tareas;
    }
}


