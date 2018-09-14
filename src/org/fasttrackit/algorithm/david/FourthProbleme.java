package org.fasttrackit.algorithm.david;
import java.util.Scanner;

public class FourthProbleme {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dati un numar pt a se face tabla inmultirii pana la 10 cu acesta:");

        int numar=scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<=10;i++){
            int c=i*numar;
            System.out.println(i+" X "+numar+" = "+c);
        }
    }
}
