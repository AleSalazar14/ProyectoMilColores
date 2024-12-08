/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.feriamilcolores;

/**
 *
 * @author hp
 */
public class LDCircularP {
    private NodoP p;
    
    LDCircularP()
    {
        p=null;
    }        

    public NodoP getP() {
        return p;
    }

    public void setP(NodoP p) {
        this.p = p;
    }
     public void adifinal(Pintura x)
    {
        NodoP nue = new NodoP();
        nue.setP(x);
        if(getP()==null)
        {
            setP(nue);
            nue.setSig(getP());
            nue.setAnt(nue);
            
        }
        else
        {
            NodoP w = getP().getAnt();
            w.setSig(nue);
            nue.setAnt(w);
            nue.setSig(getP());
            getP().setAnt(nue);
        }
    }
    
    public void mostrar()
    {
        if(getP()!=null)
        {
            NodoP r=getP();
            while(r.getSig()!=getP())
            {
                r.getP().mostrar();
                r = r.getSig();
            }
            r.getP().mostrar();
        }
    }
}        

