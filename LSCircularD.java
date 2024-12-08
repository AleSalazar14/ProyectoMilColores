/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.feriamilcolores;

/**
 *
 * @author ALE
 */
public class LSCircularD {
    private NodoD p;
    LSCircularD()
    {
    p=null;
    }

    public NodoD getP() {
        return p;
    }

    public void setP(NodoD p) {
        this.p = p;
    }
    public void adifinal(Dibujo a)
    {
    NodoD nue= new NodoD();
    nue.setD (a);
  
    if(getP()==null)
    {
    setP(nue);
    nue.setSig(nue);
    }
    else{
        NodoD r=getP();
        while(r.getSig()!=getP())
            r=r.getSig();
        r.setSig(nue);
        nue.setSig(getP());
    }
    } 
   public void mostrar()
   {
   
   if(getP()!=null)
   
   {
   NodoD r=getP();
   while (r.getSig()!=getP())
   {
      r.getD().mostrar();
   }
           r.getD().mostrar();
   }
           }
}
    

