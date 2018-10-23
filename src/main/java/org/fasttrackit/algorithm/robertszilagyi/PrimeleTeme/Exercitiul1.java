package org.fasttrackit.algorithm.robertszilagyi.PrimeleTeme;


import java.util.Scanner;

public class Exercitiul1
{
    public static  void main (String[] args)
{
    Scanner primulNumar = new Scanner(System.in);
    System.out.println("Introduceti primul numar :");
    int a = primulNumar.nextInt();

    Scanner alDoileaNumar = new Scanner(System.in);
    System.out.println("Introduceti al doilea numar :");
    int b = alDoileaNumar.nextInt();

    int rezultat = (a + b) / 2;
    System.out.println("Rezultatul este :" + rezultat);
}

}
