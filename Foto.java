package com.mycompany.feriamilcolores;

public class Foto {
	private String idAutor;
	private String nombre;
	private String tipo;

    public Foto(String idAutor, String nombre, String tipo) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(String idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //COMPLETAR
    public void mostrar(){
        System.out.println(idAutor+nombre+tipo);
    }

}
