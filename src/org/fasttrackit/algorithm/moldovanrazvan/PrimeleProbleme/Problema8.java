package org.fasttrackit.algorithm.moldovanrazvan.PrimeleProbleme;

public class Problema8
{
    public static void main(String[] args)
    {
        int r = 0;
        int sum = 0;
        int temp;
        int n = 12344321;
        temp = n;

        while(n > 0)
        {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if(temp == sum)
            System.out.println("Numarul este palindrom.");
        else
            System.out.println("Numarul nu este palindrom.");
    }

}
