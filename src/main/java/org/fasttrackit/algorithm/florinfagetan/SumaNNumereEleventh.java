package org.fasttrackit.algorithm.florinfagetan;

import java.util.Scanner;

public class SumaNNumereEleventh {
    public static void main(String[] args) {
        Scanner intrareTastatura=new Scanner(System.in);
        System.out.println("introduceti numarul n: ");
        int n=intrareTastatura.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum +=i;
        }
        System.out.println("suma primelor " +n+ " numere este: "+sum);
    }
}
