package org.fasttrackit.algorithm.mariusp;

import java.util.Scanner;

public class exercitiu4 {
    public static void main(String[] args) {
        int tabla = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("numarul dorit pt a genera tabla inmultirii pana la 10:");
        int a = input.nextInt();

        for (int i = 0; i<=10; i++) {
            tabla = a * i;
            System.out.println(i+"x"+a+"="+tabla);
        }
    }
}
