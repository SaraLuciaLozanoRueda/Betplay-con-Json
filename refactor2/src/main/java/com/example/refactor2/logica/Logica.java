package com.example.refactor2.logica;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import com.example.refactor2.equipos.Equipos;
import com.example.refactor2.partido.Partido;
import com.example.refactor2.persona.Medico;
import com.example.refactor2.persona.Tecnico;
import com.example.refactor2.persona.Jugador;
import com.example.refactor2.data.Core;
import java.util.Scanner;

public class Logica {
    public List<Equipos> equipos;
    public List<Medico> eMedicos;
    public List<Tecnico> eTecnicos;
    public List<Jugador> jugadores;
    public List<Partido> partidos;
    Core core = new Core();
    Scanner sc = new Scanner(System.in);

    public Logica() {
        this.equipos = new ArrayList<>();
        this.eMedicos = new ArrayList<>();
        this.eTecnicos = new ArrayList<>();
        this.jugadores = new ArrayList<>();
        this.partidos = new ArrayList<>();
    }

    // REGISTROS
    public boolean veriE(String nombreEquipo) {// veriE = VERIFICAR LA EXISTENCIA DE UN EQUIPO
        for (Equipos equipo : equipos) {
            if (equipo.getNombreEquipo().equals(nombreEquipo)) {
                return true;
            }
        }
        return false;
    }

    public void registrarEquipo() {
        System.out.println("Equipo");
        System.out.println("Registre el nombre del equipo: ");
        String nombreEquipo = sc.next();
        Equipos equipoNuevo = new Equipos(nombreEquipo, 0, 0, 0, 0, 0, 0, 0, jugadores, eTecnicos, eMedicos, partidos);
        core.create(equipoNuevo);
    }

    public void reET() {// reET = REGISTRAR EQUIPO tecnico
        System.out.println("Tecnicos");
        System.out.println("Registrar el nombre del equipo");
        String ne = sc.next();
        Equipos equipo = Encontrar(ne);

        if (equipo != null) {
            System.out.println("Registrar el id del Tecnico");
            int it = sc.nextInt();
            System.out.println("Nombre del miembro del equipo tecnico ");
            String nt = sc.next();// Nombre tecnico = nt
            System.out.println("Apellido del miembro del equipo tecnico");
            String at = sc.next();// Apellido tecnico = at
            System.out.println("Edad del miembro del equipo tecnico");
            int et = sc.nextInt();
            System.out.println("Rol del miembro del equipo tecnico");
            String rt = sc.next();// Rol del tecnico = rt
            System.out.println("Nacionalidad del miembro del equipo tecnico");
            String nat = sc.next();// Nacionalidad tecnico = nat
            System.out.println("Años de experiencia");
            int aet = sc.nextInt();
            Tecnico actualizarT = new Tecnico(ne, it, nt, at, et, rt, nat, aet);

            equipo.geteTecnicos().add(actualizarT);
            core.update(equipo);
        } else {
            System.out.println("Equipo no existe");
        }

    }

    public void reEM() { // reEM = REGISTRO EQUIPO medicos
        System.out.println("Medicos");
        System.out.println("Registra el nombre del equipo");
        String ne = sc.next();
        Equipos equipo = Encontrar(ne);

        if (equipo != null) {
            System.out.println("Id del medico");
            int im = sc.nextInt();
            System.out.println("Nombre del miembro del equipo Medico ");
            String nm = sc.next();// Nombre medico = nm
            System.out.println("Apellido del miembro del equipo Medico");
            String am = sc.next();// Apellido Medico = am
            System.out.println("Edad del medico");
            int em = sc.nextInt();
            System.out.println("Rol del miembro del equipo Medico");
            String rm = sc.next();// Rol del Medico = rm
            System.out.println("Nacionalidad del miembro del equipo Medico");
            String nam = sc.next();// Nacionalidad Medico = nam
            System.out.println("Afiliacion a Eps");
            String afm = sc.next();
            Medico actulizarM = new Medico(ne, im, nm, am, em, rm, nam, afm);

            equipo.geteMedicos().add(actulizarM);
            core.update(equipo);
        } else {
            System.out.println("Equipo no existe");
        }
    }

