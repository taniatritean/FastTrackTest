package org.fasttrackit.algorithm.horatiu;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MedieAritmeticaHoratiu {
    public static void main (String[] args){
        double value;
        double numberOne;
        double numberTwo;
        Scanner scan = new Scanner( System.in );
        do {
            System.out.print("Enter first positiv number:");
            try {
                numberOne = scan.nextDouble();
                if (numberOne >= 0 ) {
                    System.out.print("Enter second positiv number:");
                    numberTwo = scan.nextDouble();
                    if (numberTwo >= 0){
                        value = (numberOne + numberTwo) / 2;
                        System.out.println("Media aritmetica a numerelor este: " + value );
                        break;
                    }
                    else {
                        System.out.print("Must be positive number!");
                        break;
                    }
                } else {
                    System.out.print("Must be positive number!");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Must be a number");
                break;
            }
        } while (true);

    }
}
