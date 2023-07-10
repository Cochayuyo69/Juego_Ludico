package com.mycompany.juego;

public class torre_nodo {
 
    private String Dato;
    private torre_nodo Arriba;
    private torre_nodo Abajo;  

    public String getDato() {
        return Dato;
    }

    public void setDato(String Dato) {
        this.Dato = Dato;
    }

    public torre_nodo getArriba() {
        return Arriba;
    }

    public void setArriba(torre_nodo Arriba) {
        this.Arriba = Arriba;
    }

    public torre_nodo getAbajo() {
        return Abajo;
    }

    public void setAbajo(torre_nodo Abajo) {
        this.Abajo = Abajo;
    }
    
    
}
