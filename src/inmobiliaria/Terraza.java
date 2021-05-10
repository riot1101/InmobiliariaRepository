/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

/**
 *
 * @author CES
 */
public class Terraza extends Estancia{
    private boolean cerrada;

    public Terraza() {
        super();
    }

    public Terraza(boolean cerrada, int metros) {
        //constructor de Estancia:
        super(metros);
        //atributos de Terraza: 
        this.cerrada = cerrada;
    }

    public boolean isCerrada() {
        return cerrada;
    }

    public void setCerrada(boolean cerrada) {
        this.cerrada = cerrada;
    }

    @Override
    public String toString() {
        return "Terraza - " +super.toString()+ " cerrada: " + (cerrada?"Si":"No");
    }
    
}
