/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;
import Analizafca.*;
import JFlex.SilentExit;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author Kimbe
 */
public class Pruebas {
    public static void main(String[] args) throws Exception {
        String R1 = "src/Analizadores/";
        String R2="src/Analizafca/LexifcaCUP.flex";
        String[] RS = {"-parser", "Sintac","src/Analizadores/Sintac.cup"};
        String[] RS2 = {"-parser", "Sintacfca","src/Analizafca/Sintacfca.cup"};
        
        AnalizarJS(R1+"LexiJS.flex", R1+"LexiJSCup.flex", RS);
        Analizarfca(R1+"Lexifca.flex",R2,RS2 );
    }
    
    //*********************************** ANALIZADORES LEXICO Y SINTACTICO FCA ***************************************************************
     public static void Analizarfca(String R1,String R2,String[] RS) throws IOException, Exception{
        File archivo;
        archivo = new File(R1);
        JFlex.Main.generate(archivo);
        archivo = new File(R2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(RS);
        
        Path rutaSym = Paths.get("src/Analizafca/sym.java");
        if (Files.exists(rutaSym)) { 
            Files.delete(rutaSym);
        }
        
        Files.move(
                Paths.get("E:/DOCUMENTOS(E)/NetBeans/VerificaCopias-201513656/P1_2S2021-201513656/sym.java"), 
                Paths.get("src/Analizafca/sym.java")
        );        
        
        Path rutaSin = Paths.get("src/Analizafca/Sintacfca.java");
        if (Files.exists(rutaSin)) {
            
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("E:/DOCUMENTOS(E)/NetBeans/VerificaCopias-201513656/P1_2S2021-201513656/Sintacfca.java"), 
                Paths.get("src/Analizafca/Sintacfca.java")
        );
     }
    
    
    //*********************************** ANALIZADORES LEXICO Y SINTACTICO JS ***************************************************************
     public static void AnalizarJS(String R1,String R2,String[] RS) throws IOException, Exception{
        File archivo;
        archivo = new File(R1);
        JFlex.Main.generate(archivo);
        archivo = new File(R2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(RS);
        
        Path rutaSym = Paths.get("src/Analizadores/sym.java");
        if (Files.exists(rutaSym)) { 
            Files.delete(rutaSym);
        }
        
        Files.move(
                Paths.get("E:/DOCUMENTOS(E)/NetBeans/VerificaCopias-201513656/P1_2S2021-201513656/sym.java"), 
                Paths.get("src/Analizadores/sym.java")
        );        
        
        Path rutaSin = Paths.get("src/Analizadores/Sintac.java");
        if (Files.exists(rutaSin)) {
            
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("E:/DOCUMENTOS(E)/NetBeans/VerificaCopias-201513656/P1_2S2021-201513656/Sintac.java"), 
                Paths.get("src/Analizadores/Sintac.java")
        );
     }
    
     //*********************************** ANALIZADO LEXICO JS ***************************************************************
    public static void AnalizadorLexicoJS(){
        String ruta= "src/Analizadores/";
        try {
            String opcFlex[] = {ruta+"LexiJS.flex", "-d", ruta};
            JFlex.Main.generate(opcFlex);
        } catch (SilentExit ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //*********************************** ANALIZADO LEXICO FCA ***************************************************************
    public static void AnalizadorLexicoFCA(){
        String ruta= "src/Analizadores/";
        try {
            String opcFlex[] = {ruta+"Lexifca.flex", "-d", ruta};
            JFlex.Main.generate(opcFlex);
        } catch (SilentExit ex) {
            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
