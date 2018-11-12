package org.fasttrackit.algorithm.andreeasauchea.exercitii;
import java.util.Scanner;

public class Exercitiu4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati numarul pentru tabla inmultirii:");
        int nr = scan.nextInt();
        for (int i=0; i<11; i++){
            System.out.println( i + " * " + nr + " = " + i*nr);
        }
    }
}
