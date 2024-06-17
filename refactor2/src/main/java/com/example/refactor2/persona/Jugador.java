package com.example.refactor2.persona;

public class Jugador extends Persona{
    int rojas;
    int amarillas;
    int gAnotados;
    int numeroC;

    public Jugador(){
    }
    
    

    public Jugador(String nombreEquipo, int id, String nombre, String apellido, int edad, String rol,
            String nacionalidad, int rojas, int amarillas, int gAnotados, int numeroC) {
        super(nombreEquipo, id, nombre, apellido, edad, rol, nacionalidad);
        this.rojas = rojas;
        this.amarillas = amarillas;
        this.gAnotados = gAnotados;
        this.numeroC = numeroC;
    }



    public int getRojas() {
        return rojas;
    }

    public void setRojas(int rojas) {
        this.rojas = rojas;
    }

    public int getAmarillas() {
        return amarillas;
    }

    public void setAmarillas(int amarillas) {
        this.amarillas = amarillas;
    }

    public int getgAnotados() {
        return gAnotados;
    }

    public void setgAnotados(int gAnotados) {
        this.gAnotados = gAnotados;
    }

    public int getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(int numeroC) {
        this.numeroC = numeroC;
    }

    

}
