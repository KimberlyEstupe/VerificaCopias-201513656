/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Kimbe
 */
public class Archivo {
    ////////////  Generar Reportes ///////////////
    public void Reportes(String text, String fileName){
        File file = new File(fileName);
        BufferedWriter buffer = null;
        try {
            buffer = new BufferedWriter(new FileWriter(file));
            buffer.write(text);
        } catch (IOException e) {
            System.out.println("Error E/S: "+e);
        }
        finally{
            try {
                buffer.close();                 
                //*************** ABRIR EL ARCHIVO DIRECTAMENTE ************/////////////
                try {
                    File path = new File (fileName);
                    Desktop.getDesktop().open(path);
               }catch (IOException ex) {
                    ex.printStackTrace();
               }
               ///////////////////////////////////////////////////////////////////////////
                
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public void Manuales(String documento){
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + documento);
            System.out.println("Final");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
