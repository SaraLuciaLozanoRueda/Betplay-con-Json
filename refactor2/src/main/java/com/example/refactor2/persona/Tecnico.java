package com.example.refactor2.persona;

public class Tecnico extends Persona {
    int aExperiencia;

    public Tecnico(int aExperiencia) {
    }

    

    public Tecnico(String nombreEquipo, int id, String nombre, String apellido, int edad, String rol,
            String nacionalidad, int aExperiencia) {
        super(nombreEquipo, id, nombre, apellido, edad, rol, nacionalidad);
        this.aExperiencia = aExperiencia;
    }



    public int getaExperiencia() {
        return aExperiencia;
    }

    public void setaExperiencia(int aExperiencia) {
        this.aExperiencia = aExperiencia;
    }

    

}
