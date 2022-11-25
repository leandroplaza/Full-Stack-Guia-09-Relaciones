/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Juego;
import entidades.Jugador;
import entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ezepl
 */
public class serviciosRevolver {

    Scanner leer = new Scanner(System.in);
    Revolver rev = new Revolver();
    ArrayList<Jugador> t=new ArrayList();

    Juego jugar = new Juego();

    public void llenarRevolver() {
        rev.setPosicionAgua((int) ((Math.random() * 6) + 1));
        rev.setPosicionTambor((int) ((Math.random() * 6) + 1));
    }

    public void crearJugadores() {
        System.out.println("Ingrese la cantidad de jugadores");
        int cantidad = leer.nextInt();
        for (int i = 0; i < cantidad; i++) {
            Jugador p = new Jugador();
            System.out.println("Ingrese el nombre de l jugador");
            p.setJugador(leer.next());
            System.out.println("Ingrese el ID ");
            p.setId(leer.nextInt());
            p.setMojado(false);
            t.add(p);
        }

    }

    public void siguienteChorro() {
        if (rev.getPosicionTambor() == 6) {
            rev.setPosicionTambor(1);
        } else {
            rev.setPosicionTambor(rev.getPosicionTambor() + 1);
        }

    }

    public boolean mojar() {
        boolean x = false;
        if (rev.getPosicionAgua() == rev.getPosicionTambor()) {
            System.out.println("Mojado");
            x = true;
        } else {
            System.out.println("Zafaste");
        }
        return x;
    }

    public void mostrarChorro() {
        System.out.println("La posición en la que se encuentra el tambor es: " + rev.getPosicionTambor());
        System.out.println("La posición en la que se encuentra el chorro es: " + rev.getPosicionAgua());
    }

    public boolean disparo() {
        boolean muerto = false;
        if (!mojar()) {
            siguienteChorro();

        } else {
            System.out.println("Jugador mojado");
            muerto = true;
        }
        return muerto;
    }

    public void llenarJuego() {
        jugar.setJugadores(t);
        jugar.setR(rev);
    }

    public void ronda() {
        boolean x = false;
        Jugador n=null;
       
        do {
            for (Jugador jugador : t) {
                 mostrarChorro();
                jugador.setMojado(disparo());
                 mostrarChorro();
                if (jugador.isMojado()) {
                    x = true;
                    n = jugador;
                    break;
                } else {
                    System.out.println("Posicion Actual tambor" + rev.getPosicionTambor());
                }
            }
        } while (!x);
        System.out.println("El jugador mojado es : "+n.getJugador());
   
    }
}
