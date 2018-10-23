package org.fasttrackit.algorithm.adrianapodut;

import java.util.Scanner;

public class Exercitiul20 {
    /**
     * 20. Se da un sir. Sa se extraga toate numerele intre doua valori si sa se puna intr-un alt sir care apoi sa se afiseze.
     */

    public static void main(String[] args) {

        //get row length
        Scanner inputs = new Scanner(System.in);
        System.out.println("Cate numere are sirul?: ");
        int rowLength = inputs.nextInt();
        inputs.nextLine();

        //get row values
        int[] rowOfNumbers = new int[rowLength];
        for (int i = 0; i < rowOfNumbers.length; i++) {
            System.out.println("Introduceti numarul " + (i + 1) + ":");
            rowOfNumbers[i] = inputs.nextInt();
            inputs.nextLine();
        }

        //get first value
        System.out.println("Introduceti valoaea 1: ");
        int firstValue = inputs.nextInt();
        inputs.nextLine();

        //get second value
        System.out.println("Introduceti a doua valoare: ");
        int secondValue = inputs.nextInt();
        inputs.nextLine();

        //put the numbers between the two values in a row
        int[] selectedNumbers = new int[rowOfNumbers.length];
        int selectedNumbersIndex = 0;
        for (int i = 0; i < rowOfNumbers.length; i++) {
            if ((rowOfNumbers[i] > firstValue) && (rowOfNumbers[i] < secondValue)) {
                //check if number already exists in the selected row
                boolean numberExists = false;
                for (int j = 0; j < selectedNumbersIndex; j++) {
                    if (selectedNumbers[j] == rowOfNumbers[i]) {
                        numberExists = true;
                    }
                }
                //if the number does not exist, add it to the selected row
                if (!numberExists) {
                    selectedNumbers[selectedNumbersIndex] = rowOfNumbers[i];
                    selectedNumbersIndex++;
                }
            }
        }

        //print the selected numbers
        if (selectedNumbersIndex == 0) {
            System.out.println("In sir nu exista numere intre cele doua valori.");
        } else {
            System.out.println("Numerele selectate sunt: ");
            for (int i = 0; i < selectedNumbersIndex; i++) {
                System.out.print(selectedNumbers[i] + "  ");
            }
        }
    }


}
