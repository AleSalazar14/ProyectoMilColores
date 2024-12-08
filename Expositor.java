/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.feriamilcolores;

/**
 *
 * @author ALE
 */
public class Expositor {
    private String carnet, nombre, apellido;
    private int nroObras;

    public Expositor(String carnet, String nombre, String apellido, int nroObras) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroObras = nroObras;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNroObras() {
        return nroObras;
    }

    public void setNroObras(int nroObras) {
        this.nroObras = nroObras;
    }
    //COMPLETAR UWUWUWU
    public void mostrar(){
        System.out.println(carnet+nombre+apellido+nroObras);
        
    }
}
