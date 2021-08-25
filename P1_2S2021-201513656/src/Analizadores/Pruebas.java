/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;

import java.util.logging.Level;
import java.util.logging.Logger;
import jflex.exceptions.SilentExit;

/**
 *
 * @author Kimbe
 */
public class Pruebas {
    public static void main(String[] args) {
        AnalizadorJS();
    }
    
    public static void AnalizadorJS(){
        String ruta= "src/Analizadores/";
        try {
            String opcFlex[] = {ruta+"LexiJS.flex", "-d", ruta};
            jflex.Main.generate(opcFlex);
        } catch (SilentExit ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
