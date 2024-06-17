package com.example.refactor2.consola;

import java.util.Scanner;
import com.example.refactor2.logica.Logica;

public class Menu {
    public static void menu() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
        System.out.println(
                "    Bienvenidos a la Liga BETPLAY 2.0   \n       Lleva el control y registro      \naccede a nuestras nuevas actualizaciones");

        Logica logica = new Logica();
        Scanner sc = new Scanner(System.in);
        int rta;

        do {
            System.out.println("\n\n\n-   MENU DE OPCIONES   -");
            System.out.println("1. Registros \n2. Registro de fecha\n3. Reportes\n4. Salir\n\nIngresa la selección");
            rta = sc.nextInt();

            switch (rta) {
                // OPCION 1
                case 1:
                    int opcion;
                    System.out.println("REGISTROS\n");
                    System.out.println(
                            "1. Registra Equipo\n2. Registra Cuerpo tecnico\n3. Registra Equipo Medico\n4. Registro jugador\n\nElige una opcion:");
                    opcion = sc.nextInt();

                    switch (opcion) {
                        case 1:
                            logica.registrarEquipo();
                            break;
                        case 2:
                            logica.reET();
                            break;
                        case 3:
                            logica.reEM();
                            break;
                        case 4:
                            logica.reJugador();
                            break;
                        default:
                            if (opcion > 4) {
                                System.out.println("Solo opciones validas");
                            }
                            break;
                    }
                    break;
                // OPCION 2
                case 2:
                    logica.rePar();
                    break;
                // OPCION 3
                case 3:
                    int eleccion;
                    System.out.println("REPORTES\n");
                    System.out.println("1. Jugador con mas goles\n2. Jugador con mas amarillas\n3. Jugador con mas rojas\n4. Listar miembros del equipo medico\n5. Listar miembros del equipo tecnico\n6. Listar jugadores por equipo\n7. Tabla de posiciones\n\nToma tu eleccion: ");
                    eleccion = sc.nextInt();

                    switch (eleccion) {
                        case 1:
                            logica.juMG();
                            break;
                        case 2:
                            logica.juMA();
                            break;
                        case 3:
                            logica.juMR();
                            break;
                        case 4:
                            logica.listCM();
                            break;
                        case 5:
                            logica.listCT();
                            break;
                        case 6:
                            logica.listJu();
                            break;
                        case 7:
                            logica.taPos();
                            break;
                        default:
                            if (eleccion > 7) {
                                System.out.println("Solo opciones del 1 al 7");
                            }
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Muchas gracias por preferir nuestro sistema");
                    break;
                default:
                    if (rta > 4) {
                        System.out.println("Ingresa un numero valido");
                    }
                    break;
            }

        } while (rta != 4);

    }

}
