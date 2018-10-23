package org.fasttrackit.algorithm.david;

import java.util.Scanner;

public class SecondProbleme {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dati nr de nr ce vreti sa fie citit de la tastatura:");
        int nr=scanner.nextInt();
        scanner.nextLine();
        double suma=0;
        int x=0;
        for(int i=0;i<nr;i++){
            System.out.println("Dati un nr de la tastatura:");
            suma+=scanner.nextDouble();
            scanner.nextLine();
            x++;
        }
        double medieAritmetica=suma/x;
        System.out.println("Media aritmetica a numerelor citite de la tastatura este egala cu : "+medieAritmetica);

    }
}
