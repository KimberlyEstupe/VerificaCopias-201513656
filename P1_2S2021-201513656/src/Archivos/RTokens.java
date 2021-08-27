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
public class RTokens {
    String lexema,token,archivo;
    int linea, columa;

    public RTokens(String lexema, String token, String archivo, int linea, int columa) {
        this.lexema = lexema;
        this.token = token;
        this.archivo = archivo;
        this.linea = linea;
        this.columa = columa;
    }

    public String getLexema() {
        return lexema;
    }

    public String getToken() {
        return token;
    }

    public String getArchivo() {
        return archivo;
    }

    public int getLinea() {
        return linea;
    }

    public int getColuma() {
        return columa;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public void setColuma(int columa) {
        this.columa = columa;
    }
    
    
}
