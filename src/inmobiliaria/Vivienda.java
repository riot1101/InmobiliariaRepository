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
public class Vivienda {
    protected String codigo;
    protected double precio;
    protected String direccion;
    protected ArrayList<Estancia> estancias = new ArrayList();

    public Vivienda() {
    }

    public Vivienda(String codigo, double precio, String direccion) {
        this.codigo = codigo;
        this.precio = precio;
        this.direccion = direccion;
    }
    
    public void addEstancia(Estancia estancia){
        if(estancia!=null){
            this.estancias.add(estancia);
        }
    }
    
    public int calcularMetrosTotales(){
        int metrosTotales = 0;
        for (Estancia estancia : estancias) {
            metrosTotales+=estancia.getMetros();
        }
        return metrosTotales;
    }

    @Override
    public String toString() {
        return "codigo: " + codigo +
                " precio: " + precio + 
                " direccion: " + direccion;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Estancia> getEstancias() {
        return estancias;
    }

    public void setEstancias(ArrayList<Estancia> estancias) {
        this.estancias = estancias;
    }
    
}
