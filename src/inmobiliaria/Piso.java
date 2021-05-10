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
public class Piso extends Vivienda{
    private int planta;
    private boolean ascensor;

    public Piso() {
        super();
    }
    
    public Piso(int planta, boolean ascensor, String codigo, double precio, String direccion) {
        //constructor de vivienda
        super(codigo, precio, direccion);
        this.planta = planta;
        this.ascensor = ascensor;
    }

    @Override
    public String toString() {
        return "Piso: " + super.toString() + 
                " planta: " + planta + 
                " ascensor: " + (ascensor ? "Si":"No") +
                " metros: "+ super.calcularMetrosTotales();
    }
    
    

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public boolean isAscensor() {
        return ascensor;
    }

    public void setAscensor(boolean ascensor) {
        this.ascensor = ascensor;
    }
    
    
    
    
}
