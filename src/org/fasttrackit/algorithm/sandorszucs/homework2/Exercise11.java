package org.fasttrackit.algorithm.sandorszucs.homework2;


public class Exercise11 {
    public static void main(String args[]) {

    int value = 20;
    int total = 0;

    for (int i = 0; i < value; i++) {
        total = total + (i +1);
    }
        System.out.println("Sum of the first "+ value + " numbers is: " + total);
    }
}