package org.fasttrackit.algorithm.david;
import java.util.Scanner;

public class ProblemaSaisprezece {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dati numarul de numere:");
        int nrDeNr=scanner.nextInt();
        scanner.nextLine();
        int[] sir=new int[nrDeNr];
        for(int i=0;i<nrDeNr;i++){
            System.out.println("Dati un numar pt sir:");
            sir[i]=scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Perechile de numere sunt:");


        for(int i=1;i<nrDeNr;i++){
            if(sir[i-1]>sir[i]){
                System.out.println(sir[i-1]+" "+sir[i]+",  ");
            }
        }
    }
}
