package org.fasttrackit.algorithm.andreeasauchea.exercitii;
import java.util.Scanner;

public class Exercitiu8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati numarul: ");
        int nr=scan.nextInt();
        int d = nr;
        int invers = 0;
        int count = 0;
        while (d!=0) {
            d /= 10;
            count++;
        }
        d = nr;
        int c;
        while (d!=0){
            c = d%10;
            d /= 10;
            invers += Math.pow(10, count-1)*c;
            count --;
        }
        if (nr == invers){
            System.out.println("Numarul este palindrom.");
        } else
            System.out.println("Numarul nu este palindrom.");
    }
}
