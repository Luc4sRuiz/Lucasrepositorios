/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BASEDEDATOS.TP1.EJERCICIO2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class Publicacion {

    private Usuario autor;
    private String contenido;
    private List<Comentario> comentarios;
    private List<Valoracion> valoraciones;

    public Publicacion(Usuario autor, String contenido) {
        this.autor = autor;
        this.contenido = contenido;
        this.comentarios = new ArrayList<>();
        this.valoraciones = new ArrayList<>();
    }

    public void agregarComentario(Usuario usuario, String texto) {
        comentarios.add(new Comentario(usuario, texto));
        autor.agregarNotificacion(usuario.getNombre() + " comentó tu publicación.");
    }

    public void agregarValoracion(Usuario usuario, int puntuacion) {
        valoraciones.add(new Valoracion(usuario, puntuacion));
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public List<Valoracion> getValoraciones() {
        return valoraciones;
    }

    public String getContenido() {
        return contenido;
    }
}

