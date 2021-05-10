/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CES
 */
public class Utils {
    public static String readString() {
        try {
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            return br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public static int readUnsignedInt() { 
        int dato = 0;
        try {
            dato = Integer.parseInt(readString());
            dato = Math.abs(dato);
        } catch (Exception ex) {
            dato = -1;
        }
        return dato;
    }
    
    public static double readUnsignedDouble(){
        double dato=0;
        try{
            dato = Double.parseDouble(readString());
            dato = Math.abs(dato);
        }catch(Exception ex){
            dato = -1;
        }
        return dato;
    }
    
    public static String readCodP(){
        String dato = readString();
        //P000 P567
        //^P debe empezar por P
        //[0-9] cualquier digito entre 0 y 9
        //{3} 3 veces
        //$ final
        if (dato.matches("^P[0-9]{3}$")){
            return dato;
        }
        return "";
    }
    public static String readCodC(){
        String dato = readString();
        //C000 C567
        //^C debe empezar por C
        //[0-9] cualquier digito entre 0 y 9
        //{3} 3 veces
        //$ final
        if (dato.matches("^C[0-9]{3}$")){
            return dato;
        }
        return "";
    }
    
    public static String readCodVivienda(){
        String dato = readString();
        if (dato.matches("^(C|P)[0-9]{3}$")){
            return dato;
        }
        return "";
    }
}
