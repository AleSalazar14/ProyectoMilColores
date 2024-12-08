package com.mycompany.feriamilcolores;

public class MultiPilaFoto {
		private PilaFoto v[]=new PilaFoto[40];
	    private int n;
	    
	    MultiPilaFoto()
	    {
	        for(int i = 1; i <= 39;i++)
	            v[i]=new PilaFoto();
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
	    void adicionar(Foto elem, int i)
	    {
	        v[i].adicionar(elem);
	    }
	    Foto eliminar(int i)
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
	            System.out.println("Pila"+i);
	            mostrar(i);
	        }
	    }
	    void vaciar(PilaFoto Z,int i)
	    {
	        v[i].vaciar(Z);
	    }
	    void vaciar(int i,int j)
	    {
	        v[i].vaciar(v[j]);
	    }

}
