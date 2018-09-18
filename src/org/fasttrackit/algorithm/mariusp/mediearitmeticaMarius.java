package org.fasttrackit.algorithm.mariusp;
//
//12. Se da un sir de numere naturale, ideal de peste doua cifre.
// Sa se determine cea mai mare valoare din sir care are suma de control sub 3. Suma de control a fost definita mai sus.
//       de ex
//      int[] sir ={12, 34,35, 11,34};


public class mediearitmeticaMarius {
    public static void main(String[] args) {
        int firstnumber = 201;
        int secondnumber = 123;
        int sum;

        sum = firstnumber + secondnumber;
        System.out.println("Suma numerelor este:" + sum);
       // Stringg firstnumberString = "" + firstnumber;

        String secondNumberString = Integer.toString(secondnumber);
        String firstnumberString = Integer.toString(firstnumber);

        int sumFirstnumber = 0;
        for (int index = 0; index < firstnumberString.length(); index++) {
            sumFirstnumber += Integer.parseInt("" + firstnumberString.charAt(index));

        }
        int sumSecondNumber = 0;
        for (int index = 0; index < secondNumberString.length(); index++) {
            sumSecondNumber += Integer.parseInt("" + secondNumberString.charAt(index));

        }
        System.out.println("Sum first number:"+ sumFirstnumber);
        System.out.println("sum second number"+sumSecondNumber);
    }

}

