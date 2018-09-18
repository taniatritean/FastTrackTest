package org.fasttrackit.algorithm.georgiana;
//Se da un numar . se se afiseze true daca numrul apartine intervalului [9,24] , altfel sa se afiseze false.
import java.util.Scanner;

public class Problema13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

                int n;
        System.out.println("Dati numarul:");
        n=input.nextInt();
        if (n>=9&&n<=24)
            System.out.println("True!");
        else System.out.println("False!");
    }
}
