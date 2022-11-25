/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ezepl
 */
public class Jugador {

    int id;
    String jugador;
    boolean mojado;
    Scanner leer = new Scanner(System.in);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public List<Jugador> cantidadJugadores() {
        System.out.println("Indique la cantidad de participantes que jugarán Ruleta Rusa de Agua \n (Entre 1 a 6 jugadores)");
        int cantidad = leer.nextInt();
        List<Jugador> cantJug = new ArrayList();
        Jugador jug = new Jugador();
        if (cantidad > 6 || cantidad < 1) {
            for (int i = 0; i < 6; i++) {
                jug.setId(i + 1);
                jug.setJugador("Jugador " + jug.getId());
                cantJug.add(jug);
            }
        } else {
            for (int i = 0; i < cantidad; i++) {
                jug.setId(i + 1);
                jug.setJugador("Jugador " + jug.getId());
                cantJug.add(jug);
            }
        }
        return cantJug;
    }

    public boolean disparo(RevolverDeAgua r) {
        boolean pierde = false;
        do {
            if (r.mojar()) {

                pierde = true;
            } else {
                r.mojar();
                r.siguienteChorro();
            }
        } while (pierde);

        return pierde;
    }
}
