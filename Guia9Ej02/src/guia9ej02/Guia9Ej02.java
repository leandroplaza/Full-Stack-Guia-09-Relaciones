/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej02;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ezepl
 */
public class Guia9Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RevolverDeAgua rev = new RevolverDeAgua();
        Jugador nombre = new Jugador();
        List<Jugador> jug = new ArrayList();
        jug = nombre.cantidadJugadores();
        Juego play = new Juego();
        rev.llenarRevolver();
        rev.mostrar();
        play.llenarJuego(jug, rev);
        play.ronda();
  
    }
}
