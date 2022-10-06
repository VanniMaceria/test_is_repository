package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App{
    static Scanner input = new Scanner(System.in);
    public static void main( String[] args ){
        System.out.println("Hello Vanni Maceria!");
        //per la branch "prova"
        Persona vanni = new Persona("Vanni", "Maceria");
        System.out.println("Hello " + vanni.toString());
        //bla bla bla

        //altra modifica per la branch "prova"
        Calcolatrice c1 = new Calcolatrice();
        System.out.print("Inserisci il primo operando: ");
        c1.setOp1(input.nextFloat());
        System.out.print("Inserisci il secondo operando: ");
        c1.setOp2(input.nextFloat());

        System.out.println("Somma: " + c1.addizione(c1.getOp1(), c1.getOp2()));
        System.out.println("Differenza: " + c1.sottrazione(c1.getOp1(), c1.getOp2()));
        System.out.println("Prodotto: " + c1.moltiplicazione(c1.getOp1(), c1.getOp2()));
        System.out.println("Rapporto: " + c1.divisione(c1.getOp1(), c1.getOp2()));
    }
}
