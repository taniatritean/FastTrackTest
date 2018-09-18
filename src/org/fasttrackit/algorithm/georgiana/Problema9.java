package org.fasttrackit.algorithm.georgiana;
/**Se da un numar a.
 Se se afiseze un numar b format doar din numerele impare ale numarului a, si un numar c format din patratul numerelor pare ale numarului a.
 */
import java.util.Scanner;


public class Problema9 {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        int a=0 ,b=0, c=0, UltimaCifra;
        int b1=0, numar;
        System.out.println("Dati numarul:");
        numar=input.nextInt();
        while(numar!=0)
        {
            a=a*10+numar%10;
            numar=numar/10;
        }
       while (a!=0)
        {
            UltimaCifra = a % 10;
            if (UltimaCifra % 2 == 1)
                b = b * 10 + UltimaCifra;
             else if (UltimaCifra > 3)
                c = c * 100 + (UltimaCifra * UltimaCifra);
            else
                c = c * 10 + (UltimaCifra * UltimaCifra);
            a=a/10;
        }
        System.out.println("Numarul format din cifre impare este:"+b);
        System.out.println("Numarul format din cifre pare este:"+c);
        }
}
