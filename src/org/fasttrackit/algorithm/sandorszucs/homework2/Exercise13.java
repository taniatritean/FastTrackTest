package org.fasttrackit.algorithm.sandorszucs.homework2;
import java.util.Scanner;

public class Exercise13 {
    public static void main (String args[]) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int enteredNumber = sc.nextInt();

        boolean value = false;

        for (int i = 9; i <= 24; i++){
            if (enteredNumber == i){
                value = true;
            }
        }
        if (value == false) {
            System.out.println("The number cannot be found among the values");
        }
        else {
            System.out.println("Your number can be found");
        }
    }
}