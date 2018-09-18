package org.fasttrackit.algorithm.daniel;

import java.sql.SQLOutput;


public class MedieAritmeticaSir {
    public static void main(String[] args) {
        int firstnumber = 201;
        int secondnumber = 123;
        int sum = 0, sum2 = 0;
        String firstnumberString = "" + firstnumber;

        firstnumberString = Integer.toString(firstnumber);
        String secondnumberString = Integer.toString(secondnumber);


        for (int index = 0; index < firstnumberString.length(); index++) {
            sum += Integer.parseInt("" + firstnumberString.charAt(index));
        }
        System.out.println("suma " + sum);

        for (int index = 0; index < secondnumberString.length(); index++) {
            sum2 += Integer.parseInt("" + secondnumberString.charAt(index));
        }
        System.out.println("suma " + sum2);
    }
}
