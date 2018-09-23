package org.fasttrackit.algorithm.alexspataru;
import java.util.Scanner;

public class Problema1 {

    /** Sa se calculeze medie aritmetica a doua numere pozitive citite de la tastatura. */

    public static void main (String args[]){

          Scanner scan = new Scanner(System.in);
          int a, b;
            a = scan.nextInt();
            b = scan.nextInt();

          int mediaAritmetica;

          if (a >= 0 && b >= 0) {
              mediaAritmetica = (a + b) / 2;
              System.out.println("Media artimetica = " + mediaAritmetica);
          }

          else
              System.out.println("At least one number is negative");
    }
}