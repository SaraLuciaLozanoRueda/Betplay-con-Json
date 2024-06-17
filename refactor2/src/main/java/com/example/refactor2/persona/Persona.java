package com.example.refactor2.persona;

public class Persona {
    String nombreEquipo;
    int id;
    String nombre;
    String apellido;
    int edad;
    String rol;
    String nacionalidad;
    
    public Persona() {
    }

    

    public Persona(String nombreEquipo, int id, String nombre, String apellido, int edad, String rol,
            String nacionalidad) {
        this.nombreEquipo = nombreEquipo;
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.rol = rol;
        this.nacionalidad = nacionalidad;
    }



    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }

    
    
}
