package org.fasttrackit.algorithm.david;

public class TODO1 {
    public static void main(String[] args) {
        int numberOne=metoda(args,0);
        int numberTwo=metoda(args,1);


        int mediaAritmetica = (numberOne + numberTwo) / 2;
        System.out.println("Media aritmentica a numerelor " + numberOne + " si " + numberTwo + " este " + mediaAritmetica);


    }
    private static int metoda(String[] args, int numar){
        int number=0;

        if (args.length > numar) {
            try {
                number = Integer.parseInt(args[numar]);
            } catch (NumberFormatException nfe) {
                System.out.println("The argument " + args[numar] + " is not a number");
            }
        }

        return number;

    }
}
