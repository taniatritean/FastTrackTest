package org.fasttrackit.algorithm.david;

import java.util.Scanner;

public class TenthProbleme {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int[] a = {1,3,4,6,7,8,10,12,14,23};

        System.out.println("Ce numar sa se caute in sir?");
        int numarDeCautat=scanner.nextInt();
        scanner.nextLine();

        boolean x=false;
        int pozitie=0;

        for(int i=0;i<a.length;i++){
            if(a[i]==numarDeCautat){
                x=true;
                pozitie=i;
                break;
            }
        }
        if(x==true){
            System.out.println("Cifra "+numarDeCautat+" exista in sir pe pozitia "+(pozitie+1)+".");
        }else{
            System.out.println("Cifra "+numarDeCautat+" nu exista in sir.  (-1)");
        }
    }
}
