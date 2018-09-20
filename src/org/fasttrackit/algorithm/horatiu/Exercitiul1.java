package org.fasttrackit.algorithm.horatiu;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercitiul1 {
    public static void main (String[] args){
        double value;
        double numberOne;
        double numberTwo;
        Scanner scan = new Scanner( System.in );
        System.out.print("Enter first positiv number:");
            try {
                numberOne = scan.nextDouble();
                if (numberOne >= 0 ) {
                    System.out.print("Enter second positiv number:");
                    numberTwo = scan.nextDouble();
                    if (numberTwo >= 0){
                        value = (numberOne + numberTwo) / 2;
                        System.out.println("Media aritmetica a numerelor este: " + value );
                    }
                    else {
                        System.out.print("Must be positive number!");
                    }
                } else {
                    System.out.print("Must be positive number!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Must be a number");
            }
    }
}