    public void reJugador() {// reJugador = REGISTRAR UGADORES
        System.out.println("\n\n\nREGISTRO DE JUGADORES");
        while (true) {
            System.out.println("Desea ingresar un jugador... Si o No");
            String rta = sc.next();

            if (!rta.equalsIgnoreCase("SI")) {
                break;
            } else {
                System.out.println("Registra el nombre del equipo");
                String ne = sc.next();
                Equipos equipo = Encontrar(ne);

                if (equipo != null) {
                    System.out.println("Id del jugador");
                    int im = sc.nextInt();
                    System.out.println("Nombre del jugador ");
                    String nm = sc.next();
                    System.out.println("Apellido del jugador");
                    String am = sc.next();
                    System.out.println("Edad del jugador");
                    int em = sc.nextInt();
                    System.out.println("Rol del jugador");
                    String rm = sc.next();
                    System.out.println("Nacionalidad del jugador");
                    String nam = sc.next();
                    System.out.println("\n\n******** FALTAS *********\n");
                    System.out.println("Cantidad de rojas jugador");
                    int tr = sc.nextInt();
                    System.out.println("cantidad de tarjetas amarillas");
                    int ta = sc.nextInt();
                    System.out.println("Goles que anoto");
                    int ga = sc.nextInt();
                    System.out.println("Numero de camisa del jugador");
                    int nc = sc.nextInt();
                    Jugador actulizarJ = new Jugador(ne, im, nm, am, em, rm, nam, tr, ta, ga, nc);

                    equipo.getJugadores().add(actulizarJ);
                    core.update(equipo);
                } else {
                    System.out.println("Equipo no existe");
                }
            }

        }

    }

    // REGISTROS DE FECHAS
    public Equipos Encontrar(String nombreEquipo) {
        List<Equipos> equipos = core.upload();
        for (Equipos equipo : equipos) {
            if (equipo.getNombreEquipo().equals(nombreEquipo)) {
                return equipo;
            }
        }
        return null;
    }

    public void rePar() {// REGISTRAR PARTIDOS

        System.out.println("Registro del partido");
        System.out.println("Ingrese la fecha del partido (DD/MM/YYYY):");
        String fecha = sc.next();
        System.out.println("Nombre del equipo local");
        String local = sc.next();
        System.out.println("Nombre del equipo visitante");
        String visitante = sc.next();
        System.out.println("Ingrese el marcador del equipo local");
        int marc1 = sc.nextInt();
        System.out.println("Ingrese el marcador del equipo visitante");
        int marc2 = sc.nextInt();

        Equipos eLocal = Encontrar(local);
        Equipos eVisit = Encontrar(visitante);

        if (eLocal != null && eVisit != null) {
            if (marc1 > marc2) {

                eLocal.setpJugados(eLocal.getpJugados()+1);
                eLocal.setpGanados(eLocal.getpGanados()+1);
                eLocal.setgFavor(eLocal.getgFavor() + marc1);
                eLocal.setgContra(eLocal.getgContra()+marc2);
                eLocal.settPuntos(eLocal.gettPuntos()+3);

                eVisit.setpPerdidos(eVisit.getpPerdidos()+1);
                eVisit.setpJugados(eVisit.getpJugados()+1);
                eVisit.setgFavor(eVisit.getgFavor()+ marc2);
                eVisit.setgContra(eVisit.getgContra()+ marc1);

            } else if (marc2 > marc1) {

                eVisit.setpJugados(eVisit.getpJugados()+1);
                eVisit.setpGanados(eVisit.getpGanados()+1);
                eVisit.setgFavor(eVisit.getgFavor() + marc2);
                eVisit.setgContra(eVisit.getgContra()+marc1);
                eVisit.settPuntos(eVisit.gettPuntos()+3);

                eLocal.setpPerdidos(eLocal.getpPerdidos()+1);
                eLocal.setpJugados(eLocal.getpJugados()+1);
                eLocal.setgFavor(eLocal.getgFavor()+ marc1);
                eLocal.setgContra(eLocal.getgContra()+ marc2);

            } else if (marc1 == marc2) {
                System.out.println("EMPATE");
                eLocal.setpJugados((eLocal.getpJugados())+1);
                eVisit.setpJugados(eVisit.getpJugados() + 1);
                eLocal.setpEmpates(eLocal.getpEmpates()+1);
                eVisit.setpEmpates(eVisit.getpEmpates()+1);
                eLocal.settPuntos(eLocal.gettPuntos()+1);
                eVisit.settPuntos(eVisit.gettPuntos()+1);
            }
            Partido actuPartido = new Partido(fecha, marc1, marc2, local, visitante);

            eLocal.getPartidos().add(actuPartido);
            eVisit.getPartidos().add(actuPartido);
            core.update(eLocal);
            core.update(eVisit);

        } else if (eLocal == null) {
            System.out.println("Equipo local no existente");
        } else if (eVisit == null) {
            System.out.println("Equipo visitante no existente");
        } else {
            System.out.println("Ambos equipos no existen");
        }
    }

