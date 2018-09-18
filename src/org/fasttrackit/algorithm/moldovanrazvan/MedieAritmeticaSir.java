package org.fasttrackit.algorithm.moldovanrazvan;

/*12. Se da un sir de numere naturale, ideal de peste doua cifre.
Sa se determine cea mai mare valoare din sir care are suma de control sub 3.
Suma de control a fost definita mai sus.
de ex
int[] sir ={12, 34,35, 11,34};
* */

public class MedieAritmeticaSir
{
    public static void main(String[] args)
    {
        int firstNumber = 201;

        int secondNumber = 123;

        int sum;

        sum = firstNumber + secondNumber;

        System.out.println("Suma numerelor este: " + sum);

        String firstNumberString = "" + firstNumber;

        firstNumberString = Integer.toString((firstNumber));

        String secondNumberString = Integer.toString((secondNumber));

        int sumFirstNumber = 0;
        for(int index = 0;  index < firstNumberString.length(); index++)
        {
            sumFirstNumber += Integer.parseInt("" + firstNumberString.charAt(index));
        }

        int sumSecondNumber = 0;
        for(int index = 0;  index < secondNumberString.length(); index++)
        {
            sumSecondNumber += Integer.parseInt("" + secondNumberString.charAt(index));
        }

        System.out.println("Sum first number: " + sumFirstNumber);
        System.out.println("Sum first number: " + sumSecondNumber);
}


}

