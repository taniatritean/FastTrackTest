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
    }

    private static int readNumberFromArguments(String[] args, int indexOfTheArgument) throws NumberFormatException {
        int numberTwo = 0;
        if (args.length > indexOfTheArgument) {
            try {
                numberTwo = Integer.parseInt(args[indexOfTheArgument]);
            } catch (NumberFormatException nfe) {
                System.out.println("The argument " + args[indexOfTheArgument] + " is not a number");
                throw nfe;
            }
        }
        return numberTwo;
    }
}
