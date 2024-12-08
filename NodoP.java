/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.feriamilcolores;

/**
 *
 * @author hp
 */
public class NodoP {
    private Pintura p;
    private NodoP ant,sig;
    
    NodoP()
    {
       ant=sig=null; 
    }        

    public Pintura getP() {
        return p;
    }

    public void setP(Pintura p) {
        this.p = p;
    }

    public NodoP getAnt() {
        return ant;
    }

    public void setAnt(NodoP ant) {
        this.ant = ant;
    }

    public NodoP getSig() {
        return sig;
    }

    public void setSig(NodoP sig) {
        this.sig = sig;
    }
    
}
