package victordragan;

import java.util.Scanner;

public class SumIntToString {

    public static void main(String[] args) {
        int firstNumber = 12121212;
        int secondNumber = 123456789;
        int sum;

        sum = firstNumber + secondNumber;
        System.out.println(sum);

        String firstNumberString = "" + firstNumber;
        firstNumberString = Integer.toString(firstNumber);
        String secondNumberString = Integer.toString(secondNumber);

        int sumFirstNumber = 0;
        for (int index = 0; index < firstNumberString.length(); index++) {
            sumFirstNumber += Integer.parseInt("" + firstNumberString.charAt(index));
        }

        int sumSecondNumber = 0;
        for (int index = 0; index < secondNumberString.length(); index++) {
            sumSecondNumber += Integer.parseInt("" + secondNumberString.charAt(index));
        }

        System.out.println("Sum first number " + sumFirstNumber);
        System.out.println("Sum second number " + sumSecondNumber);
    }
}
