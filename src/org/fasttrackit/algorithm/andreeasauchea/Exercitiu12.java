package org.fasttrackit.algorithm.andreeasauchea;
import java.util.Arrays;

public class Exercitiu12 {
    public static void main(String[] args) {
        int[] sir = {11, 34, 35, 10, 9, 1, 123, 100, 101, 110, 111, 34};
        Arrays.sort(sir);
        int[] cifraControl = new int[sir.length];
        for (int i = 0; i < sir.length; i++) {
            int sum = 0;
            int d = sir[i];
            int c;
            while (d != 0) {
                c = d % 10;
                d /= 10;
                sum += c;
            }
            cifraControl[i] = sum;
        }
        int i = sir.length-1;
        while (cifraControl[i]>2) {
            i--;
        }
        System.out.println("Numarul cautat este " + sir[i]);
    }
}
