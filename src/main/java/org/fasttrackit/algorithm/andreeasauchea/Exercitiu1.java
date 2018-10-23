package org.fasttrackit.algorithm.andreeasauchea;
import java.util.Scanner;

public class Exercitiu1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int a, b;
        System.out.println("Dati cele doua numere: ");
       a = scan.nextInt();
       b = scan.nextInt();
       if (a > 0 && b > 0){
           int mediaAritm = (a+b)/2;
           System.out.println("Media aridmetica a numerelor este " + mediaAritm);
       } else
           System.out.println("Numerele trebuie sa fie pozitive");
    }
}
