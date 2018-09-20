package org.fasttrackit.algorithm.mariusp;

import java.util.Scanner;

public class exercitiu7 {
    public static void main(String[]args){


        Scanner input=new Scanner(System.in);
        System.out.println("Numarul este:");
        int a=input.nextInt();
        int invers=0;
        while(a>0){
            int b=a%10;
            invers=(invers*10)+b;
            a=a/10;
        }
        System.out.println("Numarul invers este:"+invers);
    }

}
