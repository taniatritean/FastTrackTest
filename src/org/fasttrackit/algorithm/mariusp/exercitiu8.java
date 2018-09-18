package org.fasttrackit.algorithm.mariusp;

import java.util.Scanner;

public class exercitiu8 {
    public static void main(String[]args){


        Scanner input=new Scanner(System.in);
        System.out.println("Numarul este:");
        int a=input.nextInt();
        int invers=0;
        int c=a ;
        while(a>0){
            int b=a%10;
            invers=(invers*10)+b;
            a=a/10;
        }
        if(c!=invers) {
            System.out.println("Numarul: " + c + " nu este palindrom");
        }
        else {
            System.out.println("Numarul: " + c + " este palindrom");
        }
    }

}
