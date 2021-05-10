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
public class Interior extends Estancia{
    private boolean amueblada;

    public Interior() {
        super();
    }

    public Interior(boolean amueblada, int metros) {
        //constructor de Estancia:
        super(metros);
        //atributos de Interior:
        this.amueblada = amueblada;
    }

    public boolean isAmueblada() {
        return amueblada;
    }

    public void setAmueblada(boolean amueblada) {
        this.amueblada = amueblada;
    }

    @Override
    public String toString() {
        return "Interior - "+super.toString() + " amueblada: " + (amueblada?"Si":"No");
    }
    
    
}
