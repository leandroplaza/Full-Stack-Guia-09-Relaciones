/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author ezepl
 */
public class Jugador {
   private int id;
   private String jugador;
   private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, String jugador, boolean mojado) {
        this.id = id;
        this.jugador = jugador;
        this.mojado = mojado;
    }

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

   
    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", jugador=" + jugador + ", mojado=" + mojado + '}';
    }
    
    
            
}
