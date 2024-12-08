/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.feriamilcolores;

/**
 *
 * @author ALE
 */
public class NodoEx {
    private Expositor expositor;
    private NodoEx ant, sig;
    
    NodoEx(){
        ant=null;
        sig=null;
    }

    public Expositor getExpositor() {
        return expositor;
    }

    public void setExpositor(Expositor expositor) {
        this.expositor = expositor;
    }

    public NodoEx getAnt() {
        return ant;
    }

    public void setAnt(NodoEx ant) {
        this.ant = ant;
    }

    public NodoEx getSig() {
        return sig;
    }

    public void setSig(NodoEx sig) {
        this.sig = sig;
    }
    
    
}
