package org.fasttrackit.algorithm.sandorszucs.homework;

public class Exercise12 {

        public static void main(String[] args) {

            int maxSumaDeControl = 3;
            String[] sirDeNumereCaStringuri = new String[]{"111", "11", "101"};

            String firstNumber = sirDeNumereCaStringuri[0];
            int sumOfDigitsFromNumber1 = computeSumOfDigits(firstNumber);

            String secondNumber = sirDeNumereCaStringuri[1];
            int sumOfDigitsFromNumber2 = computeSumOfDigits(secondNumber);

            String treiNumber = sirDeNumereCaStringuri[2];
            int sumOfDigitsFromNumber3 = computeSumOfDigits(treiNumber);

            int maximulNumaruluiDinSur = 0;
            int result = 0;

            if (sumOfDigitsFromNumber1 < maxSumaDeControl) {
                int numberConvertedToNumber = Integer.parseInt(firstNumber);

                if (numberConvertedToNumber > maximulNumaruluiDinSur) {
                    result = numberConvertedToNumber;
                }
            }

            if (sumOfDigitsFromNumber2 < maxSumaDeControl) {
                int numberConvertedToNumber = Integer.parseInt(secondNumber);

                if (numberConvertedToNumber > maximulNumaruluiDinSur) {
                    result = numberConvertedToNumber;
                }
            }

            if (sumOfDigitsFromNumber3 < maxSumaDeControl) {
                int numberConvertedToNumber = Integer.parseInt(treiNumber);

                if (numberConvertedToNumber > maximulNumaruluiDinSur) {
                    result = numberConvertedToNumber;
                }
            }

            System.out.println("Cel mai mare numar din sir care indeplineste conditia de numar de control < 3 este: " + result);
        }

        public static int computeSumOfDigits(String numberString) {

            int sumOfDigits = 0;

            for (int index = 0; index < numberString.length(); index++) {
                char charFromIndexInNumber = numberString.charAt(index);

                String charToString = Character.toString(charFromIndexInNumber);
                int charConvertedToInt = Integer.parseInt(charToString);
                sumOfDigits += charConvertedToInt;
            }
            System.out.println("Sum of  number: " + numberString + " is : " + sumOfDigits);
            return sumOfDigits;
        }
    }