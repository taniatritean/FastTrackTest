package org.fasttrackit.algorithm.sandorszucs.homework2;
import java.util.Scanner;

public class Exercise9 { public static void main(String[] args) {
    int EvenNumber = 0;
    int OddNumber = 0;
    System.out.println("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    int userEnteredNumber = sc.nextInt();
    int copy = userEnteredNumber;

    while(copy > 0) {
        int lastDigit = copy % 10;
        copy /= 10;
        if (lastDigit % 2 != 0) {
            OddNumber = OddNumber * 10 + lastDigit;
        }
    }

    System.out.println("Odd digits of your number: " + OddNumber);
    copy = userEnteredNumber;

    while(copy > 0) {
        int lastNum = copy % 10;
        copy /= 10;
        if (lastNum % 2 == 0) {
            EvenNumber = EvenNumber * 10 + lastNum;
        }
    }

    System.out.println("Even digits of your number: " + EvenNumber);
    System.out.println("Your number squared " + Math.pow(EvenNumber, 2));
}
}
