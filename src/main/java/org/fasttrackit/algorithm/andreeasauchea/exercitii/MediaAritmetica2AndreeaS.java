package org.fasttrackit.algorithm.andreeasauchea.exercitii;

public class MediaAritmetica2AndreeaS {
    public static int parsInt(String arg, int defaultValue){
        try {
            return Integer.parseInt(arg);
        } catch (NumberFormatException nfe){
            System.out.println("The argument " + arg + " is not a number");
        }
        return defaultValue;
    }

    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 2;
        if (args.length > 0){
            numberOne = parsInt(args[0], numberOne);
        }
        if (args.length > 1){
            numberTwo = parsInt(args[1], numberTwo);
        }
        int mediaAritmetica = (numberOne + numberTwo) / 2;
        System.out.println("Media aritmentica a numerelor " + numberOne + " si " + numberTwo + " este " + mediaAritmetica);
    }
}
