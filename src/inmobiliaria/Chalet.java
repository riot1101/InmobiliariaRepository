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
public class Chalet extends Vivienda{
    private int metrosJardin;
    private boolean piscina;

    public Chalet() {
        super();
    }
  
    public Chalet(int metrosJardin, boolean piscina, String codigo, double precio, String direccion) {
        //constructor de Vivienda
        super(codigo, precio, direccion);
        //atributos de Chalet
        this.metrosJardin = metrosJardin;
        this.piscina = piscina;
    }

    @Override
    public String toString() {
        return "Chalet: " + super.toString()+
                " metrosJardin: " + metrosJardin + 
                " piscina: " + (piscina ? "Si" : "No") + 
                " metros: " + this.calcularMetrosTotales();
    }
    
    @Override
    public int calcularMetrosTotales() {
        return super.calcularMetrosTotales() + metrosJardin; 
    }

    public int getMetrosJardin() {
        return metrosJardin;
    }

    public void setMetrosJardin(int metrosJardin) {
        this.metrosJardin = metrosJardin;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }
    
}
