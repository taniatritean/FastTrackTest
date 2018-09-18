package org.fasttrackit.algorithm.robertszilagyi;

/*Se da un sir de numere naturale, ideal de peste doua cifre. Sa se determine cea mai mare valoare din sir care are suma de control sub 3. Suma de control a fost definita mai sus.
de ex
int[] sir ={12, 34,35, 11,34};
* */

//Exercitiu12


public class MedieAritmeticaSir
{
    public static void main(String[] args)
    {
        int firstNumber = 201;
        int secondNumber = 123;

        int sum;

       sum = firstNumber + secondNumber;

       System.out.print("Suma numerelor este :" + sum);

       String firstNumberString = ""+firstNumber;

       firstNumberString = Integer.toString((firstNumber));

       String secondNumberString = Integer.toString(secondNumber);

       int sumFirstNumber = 0;
        for(int index=0; index < firstNumberString.length();index++)
        {
            sumFirstNumber+=Integer.parseInt(""+firstNumberString.charAt(index));
        }

       int sumSecondNumber = 0;
       for(int index=0; index < secondNumberString.length();index++)
       {
           sumSecondNumber+=Integer.parseInt(""+secondNumberString.charAt(index));
       }
       System.out.print("Sum first number:" + sumFirstNumber);
       System.out.print("Sum second number:"+sumSecondNumber);

    }
}
