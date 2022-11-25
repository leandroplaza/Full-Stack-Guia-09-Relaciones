/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import perro.Perro;
import persona.Persona;
import servicios.serviciosPerroPersona;

/**
 *
 * @author ezepl
 */
public class Guia9Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        serviciosPerroPersona serv = new serviciosPerroPersona();
        Persona n1=serv.crearPersona();
        System.out.println(n1);
        Persona n2=serv.crearPersona();
        System.out.println(n2);
       
       

    }

}
