package org.fasttrackit.algorithm.david;

public class Problema12Clasa {
    public static void main(String[] args) {
        int firstNumber=201;
        String firstNumberSring= ""+firstNumber;
        firstNumberSring=Integer.toString(firstNumber);

        int sumFirstNumber=0;

       for(int i=0;i<firstNumberSring.length();i++){
           sumFirstNumber+=Integer.parseInt(""+firstNumberSring.charAt(i));
       }
       int secondNumber=123;
       int sumSecondNumber=0;
        String secondNumberString=Integer.toString(secondNumber);
        for(int i=0;i<secondNumberString.length();i++){
            sumSecondNumber+=Integer.parseInt(""+secondNumberString.charAt(i));
        }

        System.out.println(sumFirstNumber);
        System.out.println(sumSecondNumber);
    }
}
