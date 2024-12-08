/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.feriamilcolores;

/**
 *
 * @author ALE
 */
public class Problemas {
    //nombre de la pintura de nombre x
	public String ejercicionom(LDobleE a, String x) {
		NodoE r=a.getP();
		while(r!=null) {
			NodoP w=r.getExpo().getLdcircularp().getP();
			while(w.getSig()!=w) {
				if(w.getP().getNombre().equals(x)) {
					NodoEx q=r.getEnl();
					String id=w.getP().getIdArtista();
					while(q!=null) {
						if(q.getExpositor().getCarnet().equals(id))
							return q.getExpositor().getNombre();
						q=q.getSig();
					}
				}
				w=w.getSig();				
			}
			if(w.getP().getNombre().equals(x)) {
				NodoEx q=r.getEnl();
				String id=w.getP().getIdArtista();
				while(q!=null) {
					if(q.getExpositor().getCarnet().equals(id))
						return q.getExpositor().getNombre();
					q=q.getSig();
				}
			}
			r=r.getSig();
		}
		return "Artista no encontrado";
	}
	//precio de la pintura de nombre x
	public int ejerciciounoprecio(LDobleE a, String x) {
		NodoE r=a.getP();
		while(r!=null) {
			NodoP w=r.getExpo().getLdcircularp().getP();
			while(w.getSig()!=w) {
				if(w.getP().getNombre().equals(x)) {
					return w.getP().getPrecio();
				}
			}
			if(w.getP().getNombre().equals(x)) {
				return w.getP().getPrecio();
			}
			
			r=r.getSig();
		}
		return 0;
	}
	//mostyrar el arista de la obra de pintura mas cara de la expo x
	
}
