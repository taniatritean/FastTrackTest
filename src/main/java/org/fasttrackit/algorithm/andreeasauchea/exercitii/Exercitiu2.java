package org.fasttrackit.algorithm.andreeasauchea.exercitii;
import java.util.Scanner;

public class Exercitiu2 {
    public static void main(String[] args) {
        System.out.println("Dati numarul de numere pentru care doriti sa calculati media: ");
        Scanner scan = new Scanner(System.in);
        int nr = scan.nextInt();
        int[] numere = new int[nr];
        int sum = 0;
        for (int i=0; i<nr; i++){
            System.out.println("Dati al " + i + " -lea numar: ");
            numere[i]=scan.nextInt();
        }
        for (int i=0; i<nr; i++){
            sum += numere[i];
        }
        int medieAritm = sum/nr;
        System.out.println("Media aritmetica este " + medieAritm);
    }
}
