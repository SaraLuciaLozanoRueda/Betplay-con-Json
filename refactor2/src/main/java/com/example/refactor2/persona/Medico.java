package com.example.refactor2.persona;

public class Medico extends Persona {
    String aEps;

    public Medico(){

    }

    

    public Medico(String nombreEquipo, int id, String nombre, String apellido, int edad, String rol,
            String nacionalidad, String aEps) {
        super(nombreEquipo, id, nombre, apellido, edad, rol, nacionalidad);
        this.aEps = aEps;
    }



    public String getaEps() {
        return aEps;
    }

    public void setaEps(String aEps) {
        this.aEps = aEps;
    }

    
    
}
