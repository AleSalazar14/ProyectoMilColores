package com.mycompany.feriamilcolores;

public class NodoE {
	private Exposicion expo;
	private NodoE ant, sig;
        private NodoEx enl;
	
	NodoE(){
		ant=null;
		sig=null;
                enl=null;
	}

	public Exposicion getExpo() {
		return expo;
	}

	public void setExpo(Exposicion expo) {
		this.expo = expo;
	}

	public NodoE getAnt() {
		return ant;
	}

	public void setAnt(NodoE ant) {
		this.ant = ant;
	}

	public NodoE getSig() {
		return sig;
	}

	public void setSig(NodoE sig) {
		this.sig = sig;
	}

    public NodoEx getEnl() {
        return enl;
    }

    public void setEnl(NodoEx enl) {
        this.enl = enl;
    }
	

}
