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
public class Vista {
    public static void menu(){
        System.out.println("1. Alta vivienda");
        System.out.println("2. Baja vivienda");
        System.out.println("3. Consultar vivienda");
        System.out.println("4. Listar viviendas");
        System.out.println("0. Salir");
    }
    
    public static int leerOpcion() {
        return Utils.readUnsignedInt();
    }
    
    public static Vivienda leerVivienda(){
        int tipo = 0;
        Vivienda vivienda = new Vivienda();
        //SELECCIONAR TIPO DE VIVIENDA
        do{
            System.out.println("Selecciona el tipo de vivienda:");
            System.out.println("1. Piso\n2.Chalet");
            tipo = Utils.readUnsignedInt();
        }while(tipo<1 || tipo>2 );
        //DATOS DE PISO O CHALET
        switch(tipo){
            case 1: vivienda = leerPiso();
            break;
            case 2: vivienda = leerChalet();
        }
        //CÓDIGO
        String codigo="";
        do{
            System.out.println("Introduce el código de la vivienda ():");
            if(tipo == 1){
                codigo = Utils.readCodP();
            }else{
                codigo = Utils.readCodC();
            }
        }while(codigo.isEmpty());
        vivienda.setCodigo(codigo);
        
        //PRECIO
        do{
            System.out.println("Introduce el precio: ");
            vivienda.setPrecio(Utils.readUnsignedDouble());
        }while(vivienda.getPrecio()<0);
        
        //DIRECCION
        System.out.println("Introduce la dirección: ");
        vivienda.setDireccion(Utils.readString());
        
        //ESTANCIAS
        int estancias = 0;
        //pedir nº de estancias
        do{
            System.out.println("Introduce nº de estancias: ");
            estancias = Utils.readUnsignedInt();
        }while(estancias<1);
        //pedir las estancias y añadirlas al array
        for (int i = 0; i < estancias; i++) {
            Estancia estancia = leerEstancia();
            //array dentro de vivienda
            vivienda.addEstancia(estancia);
        }
        
        return vivienda;
    }
    
    public static Estancia leerEstancia(){
        int metros = 0;
        int tipo = 0;
        Estancia estancia = new Estancia();
        //seleccionar tipo de estancia
        do{
            System.out.println("Selecciona el tipo de estancia:");
            System.out.println("1. Terraza\n2.Interior");
            tipo = Utils.readUnsignedInt();
        }while(tipo<1 || tipo>2 );
        //instanciar y pedir datos de terraza o interior
        switch(tipo){
            case 1: 
                estancia = leerTerraza();
                break;
            case 2: 
                estancia = leerInterior();
                break;
        }
        //pedir metros cuadrados
        do{
            System.out.println("Introduce los metros cuadrados: ");
            metros = Utils.readUnsignedInt();
        }while(metros<=0);
        estancia.setMetros(metros);
        return estancia;
    }
    
    public static Terraza leerTerraza(){
        Terraza terraza = new Terraza();
        System.out.println("1. Está cerrada\nOtro. No está cerrada");
        terraza.setCerrada(Utils.readUnsignedInt()==1);
        return terraza;
    }
    
    public static Interior leerInterior(){
        Interior interior = new Interior();
        System.out.println("1. Está amueblada\nOtro. No está amueblada");
        interior.setAmueblada(Utils.readUnsignedInt()==1);
        return interior;
        
    }
    
    public static Piso leerPiso(){
        Piso piso = new Piso();
        int planta = 0;
        do{
            System.out.println("Nº de planta:");
            planta = Utils.readUnsignedInt();
        }while(planta<0);
        
        piso.setPlanta(planta);
        
        //otra forma de hacerlo:
        /*
        do{
            System.out.println("Nº de planta:");
            piso.setPlanta(Utils.readUnsignedInt());
        }while(piso.getPlanta()<0); */
        System.out.println("1. Tiene ascensor\nOtro. Sin ascensor");
        piso.setAscensor(Utils.readUnsignedInt()==1);
        return piso;
    }
    
    public static Chalet leerChalet(){
        Chalet chalet = new Chalet();
        //pedir metros cuadrados jardín
        int mJardin = 0;
        do{
            System.out.println("Metros cuadrados jardín");
            mJardin = Utils.readUnsignedInt();
        }while(mJardin<0);
        chalet.setMetrosJardin(mJardin);
        //pedir piscina
        System.out.println("1. Tiene piscina\nOtro. Sin piscina");
        chalet.setPiscina(Utils.readUnsignedInt()==1);
        return chalet;
    }

    public static void showVivienda(Vivienda vivienda) {
        if(vivienda!=null){
            System.out.println(vivienda);
        }else{
            System.out.println("No hay información asociada");
        }
    }
    
    public static void showEstancias(ArrayList<Estancia> estancias){
        for (Estancia estancia : estancias) {
            System.out.println(estancia);
        }
    }
    
    public static String readCodigo(){
        String codVivienda = "";
        do{
            System.out.println("Introduce el código de la vivienda(P o C seguido de 3 dígitos): ");
            codVivienda = Utils.readCodVivienda();
        }while(codVivienda.isEmpty());
        return codVivienda;
    }
    
    public static void showResult(boolean result){
        if(result){
            System.out.println("La operación se ha relizado correctamente");
        }else{
            System.out.println("Algo no ha salido bien");
        }
    }
    
}
