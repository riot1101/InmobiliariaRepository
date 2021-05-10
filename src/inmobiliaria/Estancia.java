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
public class Estancia {
    protected int metros;

    public Estancia() {
    }

    public Estancia(int metros) {
        this.metros = metros;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    @Override
    public String toString() {
        return "Metros: " + metros;
    }
    
}
