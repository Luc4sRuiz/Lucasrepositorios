/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7Nº2;
import java.time.LocalDate;
/**
 *
 * @author Lucas
 */
public class TAREA {
    public enum Estado { PENDIENTE, EN_PROGRESO, COMPLETADA }

    private String codigo;
    private String descripcion;
    private Estado estado;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int horasEstimadas;

    public TAREA(String codigo, String descripcion, Estado estado, LocalDate fechaInicio, LocalDate fechaFin, int horasEstimadas) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horasEstimadas = horasEstimadas;
    }

    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }
}


