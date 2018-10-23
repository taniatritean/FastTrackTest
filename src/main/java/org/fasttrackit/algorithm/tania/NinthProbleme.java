package org.fasttrackit.algorithm.tania;

import java.util.Date;
import java.util.Scanner;
//9. Se da un numar a.
//        Se se afiseze un numar b format doar din numerele impare ale numarului a,
// si un numar c format din patratul numerelor pare ale numarului a.


public class NinthProbleme {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Dati un numar:");
        int number = scanner.nextInt();
        String numberString = Integer.toString(number);//we convert to string
        int numerelorImpare = 0;
        int numarulDinPare = 0;

        long time = new Date().getTime();
        System.out.println(time);
        int ordinPar = 1;
        int ordinImpar = 1;
        for (int i = numberString.length() - 1; i >= 0; i--) {
            char charAtIndex = numberString.charAt(i);
            int numberChar = Character.getNumericValue(charAtIndex);
            if (numberChar % 2 > 0) {
                numerelorImpare += (ordinImpar * numberChar);
                ordinImpar *= 10;
            } else {
                numarulDinPare += (ordinPar * numberChar);
                ordinPar *= 10;
            }
        }

        double pareLaPutere = Math.pow(numarulDinPare, 2);
        long newTime = new Date().getTime();
        System.out.println(newTime);
        System.out.println("Timp de procesare algorithm in miliseconds: "+ (newTime-time) );
        System.out.println("b este egal cu doar din numerele impare ale numarului a : " + numerelorImpare);
        System.out.println("c este egal cu patratul numerelor pare ale numarului :  "+numarulDinPare + "    "+ pareLaPutere);
    }
}
