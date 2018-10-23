package org.fasttrackit.algorithm.georgiana;
/**a) suma cifrelor unui numar si produsul
 * b) cate cifre are nr
 * c) cifra maxima si minima
 * d) cifra de control
 * */
public class Problema6 {
    public static void main(String[] args) {
        int a = 78231;
        int aux = a;
        int s = 0, p = 1, c = 0;

        while (a != 0) {
            s = s + (a % 10);
            p = p * (a % 10);
            a = a / 10;
            c = c + 1;
        }
        System.out.println("Suma cifrelor numarului este:" + s + ". Produsul cifrelor numarului este:" + p);//a)
        System.out.println("Numarul cifrelor este:" + c);
        int min;
        int max;
        int s_ctrl=0; // cifra de control
        min = max = aux % 10; //min=max=1
        aux = aux / 10; //7823
        while (aux != 0) {
            if (aux % 10 > max)
                max = aux % 10;
            if (aux % 10 < min)
                min = aux % 10;
            aux = aux / 10;
        }
        System.out.println("Minimul este: " + min + " si maximul este: " + max);
        while(s>10)
        {
            while (s!=0)
            {
             s_ctrl=s_ctrl+(s%10);
             s=s/10;
            }
            s=s_ctrl;
        }
        System.out.println("Cifra de control este: " +s);
    }
}