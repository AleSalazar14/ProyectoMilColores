package com.mycompany.feriamilcolores;

public class LDobleEx {
	private NodoEx p;
	LDobleEx(){
		p=null;
	}
	public NodoEx getP() {
		return p;
	}
	public void setP(NodoEx p) {
		this.p = p;
	}
	 public void adiprincipio(Expositor a)
	    {
	        NodoEx nue=new NodoEx();
	        nue.setExpositor(a);
	        
	        if(getP()==null)
	            setP(nue);
	        else
	        {
	            nue.setSig(getP());
	            getP().setAnt(nue);
	            setP(nue);
	            
	        }
	    }
	    public void mostrar()
	    {
	        NodoEx r=getP();
	        while(r!=null)
	        {
	            r.getExpositor().mostrar();
	            r=r.getSig();
	        }
	    }

}
