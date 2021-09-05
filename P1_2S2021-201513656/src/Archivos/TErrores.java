/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

/**
 *
 * @author Kimbe
 */
public class TErrores {
    String lexema,tipo,archivo;
    int linea,columna;

    public TErrores(String lexema, String tipo, String archivo, int linea, int columna) {
        this.lexema = lexema;
        this.tipo = tipo;
        this.archivo = archivo;
        this.linea = linea;
        this.columna = columna;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getLex() {
        return lexema;
    }

    public String getTipo() {
        return tipo;
    }

    public String getArc() {
        return archivo;
    }

    public int getLinea() {
        return linea;
    }

    public int getCol() {
        return columna;
    }
    
    
    
    
}