    // REPORTES
    public void juMG() {//JUGADOR CON MAS GOLES
        Jugador jMG = null;
        int mG = 0;
        for (Equipos equipo : core.getEquipos()) {
            for (Jugador jugador : equipo.getJugadores()) {
                if (jugador.getgAnotados() > mG) {
                    mG = jugador.getgAnotados();
                    jMG = jugador;
                }
            }
        }
        System.out.println("Jugador con más goles: " + jMG.getNombre() + " con " + mG + " goles");
    }

    public void juMA() {//JUGADOR CON MAS AMARILLAS
        Jugador jMA = null;
        int mA = 0;
        for (Equipos equipo : core.getEquipos()) {
            for (Jugador jugador : equipo.getJugadores()) {
                if (jugador.getAmarillas() > mA) {
                    mA = jugador.getAmarillas();
                    jMA = jugador;
                }
            }
        }
        System.out.println("Jugador con más amarillas: " + jMA.getNombre() + " con " + mA + " amarillas");
    }

    public void juMR() {//JUGADOR CON MAS ROJAS
        Jugador jMR = null;
        int mR = 0;
        for (Equipos equipo : core.getEquipos()) {
            for (Jugador jugador : equipo.getJugadores()) {
                if (jugador.getRojas() > mR) {
                    mR = jugador.getRojas();
                    jMR = jugador;
                }
            }
        }
        System.out.println("Jugador con más amarillas: " + jMR.getNombre() + " con " + mR + " amarillas");
    }

    public void listCM(){//LISTAR CUERPO MEDICO
        for (Equipos equipo : core.getEquipos()) {
            for(Medico medico : equipo.geteMedicos()){
                System.out.println(MessageFormat.format("Nombre equipo: {0}\nId del miembro del equipo medico: {1}\nNombre del miembro del equipo medico: {2}\nApellido del miembro del equipo medico: {3}\nEdad del miembro del equipo medico: {4}\nRol del miembro del equipo medico: {5}\nNacionalidad del miembro del equipo medico: {6}\nAfiliacion de EPS del miembro del equipo medico: {7}\n\n\n", medico.getNombreEquipo(),medico.getId(),medico.getNombre(),medico.getApellido(),medico.getEdad(),medico.getRol(),medico.getNacionalidad(),medico.getaEps()));
            }
        }
    }

    public void listCT(){//LISTAR CUERPO TECNICO
        for (Equipos equipo : core.getEquipos()) {
            for(Tecnico tecnico : equipo.geteTecnicos()){
                System.out.println(MessageFormat.format("Nombre equipo: {0}\nId del miembro del equipo tecnico: {1}\nNombre del miembro del equipo tecnico: {2}\nApellido del miembro del equipo tecnico: {3}\nEdad del miembro del equipo tecnico: {4}\nRol del miembro del equipo tecnico: {5}\nNacionalidad del miembro del equipo tecnico: {6}\nAños de experiencia del miembro del equipo tecnico: {7}\n\n\n", tecnico.getNombreEquipo(),tecnico.getId(),tecnico.getNombre(),tecnico.getApellido(),tecnico.getEdad(),tecnico.getRol(),tecnico.getNacionalidad(),tecnico.getaExperiencia()));
            }
        }
    }

    public void listJu(){//LISTAR JUGADORES POR EQUIPO
        for (Equipos equipo : core.getEquipos()) {
            for (Jugador jugador : equipo.getJugadores()) {
                System.out.println(MessageFormat.format("Nombre equipo: {0}\nId del miembro del jugador: {1}\nNombre del miembro del jugador: {2}\nApellido del miembro del jugador: {3}\nEdad del miembro del jugador: {4}\nRol del miembro del jugador: {5}\nNacionalidad del miembro del jugador: {6}\nCantidad de rojas: {7}\nCantidad de amarillas: {8}\nCantidad que anoto: {9}\nNumero de camiseta: {10}\n\n\n", jugador.getNombreEquipo(),jugador.getId(),jugador.getNombre(),jugador.getApellido(),jugador.getEdad(),jugador.getRol(),jugador.getNacionalidad(),jugador.getRojas(),jugador.getAmarillas(),jugador.getgAnotados(),jugador.getNumeroC()));
            }
        }
    }

    public void taPos() {
        System.out.println("------------------ \nTABLA DE POSICIONES\n------------------ ");
    
        List<Equipos> equipos = core.getEquipos();
    
        // Ordenar los equipos por puntuación total de mayor a menor
        equipos.stream()
               .sorted((equipo1, equipo2) -> equipo2.gettPuntos() - equipo1.gettPuntos())
               .forEachOrdered(equipo -> System.out.println( equipo.getNombreEquipo() + ": " + equipo.gettPuntos() + " puntos"));
    }
    
}
