package com.mycompany.feriamilcolores;

public class Exposicion {
	private LDCircularP ldcircularp;
	private LSCircularD lscirculard;
	private MultiColaCircularGrabado multicolag;
	private MultiPilaFoto multipilafoto;
	private String idmacrodistrito;
	private String hora;
	private String fecha;

    public Exposicion(LDCircularP ldcircularp, LSCircularD lscirculard, MultiColaCircularGrabado multicolag, MultiPilaFoto multipilafoto, String idmacrodistrito, String hora, String fecha) {
        this.ldcircularp = ldcircularp;
        this.lscirculard = lscirculard;
        this.multicolag = multicolag;
        this.multipilafoto = multipilafoto;
        this.idmacrodistrito = idmacrodistrito;
        this.hora = hora;
        this.fecha = fecha;
    }

    public LDCircularP getLdcircularp() {
        return ldcircularp;
    }

    public void setLdcircularp(LDCircularP ldcircularp) {
        this.ldcircularp = ldcircularp;
    }

    public LSCircularD getLscirculard() {
        return lscirculard;
    }

    public void setLscirculard(LSCircularD lscirculard) {
        this.lscirculard = lscirculard;
    }

    public MultiColaCircularGrabado getMulticolag() {
        return multicolag;
    }

    public void setMulticolag(MultiColaCircularGrabado multicolag) {
        this.multicolag = multicolag;
    }

    public MultiPilaFoto getMultipilafoto() {
        return multipilafoto;
    }

    public void setMultipilafoto(MultiPilaFoto multipilafoto) {
        this.multipilafoto = multipilafoto;
    }

    public String getIdmacrodistrito() {
        return idmacrodistrito;
    }

    public void setIdmacrodistrito(String idmacrodistrito) {
        this.idmacrodistrito = idmacrodistrito;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
	
	
	//ARREGALR SI ES NECESARIO WIOWIOEI
	public void mostrar() {
		System.out.println(idmacrodistrito+"-"+hora+"-"+fecha);
		System.out.println("Lista doble circular de pintura");
		ldcircularp.mostrar();
		System.out.println("Lista simple circular de dibujo");
		lscirculard.mostrar();
		System.out.println("multicola de grabado");
		multicolag.mostrar();
		System.out.println("multi pila de portafolio");
		multipilafoto.mostrar();
		
	}
	
	

}
