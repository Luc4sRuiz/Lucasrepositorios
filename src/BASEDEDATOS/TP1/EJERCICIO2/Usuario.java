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
public class Usuario {
     private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String direccion;
    private String correo;
    private String contrasena;
    private Perfil perfil;
    private List<Publicacion> publicaciones;
    private List<Notificacion> notificaciones;
    private List<Usuario> seguidores;
    private List<Usuario> seguidos;
    
    public Usuario(String nombre, String apellido, String fechaNacimiento, String direccion, String correo, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.correo = correo;
        this.contrasena = contrasena;
        this.perfil = new Perfil();
        this.publicaciones = new ArrayList<>();
        this.notificaciones = new ArrayList<>();
        this.seguidores = new ArrayList<>();
        this.seguidos = new ArrayList<>();
        }
    
    public void seguir(Usuario otro) {
        if (!seguidos.contains(otro)) {
            seguidos.add(otro);
            otro.seguidores.add(this);
            otro.agregarNotificacion(nombre + " comenzó a seguirte.");
        }
    }
    public void agregarPublicacion(String contenido) {
        Publicacion pub = new Publicacion(this, contenido);
        publicaciones.add(pub);
    }

    public void agregarNotificacion(String mensaje) {
        notificaciones.add(new Notificacion(mensaje));
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public List<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

