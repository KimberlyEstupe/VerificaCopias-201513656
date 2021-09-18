/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizaJS;

import java.io.StringReader;

/**
 *
 * @author Kimbe
 */
public class Analisisjs {
    public static void AnalisisJS(String ST){
        //Manda a realizar el analisis sintectico de JS
        Sintac AS = new Sintac(new AnalizaJS.LexiJSCup(new StringReader(ST)));
        try {
           AS.parse();
        } catch (Exception ex) {
            System.out.println("ERROR:"+ ex);
        }
        
    }
}
