package org.fasttrackit.algorithm.mariusp;

import java.util.Scanner;

public class exercitiu5 {
    public static void main(String[] args) {
        int tabla = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("primul numar dorit:");
        int a = input.nextInt();

        System.out.println("al doilea numar dorit:");
        int b = input.nextInt();

        while (a <= b) {
            System.out.println("Tabla inmultirii cu "+ a+":");
            for (int i = 0; i <= 10; i++) {
                tabla = a * i;
                System.out.println(i + "x" + a + "=" + tabla);
            }
        a++;
        }

    }
}
