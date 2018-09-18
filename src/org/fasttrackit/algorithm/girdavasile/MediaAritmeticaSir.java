package org.fasttrackit.algorithm.girdavasile;

public class MediaAritmeticaSir {


    public static void main(String[] args){

        int FirstNumber = 201;
        int secondNumber = 123;

        int sum;

        sum = FirstNumber + secondNumber;
        System.out.println("suma numerelor este " + sum);

    String firstNumberString = "" + FirstNumber;

    firstNumberString = Integer.toString(FirstNumber);

    int sumFirstNumber = 0;
            for(int index=0;index<firstNumberString.length();index++)  {
                sumFirstNumber+=Integer.parseInt(""+firstNumberString.charAt(index));
    }
}
}

