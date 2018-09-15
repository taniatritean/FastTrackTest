package org.fasttrackit.algorithm.andreeasauchea;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercitiu6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dati numarul: ");
        int nr = scan.nextInt();
        int sum = 0;
        int count =0;
        int prod = 1;
        int d=nr;
        int c;
        Integer cifra;
        ArrayList<Integer> num = new ArrayList();
        while(d!=0){
            c = d%10;
            cifra = c;
            d /= 10;
            sum += c;
            prod *= c;
            count ++;
            num.add(cifra);
        }
        Collections.sort(num);
        System.out.println("minim = " + num.get(0) + " maxim = " + num.get(num.size()-1));
        System.out.println("Suma este " + sum + ", produsul este " + prod + ", numarul de cifre este " + count);
        int a = sum;
        int b = sum;
        int e;
        while (a>=10){
            a=0;
            while (b!=0){
                e = b%10;
                b /=10;
                a += e;
            }
        }
        System.out.println("Cifra de control este " + a);
    }
}
