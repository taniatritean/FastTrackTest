package org.fasttrackit.algorithm.test;

/**
 * 12. Se da un sir de numere naturale, ideal de peste doua cifre.
 * Sa se determine cea mai mare valoare din sir care are suma
 * de control sub 3.
 * Suma de control a fost definita mai sus.
 * de ex
 * int[] sir ={12, 34,35, 11,34};
 *
 * @author ttritean
 * @since 9/18/2018
 */
public class MedieAritmeticaSir {

    public static void main(String[] alalaba) {
        int firstNumber = 201;
        int secondNumber = 123;

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
        System.out.println("Sum first number: " + sumFirstNumber);
        System.out.println("Sum second number: " + sumSecondNumber);
    }

    public void methodaVasile() {
        System.out.println("hey");
    }

    private static void methodAdriana() {
        System.out.println(":)");
    }

    public void methodaTania() {
        System.out.println("Hello");
    }

    public void methodaGeorgiana() {
        System.out.println("Hellooooo");
    }

    private static int kevinWow(int x){
        return x*x*x*x*x;
    }
    public void  methodaFlorin(){
        System.out.println("aiaiai!");
    }

    public void methodaTaniaB() {
        //test
    }
    public void metodaHoratiu () {
        System.out.println ("test");
    }

    public void metodaAndreeaSauchea(){
        System.out.println("Vrem conflict :))");
    }

    private static double keviiiiin(int x){
        return Math.pow(x,4);
    }

}

