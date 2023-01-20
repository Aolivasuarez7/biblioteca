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
