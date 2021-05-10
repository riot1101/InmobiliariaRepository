/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

import java.util.ArrayList;

/**
 *
 * @author CES
 */
public class Controlador {
    public void run(){
        Inmobiliaria inmobiliaria = new Inmobiliaria();
        int opc = 0;
        do{
            Vista.menu();
            opc = Vista.leerOpcion();
            switch(opc){
                case 1: 
                    //pedir datos de la vivienda
                    Vivienda vivienda = Vista.leerVivienda();
                    //insertar vivienda
                    inmobiliaria.insertarVivienda(vivienda);
                    break;
                case 2: 
                    String codVivienda = Vista.readCodigo();
                    boolean result = inmobiliaria.borrarVivienda(codVivienda);
                    Vista.showResult(result);
                    
                    //Vista.showResult(inmobiliaria.borrarVivienda(Vista.readCodigo()));
                    
                    break;
                case 3: 
                    Vivienda viv = inmobiliaria.getVivienda(Vista.readCodigo());
                    Vista.showVivienda(viv);
                    Vista.showEstancias(viv.getEstancias());
                    break;
                case 4: 
                    ArrayList<Vivienda> viviendas = inmobiliaria.getViviendas();
                    for (Vivienda v : viviendas) {
                        Vista.showVivienda(v);
                    }
                    break;
                default: break;
            }
        }while(opc!=0);
    }
}
