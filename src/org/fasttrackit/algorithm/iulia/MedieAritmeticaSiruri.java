package org.fasttrackit.algorithm.iulia;

//Se da un sir de numere naturale, ideal de peste doua cifre. Sa se determine cea mai mare valoare din sir care are suma de control sub 3. Suma de control a fost definita mai sus.
//de ex
//int[] sir ={12, 34,35, 11,34};

public class MedieAritmeticaSiruri {
    public static void main(String[] args) {
        int firstnumber = 201;
        int secondnumber = 123;
        int sum;

        sum = firstnumber + secondnumber;
        System.out.println("Suma numerelor: " + sum);


        String firstnumberstring = "" + firstnumber;

        firstnumberstring = Integer.toString(firstnumber);
        String secondnumberstring = Integer.toString(secondnumber);

        int sumfirstnumber = 0;

        for (int index = 0; index < firstnumberstring.length(); index++) {

            sumfirstnumber += Integer.parseInt("" + firstnumberstring.charAt(index));
        }
    }
}


