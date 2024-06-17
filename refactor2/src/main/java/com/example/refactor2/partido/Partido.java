package com.example.refactor2.partido;

public class Partido {
    String fecha;
    int marc1;
    int marc2;
    String local;
    String visitante;
    
    public Partido() {
    }

    public Partido(String fecha, int marc1, int marc2, String local, String visitante) {
        this.fecha = fecha;
        this.marc1 = marc1;
        this.marc2 = marc2;
        this.local = local;
        this.visitante = visitante;
    }

    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public int getMarc1() {
        return marc1;
    }


    public void setMarc1(int marc1) {
        this.marc1 = marc1;
    }


    public int getMarc2() {
        return marc2;
    }

    public void setMarc2(int marc2) {
        this.marc2 = marc2;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    
    
}
