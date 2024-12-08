/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.feriamilcolores;

/**
 *
 * @author ALE
 */
public class FeriaMilColores {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        LDCircularP P=new LDCircularP();
        P.adifinal(new Pintura("Moderna","La Paz estrellada","15/07/2008","1234",678));
        P.adifinal(new Pintura("Renacimiento", "Las Cebras", "01/01/2003", "5678", 1000));
        P.adifinal(new Pintura("Impresionismo", "El almuerzo sobre la campo", "01/06/2023", "9101", 850));
        P.adifinal(new Pintura("Expresionismo", "Inti", "01/08/1893", "2021", 1200));
        P.adifinal(new Pintura("Surrealismo", "La persistencia de la llama", "01/04/2020", "3141", 1500));
        P.adifinal(new Pintura("Cubismo", "Illimani", "01/07/2023", "5161", 2000));
        P.adifinal(new Pintura("Barroco", "Telefericos", "01/09/2024", "7181", 3000));
        P.adifinal(new Pintura("Futurismo", "La ciudad maravilla", "01/01/2010", "9202", 1800));
        P.adifinal(new Pintura("Realismo", "El Angelus", "01/01/1859", "2233", 950));
        P.adifinal(new Pintura("Neoclasicismo", "Ama Sua", "01/01/1784", "2014", 1100));
        P.adifinal(new Pintura("Romanticismo","Ojitos de Manzanilla", "01/01/2018", "6275", 2200));
        P.mostrar();
        
    }
}
