package org.fasttrackit.algorithm.andreeasauchea;
import java.util.Scanner;

public class Exercitiu9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati numarul: ");
        int nr = scan.nextInt();
        int d = nr;
        int e;
        int b=0;
        int c=0;
        int counti = 0;
        int countp = 0;
        while (d!=0){
            e=d%10;
            d /= 10;
            if (e%2!=0){
                c += Math.pow(10, counti)*e;
                counti++;
            } else{
                b += Math.pow(10, countp)*e*e;
                if (e*e>10){
                    countp += 2;
                } else
                    countp++;
            }

        }
        System.out.println("Numarul c este " + c);
        System.out.println("Numarul b este " + b);
    }
}
