package com.mycompany.feriamilcolores;

public class PilaFoto {
	private int max=20;
	 private Foto  v[]=new Foto [max+1];
	 private int tope;
	 
	 PilaFoto(){
	  tope=0;
	  
	 }
	 boolean esvacia(){
	  if (tope==0)
	   return true;
	  return false;
	 }
	 boolean esllena(){
	  if(tope==max)
	   return true;
	  return false;
	 }
	 int nroelem()
	 {
	  return tope;
	 }
	 void adicionar(Foto   elem){
	  if(!esllena()){
	   tope++;
	   v [tope]=elem;
	   
	  }
	  else
	   System.out.println("Pila llena");
	 }
	 Foto  eliminar(){
	  Foto  elem=null;
	  if(!esvacia()){
	  elem=v[tope];
	  tope--;
	 }
	 else
	  System.out.println("Pila vacia");
	 return elem;
	 }
	 void mostrar(){
	  PilaFoto aux=new PilaFoto();
	  while(!esvacia()){
	   Foto elem=eliminar();
	   elem.mostrar();
	   aux.adicionar(elem);
	   
	  }
	  vaciar(aux);
	 }
	 void vaciar(PilaFoto Z){
	  while(!Z.esvacia())
	   adicionar(Z.eliminar());
	 }

}
