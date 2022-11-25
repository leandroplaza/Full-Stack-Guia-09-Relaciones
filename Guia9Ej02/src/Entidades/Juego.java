/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ezepl
 */
public class Juego {

    private List<Jugador> players = new ArrayList();
    private RevolverDeAgua rev = new RevolverDeAgua();

    public void llenarJuego(List<Jugador> jugad, RevolverDeAgua r) {

        players = jugad;
        rev = r;

    }

    public void ronda() {

        boolean continua = false;

        do {
        if (players.get(0).disparo(rev)==true) {
            System.out.println("Has sido alcanzado por el chorro");
            continua=true;
        }else
            System.out.println("Zafaste");
            rev.siguienteChorro();
    }    
         while (continua=false);
        }
         
        

}
