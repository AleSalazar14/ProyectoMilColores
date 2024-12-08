/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.feriamilcolores;

/**
 *
 * @author hp
 */
public class NodoD {
    private Dibujo d;
    NodoD sig;
    
    NodoD()
    {
        sig=null;
    }        

    public Dibujo getD() {
        return d;
    }

    public void setD(Dibujo d) {
        this.d = d;
    }

    public NodoD getSig() {
        return sig;
    }

    public void setSig(NodoD sig) {
        this.sig = sig;
    }
    
}
