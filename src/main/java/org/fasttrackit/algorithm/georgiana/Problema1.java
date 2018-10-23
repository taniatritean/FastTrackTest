package org.fasttrackit.algorithm.georgiana;
/**Media aritmetica a 2nr citite de la tastatura*/
import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int a,b;
        int MediaAritmetica=0;
        System.out.println("Dati primul numar: ");
        a=userInput.nextInt();
        System.out.println("Dati al doilea numar:");
        b=userInput.nextInt();
        //System.out.println(a+","+b);
        MediaAritmetica=(a+b)/2;
        System.out.println("Media aritmetica: "+MediaAritmetica);
    }
}

/**
 * PENTRU NR REALE
 * package org.fasttrackit.algorithm.georgiana;
import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double a,b;
        double MediaAritmetica=0;
        System.out.println("Dati primul numar: ");
        a=userInput.nextDouble();
        System.out.println("Dati al doilea numar:");
        b=userInput.nextDouble();
        //System.out.println(a+","+b);
        MediaAritmetica=(a+b)/2;
        System.out.println("Media aritmetica: "+MediaAritmetica);
    }
}*/

