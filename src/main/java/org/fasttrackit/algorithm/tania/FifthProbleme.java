package org.fasttrackit.algorithm.tania;

import java.util.Scanner;

public class FifthProbleme {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Dati un numar de la tastatura:");
        int firstNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Mai dati un numar de la tastatura:");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();


        for (int i = firstNumber; i <= secondNumber; i++) {
            for (int startingPoint = 0; startingPoint <= 10; startingPoint++) {
                System.out.println(i + " * " + startingPoint + " = " + (i * startingPoint));
            }
            System.out.println("------------------------------");
        }
        //TODO - not the right output - not generating the full board
    }
}
