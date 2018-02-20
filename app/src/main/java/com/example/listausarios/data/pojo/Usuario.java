package com.example.listausarios.data.pojo;

import java.util.Date;

/**
 * Created by mamorky on 20/02/18.
 */

public class Usuario {
    private int id;
    private String Nombre;
    private String Apellido;
    private Date fechaNac;

    public Usuario(int id, String nombre, String apellido, Date fechaNac) {
        this.id = id;
        Nombre = nombre;
        Apellido = apellido;
        this.fechaNac = fechaNac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
}
