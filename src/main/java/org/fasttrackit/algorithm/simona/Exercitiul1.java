package org.fasttrackit.algorithm.simona;
/*Sa se calculeze media aritmetica a doua numere pozitive citite de la tastatura*/
import java.util.Scanner;

public class Exercitiul1 {
    public static void main(String[] args)
    {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int nr1 = consoleInput.nextInt();
        consoleInput.nextLine();
        new Scanner(System.in);
        System.out.println("Introduceti al doilea numar: ");
        int nr2 = consoleInput.nextInt();
        consoleInput.nextLine();
        if (nr1 >= 0 && nr2 >= 0)
        {
            System.out.println((nr1+nr2)/2);
        }
        else
            System.out.println("Numerele nu sunt pozitive");
    }
}
