package com.mycompany.feriamilcolores;

public class LDobleE {
	private NodoE p;
	LDobleE(){
		p=null;
	}
	public NodoE getP() {
		return p;
	}
	public void setP(NodoE p) {
		this.p = p;
	}
	 public void adiprincipio(Exposicion a)
	    {
	        NodoE nue=new NodoE();
	        nue.setExpo(a);
	        
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
	        NodoE r=getP();
	        while(r!=null)
	        {
	            r.getExpo().mostrar();
	            r=r.getSig();
	        }
	    }

}
