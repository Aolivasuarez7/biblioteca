package com.biblio.biblioteca;

import java.sql.Date;

public class Clientes {
    String nombre;
    String apellidos;
    String dni;
    java.sql.Date fechaNac;
    int telefono;
    java.sql.Date fechaAlta;
    String mail;

    @Override
    public String toString() {
        return "Clientes{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNac=" + fechaNac +
                ", telefono=" + telefono +
                ", fechaAlta=" + fechaAlta +
                ", mail='" + mail + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Clientes(String nombre, String apellidos, String dni, Date fechaNac, int telefono, Date fechaAlta, String mail) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.fechaAlta = fechaAlta;
        this.mail = mail;
    }
}
