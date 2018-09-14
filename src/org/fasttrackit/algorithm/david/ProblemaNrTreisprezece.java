package org.fasttrackit.algorithm.david;

import java.util.Scanner;

public class ProblemaNrTreisprezece {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dati un numar:");
        double x=scanner.nextDouble();

        boolean variabila=false;

        for(int i=9;i<=25;i++){
            if(x==i){
                variabila=true;
                break;
            }
        }

        if(variabila==false){
            System.out.println("Numarul dat nu apartine sirului.");
        }else{
            System.out.println("Numarul dat apartine sirului.");
        }
    }
}
