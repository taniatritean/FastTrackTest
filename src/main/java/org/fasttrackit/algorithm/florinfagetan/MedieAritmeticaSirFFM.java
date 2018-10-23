package org.fasttrackit.algorithm.florinfagetan;
public class MedieAritmeticaSirFFM {

    public static void main(String[] args) {
        int firstNumber = 201;
        int secondNumber = 123;
        int sum;
        sum = firstNumber + secondNumber;
        System.out.println("suma numerelor este: " + sum);
        int sumFirstNumber=0;
        int sumSecondNumber=0;

        String firstNumberString=""+firstNumber;
        firstNumberString=Integer.toString(firstNumber);
        String secondNumberString=Integer.toString(secondNumber);

        for(int index=0; index<firstNumberString.length(); index++)
        {
            sumFirstNumber+=Integer.parseInt(""+firstNumberString.charAt(index));
        }
        for(int index=0;index<secondNumberString.length();index++){
            sumSecondNumber+=Integer.parseInt("" +secondNumberString.charAt(index));

        }
        System.out.println("Sum first number"+sumFirstNumber);
        System.out.println("Sum second number"+sumSecondNumber);
    }
}
