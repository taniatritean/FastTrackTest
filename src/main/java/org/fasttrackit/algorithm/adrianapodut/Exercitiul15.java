package org.fasttrackit.algorithm.adrianapodut;

import java.util.Scanner;

public class Exercitiul15 {

    /**
     * 15. Sa se calculeze factorialul unui numar a .
     * factorialul este definit asa:
     * factorial  = 1*2*3*4….*a 
     * <p>
     * de ex pentru a = 4, factorialul este 1*2*3*4 
     */

    public static void main(String[] args) {

        //get the number
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int myNumber = consoleInput.nextInt();
        consoleInput.nextLine();

        if (myNumber == 0) {
            System.out.println("Factorialul numarului este 0");
        } else {
            //calculate factorial
            int factorial = 1;
            for (int i = 1; i <= myNumber; i++) {
                factorial = factorial * i;
            }
            //print factorial
            System.out.println("Factorialul numarului este: " + factorial);
        }
    }
}
