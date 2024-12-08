/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.feriamilcolores;

/**
 *
 * @author hp
 */
public class MultiColaCircularGrabado {
    private CCircularGrabado v[]=new CCircularGrabado[40];
    private int n;
    
    MultiColaCircularGrabado()
    {
        for(int i = 1; i <= 39;i++)
            v[i]=new CCircularGrabado();
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    boolean esvacia(int i)
    {
        return v[i].esvacia();
    }
    boolean esllena(int i)
    {
        return v[i].esllena();
        
    }
    int nroelem(int i)
    {
        return v[i].nroelem();
    }
    void adicionar(Grabado elem, int i)
    {
        v[i].adicionar(elem);
    }
    Grabado eliminar(int i)
    {
        return v[i].eliminar();
    }
    void mostrar(int i)
    {
        v[i].mostrar();
    }
    void mostrar()
    {
        for(int i=1;i<=getN();i++)
        {
            System.out.println("Cola"+i);
            mostrar(i);
        }
    }
    void vaciar(CCircularGrabado Z,int i)
    {
        v[i].vaciar(Z);
    }
    void vaciar(int i,int j)
    {
        v[i].vaciar(v[j]);
    }
}

    
