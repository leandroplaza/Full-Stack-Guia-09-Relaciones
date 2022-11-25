/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author ezepl
 */
public class RevolverDeAgua {

    int posicionActual;
    int posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

   
    public void llenarRevolver() {
        posicionActual = (int) ((Math.random() * 6)+1);
        posicionAgua = (int) ((Math.random() * 6)+1);

    }

    public boolean mojar() {
        boolean mojado = false;
        if (posicionActual == posicionAgua) {
            mojado = true;
        }
        return mojado;
    }

    public void siguienteChorro() {
        if (posicionActual==6) {
            posicionActual=1;
        }else{
            posicionActual++;
        }
    }

    public void mostrar() {
        System.out.println("El tambor esta en la posicion " + posicionActual + " del revolver de agua");
        System.out.println("la posicion del agua en el tambor es: " + posicionAgua);
    }
}
