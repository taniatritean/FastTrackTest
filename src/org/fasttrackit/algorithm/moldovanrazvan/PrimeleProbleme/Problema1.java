package org.fasttrackit.algorithm.moldovanrazvan.PrimeleProbleme;

import java.util.Scanner;

public class Problema1
{
    public static void main(String[] args)
    {
        Scanner firstNumber = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int a = firstNumber.nextInt();

        Scanner secondNumber = new Scanner(System.in);
        System.out.println("Introduceti al doilea numar: ");
        int b = secondNumber.nextInt();

        int medieAritmetica = (a + b) / 2;
        System.out.println("Media aritetica a celor 2 numere este: " + medieAritmetica);
    }

}