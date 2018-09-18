package org.fasttrackit.algorithm.mariusp;

import java.util.Scanner;

public class exercitiu6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("N=");
        int a = input.nextInt();

         int nrel = 0,max=0,min=9,prod=1,sum=0,b=0;
        while (a > 0) {
            b=a%10;

            if(b>max){
                max=b;}
             if(b<min){
                 min=b;
             }


            sum = sum + a % 10;
            prod = prod * (a % 10);
            nrel++ ;
            a = a / 10;

        }
        System.out.println("Suma numerelor este:" + sum);
        System.out.println("Produsul numerelor este:" + prod);
        System.out.println("Numarul de elemente este:"+nrel);
        System.out.println("Cel mai mare numar din sir este"+max);
        System.out.println("Cel mai mic numar din sir este"+min);
    }
}
