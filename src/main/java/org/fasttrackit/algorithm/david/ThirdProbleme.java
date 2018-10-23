package org.fasttrackit.algorithm.david;

import java.util.Scanner;

public class ThirdProbleme {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dati nr de nr ce vreti sa fie citit de la tastatura:");
        int nr=scanner.nextInt();
        scanner.nextLine();


        double x=-1000000000;
        double y=0;
        for(int i=0;i<nr;i++){
            System.out.println("Dati un nr de la tastatura:");
            y=scanner.nextDouble();
            scanner.nextLine();
            if(y>x){
                x=y;
            }
        }

        System.out.println("Maximul numerelor citite de la tastatura este egal cu: "+y);
    }
}
