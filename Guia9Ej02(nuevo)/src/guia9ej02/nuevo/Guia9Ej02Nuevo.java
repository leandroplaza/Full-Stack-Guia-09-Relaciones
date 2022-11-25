/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej02.nuevo;

import Servicios.serviciosRevolver;

/**
 *
 * @author ezepl
 */
public class Guia9Ej02Nuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
serviciosRevolver servRev=new serviciosRevolver();

servRev.crearJugadores();

servRev.llenarRevolver();
servRev.llenarJuego();
servRev.ronda();
    }
    
}
