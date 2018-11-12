package org.fasttrackit.algorithm.andreeasauchea.exercitii;
import java.util.Scanner;

public class Exercitiu19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati numarul de elemente: ");
        int nr = scan.nextInt();
        int[] a = new int[nr];
        for (int i=0; i<nr; i++){
            System.out.println("Dati elementul: ");
            a[i] = scan.nextInt();
        }
        if (nr%2!=0){
            for (int i=0; i<=nr/2; i++){ // in functie de ce vrei sa se intample cu mijlocul sirului daca nr e impar schimbi i<=nr de aici si i=nr/2 din urmatorul for
                a[i]=2*a[i];
            }
        } else {
            for (int i=0; i<nr/2; i++){
                a[i]=2*a[i];
            }
        }
        for (int i=nr/2; i<nr; i++){
            if (a[i]%2!=0){
                a[i]=3*a[i];
            }
        }
        System.out.println("Sirul rezultat este: ");
        for(int i=0; i<nr; i++){
            System.out.println(a[i]);
        }
    }
}
