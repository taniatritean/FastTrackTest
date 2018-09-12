package org.fasttrackit.algorithm;

/**
 * @author ttritean
 * @since 9/11/2018
 */
public class MedieAritmeticaSir {

    public static void main(String args[]) {

        int[] sirNumere = {1, 2, 3, 4};
        int sumaNumere = 0;
        for (int pas = 0; pas < sirNumere.length; pas++) {
            sumaNumere += sirNumere[pas];
        }

        int mediaAritmetica = sumaNumere / sirNumere.length;
        System.out.println("Media aritmentica a numerelor este " + mediaAritmetica);


        //TODO IMPLEMENT WITH WHILE
        //TODO IMPLEMENT WITH DO UNTIL
        //TODO try to read the array from the console - as program arguments- you can use the method below or change it


        //TODO - try to figure out what is happening if I use the code like this:
        // And input arguments: 3 4 5 5
        //and input arguments: 3 a 5 b
        // HINT read about the diference between int as a primitive and Integer as an object
        Integer[] argumentsToNumbersObjects = convertArgsToNumbersAsObjects(args);
        sumaNumere = 0;
        for (Integer pas = 0; pas < argumentsToNumbersObjects.length; pas++) {
            if (argumentsToNumbersObjects[pas] != null) { // why do we need this - see the difference between primitve int and object Integer
                sumaNumere += argumentsToNumbersObjects[pas];
            }
        }
        //TODO - try to implement the same thing with while and do

        mediaAritmetica = sumaNumere / sirNumere.length;
        System.out.println("Media aritmentica a numerelor ca OBIECTE este " + mediaAritmetica);

        // or like this
        int[] argumentsToNumbersPrimitives = convertArgsToNumbersAsPrimitives(args);
        sumaNumere = 0;
        for (int pas = 0; pas < argumentsToNumbersPrimitives.length; pas++) {
            sumaNumere += argumentsToNumbersPrimitives[pas];
        }
        //TODO try to extract a method that computes the sum for a number array and use it

        mediaAritmetica = sumaNumere / sirNumere.length;
        System.out.println("Media aritmentica a numerelor ca PRIMITIVE este " + mediaAritmetica);

    }

    //NOTE the syntax String[] args or String args[] - both are working and both are ok
    private static Integer[] convertArgsToNumbersAsObjects(String[] args) {
        Integer[] resultOfNumbers = new Integer[args.length]; // we initialize an array of number o same length as the arguments array
        //TODO pt curiosi: in loc de un array de int cu length predefinit - incercati sa folositi List<Integer> numbers = new ArrayList();  numbers.add(convertedNumber);
        //TODO incercati sa vedeti care ar fi diferenta dintre array si list :)

        int indexInArray = 0; // NOTE indexes in arrays ion java are starting from 0
        while (indexInArray < args.length) {
            //TODO try to figure out what is happening here is an argument is not a number :) ?
            resultOfNumbers[indexInArray] = readNumberFromArgumentsAsObject(args, indexInArray);// we set uin the result array the converted number
            indexInArray++; //this will increment the index with 1=> it is the same as indexInArray = indexInArray + 1
        }
        return resultOfNumbers;
    }

    //NOTE the syntax String[] args or String args[] - both are working and both are ok
    private static int[] convertArgsToNumbersAsPrimitives(String[] args) {
        int[] resultOfNumbers = new int[args.length]; // we initialize an array of number o same length as the arguments array
        //TODO pt curiosi: in loc de un array de int cu length predefinit - incercati sa folositi List<Integer> numbers = new ArrayList();  numbers.add(convertedNumber);
        //TODO incercati sa vedeti care ar fi diferenta dintre array si list :)

        int indexInArray = 0; // NOTE indexes in arrays ion java are starting from 0
        while (indexInArray < args.length) {
            //TODO try to figure out what is happening here is an argument is not a number :) ?
            resultOfNumbers[indexInArray] = readNumberFromArgumentsAsPrimitve(args, indexInArray);// we set uin the result array the converted number
            // TODO what happens if I use readNumberFromArgumentsAsObject here - and why ?
            indexInArray++; //this will increment the index with 1=> it is the same as indexInArray = indexInArray + 1
        }
        return resultOfNumbers;
    }

    //converts a string to a number oa Object
    private static Integer readNumberFromArgumentsAsObject(String[] args, int indexOfTheArgument) throws NumberFormatException {
        Integer numberTwo = null; // NOTE THE DIFERENCE
        if (args.length > indexOfTheArgument) {
            try {
                numberTwo = Integer.parseInt(args[indexOfTheArgument]);
            } catch (NumberFormatException nfe) {
                System.out.println("The argument " + args[indexOfTheArgument] + " is not a number");
            }
        }
        return numberTwo;
    }

    //converts a string to a number as Primitive
    private static int readNumberFromArgumentsAsPrimitve(String[] args, int indexOfTheArgument) throws NumberFormatException {
        int numberTwo = 0; // NOTE THE DIFERENCE
        if (args.length > indexOfTheArgument) {
            try {
                numberTwo = Integer.parseInt(args[indexOfTheArgument]);
            } catch (NumberFormatException nfe) {
                System.out.println("The argument " + args[indexOfTheArgument] + " is not a number");
            }
        }
        return numberTwo;
    }
}
