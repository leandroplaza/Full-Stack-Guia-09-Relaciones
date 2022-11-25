/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Scanner;
import perro.Perro;
import persona.Persona;

/**
 *
 * @author ezepl
 */
public class serviciosPerroPersona {

    Scanner leer = new Scanner(System.in);
   
   

    public Perro     crearPerro() {
        Perro b = new Perro();
        System.out.println("Ingrese el nombre de su Perro");
        b.setNombre(leer.next().toUpperCase());
        System.out.println("Ingrese raza del perro");
        b.setRaza(leer.next().toUpperCase());
        System.out.println("Ingrese la edad del perro");
        b.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño de su perro expresado en centimetros");
        b.setTamaño(leer.nextInt());
    return b;
    }

    public Persona crearPersona() {
    
        System.out.println("Ingrese su nombre");
        String nombre=leer.next().toUpperCase();
        System.out.println("Ingrese su apellido");
        String apellido= leer.next().toUpperCase();
        System.out.println("Ingrese su DNI");
        int documento=leer.nextInt();
        System.out.println("Ingrese su edad");
        int edad=leer.nextInt();
        
       
        Perro perro = crearPerro();
        return new Persona(nombre,apellido,edad,documento,perro);
    }
    
   

}
