package com.example.refactor2.equipos;
import com.example.refactor2.persona.Jugador;
import com.example.refactor2.persona.Tecnico;
import com.example.refactor2.persona.Medico;
import com.example.refactor2.partido.Partido;
import java.util.List;

public class Equipos {
    String nombreEquipo;
    int pJugados;
    int pGanados;
    int pPerdidos;
    int pEmpates;
    int gFavor;
    int gContra;
    int tPuntos;
    public List<Jugador> jugadores;
    public List<Tecnico> eTecnicos;
    public List<Medico> eMedicos;
    public List<Partido> partidos;

    public Equipos() {
    }

    public Equipos(String nombreEquipo, int pJugados, int pGanados, int pPerdidos, int pEmpates, int gFavor,
            int gContra, int tPuntos, List<Jugador> jugadores, List<Tecnico> eTecnicos, List<Medico> eMedicos,List<Partido> partidos) {
        this.nombreEquipo = nombreEquipo;
        this.pJugados = pJugados;
        this.pGanados = pGanados;
        this.pPerdidos = pPerdidos;
        this.pEmpates = pEmpates;
        this.gFavor = gFavor;
        this.gContra = gContra;
        this.tPuntos = tPuntos;
        this.jugadores = jugadores;
        this.eTecnicos = eTecnicos;
        this.eMedicos = eMedicos;
        this.partidos = partidos;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    public int getpJugados() {
        return pJugados;
    }
    public void setpJugados(int pJugados) {
        this.pJugados = pJugados;
    }
    public int getpGanados() {
        return pGanados;
    }
    public void setpGanados(int pGanados) {
        this.pGanados = pGanados;
    }
    public int getpPerdidos() {
        return pPerdidos;
    }
    public void setpPerdidos(int pPerdidos) {
        this.pPerdidos = pPerdidos;
    }
    public int getpEmpates() {
        return pEmpates;
    }
    public void setpEmpates(int pEmpates) {
        this.pEmpates = pEmpates;
    }
    public int getgFavor() {
        return gFavor;
    }
    public void setgFavor(int gFavor) {
        this.gFavor = gFavor;
    }
    public int getgContra() {
        return gContra;
    }
    public void setgContra(int gContra) {
        this.gContra = gContra;
    }
    public int gettPuntos() {
        return tPuntos;
    }
    public void settPuntos(int tPuntos) {
        this.tPuntos = tPuntos;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List<Tecnico> geteTecnicos() {
        return eTecnicos;
    }

    public void seteTecnicos(List<Tecnico> eTecnicos) {
        this.eTecnicos = eTecnicos;
    }

    public List<Medico> geteMedicos() {
        return eMedicos;
    }

    public void seteMedicos(List<Medico> eMedicos) {
        this.eMedicos = eMedicos;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }
}
