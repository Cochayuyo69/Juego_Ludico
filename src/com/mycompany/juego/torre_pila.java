
package com.mycompany.juego;

public class torre_pila {
    
    private int SLContNodo = 0;
    private torre_nodo cabeza;

    public int getSLContNodo() {
        return SLContNodo;
    }

    public torre_nodo getCabeza() {
        return cabeza;
    }
    
    public void Push(torre_nodo K){
        SLContNodo++;
        if (cabeza == null){
            cabeza = K;
        }else{
            K.setAbajo(cabeza);
            cabeza.setArriba(K);
            
            cabeza = K;
        }
    }
    
    public void Pop(){
        if (SLContNodo>0){
            SLContNodo--;
            cabeza = cabeza.getAbajo();
        }
    }
    
    public String Peek(){
        return cabeza.getDato();
    }
    
}
