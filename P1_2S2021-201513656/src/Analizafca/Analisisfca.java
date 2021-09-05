/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizafca;
import java.util.ArrayList;
import Analizadores.*;
import java.io.StringReader;
import Analizafca.*;
/**
 *
 * @author Kimbe
 */
public class Analisisfca {
    public static void AnalisisFC(String ST){
        String cadena="";
        Sintacfca AS = new Sintacfca(new Analizafca.LexifcaCUP(new StringReader(ST)));
        
        try {
           AS.parse();
        } catch (Exception ex) {
            System.out.println("ERROR:"+ ex);
        }
        
    }
}
