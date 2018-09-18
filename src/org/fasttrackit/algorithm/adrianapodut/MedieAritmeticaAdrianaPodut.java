package org.fasttrackit.algorithm.nagymartin;

public class MediaAritmetica {
//the name and declaration of this method must be the same always
    public static void main(String args[]) {

        //here we read the first argument given when running the program
        //the arguments are strings (so they can contain chars)
        //we convert the strings to number
        //if the arguments can not be converted to numbers- they contain characters we display a message
        int numberOne = 10;// a default number we want
        if (args.length > 0) { // if there are arguments when running the program
            try {
                numberOne = Integer.parseInt(args[0]);
            } catch (NumberFormatException nfe) {
                System.out.println("The argument " + args[0] + " is not a number");
                return;
            }
        }


        //here we read the second argument -index 1 - given when running the program
        //the arguments are strings (so they can contain chars)
        //we convert the strings to number
        //if the arguments can not be converted to numbers- they contain characters we display a message
        int numberTwo = 2;//a default number we want
        if (args.length > 1) {
            try {
                numberTwo = Integer.parseInt(args[1]); // see the index 1 for the second string from the args array
            } catch (NumberFormatException nfe) {
                System.out.println("The argument " + args[1] + " is not a number");
            }
        }


        int mediaAritmetica = (numberOne + numberTwo) / 2;
        System.out.println("Media aritmentica a numerelor " + numberOne + " si " + numberTwo + " este " + mediaAritmetica);

        //TODO - pt curiosi - INCERCATI SA GASITI PARTI COMUNE DE COD
        // SI SA EXTRAGETI METHODE/FUNCTII NOI IN ACEASTA CLASA si apoi sa le refolositi


    }
}
