package org.fasttrackit.algorithm.daniel;

import java.util.Scanner;

public class MedieAritmeticaDaniel {

    /**
     * se citeste un nr N, sa se calculeze suma cifrelor
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n Value:  ");
        int n = s.nextInt();
        int sum = 0;
        while (n > 0) {
            sum = sum + (n % 10);// why do we need n%10 ?
            n = n / 10;// n is an int ... if we split it by 10  it can return 0.5
            // si va fi rotunjit la 0 pt ca in int nu intra numere cu virgula
            // (sunt prea mari pe biti ar trebui double pt asta)
        }
        System.out.println("Sum of Digits:" + sum);
        //din cate vad eu aici intotdeauna se citeste un singur numar, cum am putea citi mai multe si sa le facem suma
    }

    //TODOs:
    //format the code ctrl+alt+shift+l ca sa vezi cum arata pe urma codul - ca best practice
}

