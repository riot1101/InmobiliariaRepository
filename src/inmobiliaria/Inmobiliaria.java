/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author CES
 */
public class Inmobiliaria {
    private HashMap<String, Vivienda> viviendas = new HashMap<>();
    
    public boolean insertarVivienda(Vivienda vivienda){
        if (vivienda!=null && 
                !viviendas.containsKey(vivienda.getCodigo())){
            //insertar vivienda en el mapa
            viviendas.put(vivienda.getCodigo(), vivienda);
            return true;
        }
        return false;
    }
    
    public ArrayList<Vivienda> getViviendas(){
        //this.viviendas.values() devuelve un Collection con los objetos
        //vivienda del hashmap
        ArrayList<Vivienda> viviendas = new ArrayList();
        //añadir todas las viviendas del collection al arraylist
        viviendas.addAll(this.viviendas.values());
        return viviendas;
    }
    
    public boolean borrarVivienda(String codigo){
        if(viviendas.containsKey(codigo)){
            viviendas.remove(codigo);
            return true;
        }
        return false;
    }
    
    public Vivienda getVivienda(String codigo){
        return viviendas.get(codigo);
    }
}
