package org.fasttrackit.algorithm.andreeasauchea;

public class MedieAritmeticaSirAndreeaS {
    public static void main(String[] args) {
        int[] sirNumere = {1, 2, 3, 4};
        int sumaNumere = sum(sirNumere);
        int mediaAritmetica = sumaNumere / sirNumere.length;
        System.out.println("Media aritmentica a numerelor este " + mediaAritmetica);
        /*for (int pas = 0; pas < sirNumere.length; pas++) {
            sumaNumere += sirNumere[pas];
        }
        int pas=0;
        while (pas < sirNumere.length){
            sumaNumere += sirNumere[pas];
            pas++;
        }
        do{
            sumaNumere += sirNumere[pas];
            pas++;
        } while(pas < sirNumere.length);
        int mediaAritmetica = (sumaNumere / sirNumere.length);
        System.out.println("Media aritmentica a numerelor este " + mediaAritmetica);*/
        /*Integer[] argumentsToNumbersObjects = convertArgsToNumbersAsObjects(args);
        sumaNumere = 0;
        for (Integer pas = 0; pas < argumentsToNumbersObjects.length; pas++) {
            if (argumentsToNumbersObjects[pas] != null) {
                sumaNumere += argumentsToNumbersObjects[pas];
            }
        }

        int mediaAritmetica = sumaNumere / args.length;
        System.out.println("Media aritmentica a numerelor ca OBIECTE este " + mediaAritmetica);
        int[] argumentsToNumbersPrimitives = convertArgsToNumbersAsPrimitives(args);
        sumaNumere = 0;
        for (int pas = 0; pas < argumentsToNumbersPrimitives.length; pas++) {
            sumaNumere += argumentsToNumbersPrimitives[pas];
        }

         int mediaAritmetica = sumaNumere / args.length;
        System.out.println("Media aritmentica a numerelor ca PRIMITIVE este " + mediaAritmetica);*/
    }
    public static int sum(int[] a){
        int sumaNr = 0;
        for (int i=0; i < a.length; i++){
            sumaNr += a[i];
        }
        return sumaNr;
    }
    /*private static int[] convertArgsToNumbersAsPrimitives(String[] args) {
        int[] resultOfNumbers = new int[args.length];
        int indexInArray = 0;
        while (indexInArray < args.length) {
            resultOfNumbers[indexInArray] = readNumberFromArgumentsAsPrimitve(args, indexInArray);
            indexInArray++;
        }
        return resultOfNumbers;
    }
    private static int readNumberFromArgumentsAsPrimitve(String[] args, int indexOfTheArgument) throws NumberFormatException {
        int numberTwo = 0;
        if (args.length > indexOfTheArgument) {
            try {
                numberTwo = Integer.parseInt(args[indexOfTheArgument]);
            } catch (NumberFormatException nfe) {
                System.out.println("The argument " + args[indexOfTheArgument] + " is not a number");
            }
        }
        return numberTwo;
    }*/
    /*private static Integer[] convertArgsToNumbersAsObjects(String[] args) {
        Integer[] resultOfNumbers = new Integer[args.length];
        int indexInArray = 0;
        while (indexInArray < args.length) {
            resultOfNumbers[indexInArray] = readNumberFromArgumentsAsObject(args, indexInArray);
            indexInArray++;
        }
        return resultOfNumbers;
    }
    private static Integer readNumberFromArgumentsAsObject(String[] args, int indexOfTheArgument) throws NumberFormatException {
        Integer numberTwo = null;
        if (args.length > indexOfTheArgument) {
            try {
                numberTwo = Integer.parseInt(args[indexOfTheArgument]);
            } catch (NumberFormatException nfe) {
                System.out.println("The argument " + args[indexOfTheArgument] + " is not a number");
            }
        }
        return numberTwo;
    }*/

}
