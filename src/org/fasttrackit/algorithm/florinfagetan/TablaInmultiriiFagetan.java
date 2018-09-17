package org.fasttrackit.algorithm.florinfagetan;

import java.util.Scanner;

public class TablaInmultiriiFagetan {
    public static void main(String[] args) {
        Scanner intraretastatura = new Scanner(System.in);
        System.out.println("numarul n:");
        int n = intraretastatura.nextInt();
        if(n<0){
            System.out.println("Numarul " +n+ " a fost transformat in numar pozitiv");
            n=n*(-1);
        }
        System.out.println("tabla inmultirii cu " +n+ ":");

        for(int i=0; i<=10; i=i+1) {

            int produs = n*i;
            System.out.println(i+ "x" +n+ "=" +produs);
        }
    }
}
