package org.fasttrackit.algorithm.alexspataru;
import java.util.Scanner;

public class Problema3 {
    /** 3.	Sa se determine maximul a N numere citite de la tastatura. */

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        int n, max;
        int index = 1;
        n = scan.nextInt();

        int [] a;
        a = new int [100];
        while (index <= n) {
            a[index] = scan.nextInt();
            index++;
        }

        max = a[1];
        index = 2;

        while (index <= n) {
            if (a[index] > max){
                max = a[index];
            }
            index++;
        }
        System.out.println(max);
    }


}
