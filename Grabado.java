/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.feriamilcolores;

/**
 *
 * @author hp
 */
public class Grabado {
  
    private String tipo,material,nombre, fechaCreacion , idArtista;
    private int precio;

    public Grabado(String tipo, String material, String nombre, String fechaCreacion, String idArtista, int precio) {
        this.tipo = tipo;
        this.material = material;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.idArtista = idArtista;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(String idArtista) {
        this.idArtista = idArtista;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    

    //COMPLETAR
    public void mostrar()
    {
        System.out.println(tipo+material+nombre+fechaCreacion+idArtista+precio);
        
    }               
}
