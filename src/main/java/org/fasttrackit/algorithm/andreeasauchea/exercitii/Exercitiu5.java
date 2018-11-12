package org.fasttrackit.algorithm.andreeasauchea.exercitii;
import java.util.Scanner;

public class Exercitiu5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati cele 2 numere intre care doriti tabla inmultirii: ");
        int nr1 = scan.nextInt();
        int nr2 = scan.nextInt();
        for (int i=nr1; i<nr2+1; i++){
            for(int j=0; j<11; j++){
                System.out.println( j + " * " + i + " = " + j*i);
            }
        }
    }
}
