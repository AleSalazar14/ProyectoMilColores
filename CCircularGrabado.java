/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.feriamilcolores;

/**
 *
 * @author hp
 */
public class CCircularGrabado {
   private
     int max=50;
     Grabado v[] = new Grabado[max+1];
     int ini,fin;
  public
     CCircularGrabado()//Cola Vacia
     {
         ini=fin=0;
     }
     int nroelem(){
    	if (ini==0 && fin == 0) {
             return 0;
    	}
        if (fin>ini) {
             return fin-ini;}
    return max-ini+fin;      
    }
    boolean esvacia()
    { if (nroelem()==0)
           return true;
       return false;
    }
    boolean esllena()
    {  if (nroelem()==max)
           return true;
       return false;
     }
     void adicionar(Grabado elem)
     {  if (!esllena())
         {    if (fin==max)
                      fin=1;
              else
                     fin=fin+1;
              v[fin]=elem ;
          }
         else
            System.out.println("Cola llena");
     }
     Grabado eliminar()
     { Grabado elem=null ;
       if (!esvacia())
        {     ini=ini+1;
              elem=v[ini];
              if (ini==max)
                     ini=0;
               if (ini==fin)
                     ini=fin=0;
        }
        else
            System.out.println("Cola Vacia");
         return elem;
     }
      void mostrar()
     {   CCircularGrabado aux=new CCircularGrabado();
         while (!esvacia())
          {   Grabado elem=eliminar();
               elem.mostrar();
               aux.adicionar(elem);
           }
         vaciar(aux);
     }
      void vaciar(CCircularGrabado z)
     {   while (!z.esvacia())
               adicionar(z.eliminar());
     }


}

 

