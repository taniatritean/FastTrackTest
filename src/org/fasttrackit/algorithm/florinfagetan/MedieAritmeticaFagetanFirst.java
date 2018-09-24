package org.fasttrackit.algorithm.florinfagetan;

import java.util.Scanner;

public class MedieAritmeticaFagetanFirst {
    public static void main(String[] args) {
        Scanner intraretastatura = new Scanner(System.in);
        System.out.println("primul numar:");
        float primulnumar = intraretastatura.nextFloat();
        if (primulnumar<0){
            System.out.println("numarul a fost transformat in numar pozitiv");
            primulnumar=primulnumar*(-1);
        }
        System.out.println("al doilea numar:");
        float aldoileanumar = intraretastatura.nextFloat();

        if(aldoileanumar<0) {
            System.out.println("numarul a fost transformat in numar pozitiv");
            aldoileanumar=aldoileanumar*(-1);
        }

        float mediaaritmetica = (primulnumar+aldoileanumar)/2;
        System.out.println("media aritmetica este:" + mediaaritmetica);


    }
}



