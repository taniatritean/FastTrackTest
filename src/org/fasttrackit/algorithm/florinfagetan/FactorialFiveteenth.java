package org.fasttrackit.algorithm.florinfagetan;

import java.util.Scanner;

public class FactorialFiveteenth {
    public static void main(String[] args) {
        Scanner intrareTastatura=new Scanner(System.in);
        System.out.println("introduceti numarul n: ");
        int n=intrareTastatura.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact *=i;
        }
        System.out.println("suma primelor " +n+ " numere este: "+fact);
    }
}
