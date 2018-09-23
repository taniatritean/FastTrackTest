package org.fasttrackit.algorithm.tania;

import java.util.Scanner;

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
public class Exercise12 {
    //  O clasa are urmatoarele lucruri:
    //prima linie e packetul (folderul din care face parte)
    //pe urma importurile - aici sunt clasele care se folosesc de aceasta clasa
    // declaratia clasei : public class Exercise12 in cazul de fata
    // fielduri - despre acestea vom vorbi la urmatorul lab - nu apar in aceasta clasa, sunt optionale
    //metode - in clasa aceasta avem public static void main(String[] args)

    //metodele fac parte obligatoriu din clasa, deci ele sunt intre acoladele clasei
    // ... acolada deschisa dupa numele clasei si acolada de la finalul fisierului - altfel codul nu compileaza!!!


    //orice declarare de metoda are:
    // access modifier (public in cazul acesta) - acesta va determina cine vede si cine are access la metoda (despre asta mai multe la next lab)
    // tipul de date returned (in cazul de fata void ceea ce inseamna ca metoda / functia nu returneaza nimic)
    //numele metodei - main in cazul de fata
    //parametrii de intrare - in cazul de fata un sir de stringuri numit args
    public static void main(String[] args) {

        int maxSumaDeControl = 3;
        String[] sirDeNumereCaStringuri = new String[]{"111", "11", "101"};


        // declaram variabila sumOfDigitsFromNumber1 de tipul int  care va fi egala cu rezultatul functiei computeSumOfDigits
        //functia/metoda va fi chemata cu parametrul "111"
        //rezultatul functiei va fi 3
        //deci variabila sumOfDigitsFromNumber1 va avea valoarea 3
        String firstNumber = sirDeNumereCaStringuri[0];// fisrt numeber va fi primul numar din sir de pe pozitia 0
        int sumOfDigitsFromNumber1 = computeSumOfDigits(firstNumber);

        // declaram variabila sumOfDigitsFromNumber2 de tipul int  care va fi egala cu rezultatul functiei computeSumOfDigits
        //functia/metoda va fi chemata cu parametrul "11"
        //rezultatul functiei va fi 4
        //deci variabila sumOfDigitsFromNumber2 va avea valoarea 4
        String secondNumber = sirDeNumereCaStringuri[1];// fisrt numeber va fi primul numar din sir de pe pozitia 1
        int sumOfDigitsFromNumber2 = computeSumOfDigits(secondNumber);

        // declaram variabila sumOfDigitsFromNumber2 de tipul int  care va fi egala cu rezultatul functiei computeSumOfDigits
        //functia/metoda va fi chemata cu parametrul "101"
        //rezultatul functiei va fi 2
        //deci variabila sumOfDigitsFromNumber2 va avea valoarea 2
        String treiNumber = sirDeNumereCaStringuri[2];// fisrt numeber va fi primul numar din sir de pe pozitia2
        int sumOfDigitsFromNumber3 = computeSumOfDigits(treiNumber);

//tot ce e mai sus se poate scrie cu un for - for pe sirul de elemente - dar ca sa fie mai usor de citit codul am lasat asa deocamdata

        // initializam maximul numarului cu 0
        int maximulNumaruluiDinSur = 0;
        int result = 0;
        //maxSumaDeControl are valoare 3
        if (sumOfDigitsFromNumber1 < maxSumaDeControl) { //verificam ca numarul de control al numarului este maimic decat 3
            int numberConvertedToNumber = Integer.parseInt(firstNumber);
            //verificam ca numarul e mai mare decat maximul
            //daca e mai mare, schimbam maximul
            //daca nu e mai mare lasam maximul precedent, deci nu facem nimic
            if (numberConvertedToNumber > maximulNumaruluiDinSur) {
                result = numberConvertedToNumber;
            }
        }

        if (sumOfDigitsFromNumber2 < maxSumaDeControl) { //verificam ca numarul de control al numarului este maimic decat 3
            int numberConvertedToNumber = Integer.parseInt(secondNumber);
            //verificam ca numarul e mai mare decat maximul
            //daca e mai mare, schimbam maximul
            //daca nu e mai mare lasam maximul precedent, deci nu facem nimic
            if (numberConvertedToNumber > maximulNumaruluiDinSur) {
                result = numberConvertedToNumber;
            }
        }

        if (sumOfDigitsFromNumber3 < maxSumaDeControl) { //verificam ca numarul de control al numarului este maimic decat 3
            int numberConvertedToNumber = Integer.parseInt(treiNumber);
            //verificam ca numarul e mai mare decat maximul
            //daca e mai mare, schimbam maximul
            //daca nu e mai mare lasam maximul precedent, deci nu facem nimic
            if (numberConvertedToNumber > maximulNumaruluiDinSur) {
                result = numberConvertedToNumber;
            }
        }
        //Comanda de tiparire pe consola se cheama obiectu System din el chemam un alt obiet copil out si din el metoda println
        System.out.println("Cel mai mare numar din sir care indeplineste conditia de numar de control < 3 este: " + result);

    }

    //O metoda/functie care calculeaza suma cifrelor numarului
    //orice declarare de metoda are:
    // access modifier (public in cazul acesta) - acesta va determina cine vede si cine are access la metoda (despre asta mai multe la next lab)
    // tipul de date returned (in cazul de fata int ceea ce inseamna ca metoda / functia returneaza un numar)
    //numele metodei - computeSumOfDigits in cazul de fata
    //parametrii de intrare - in cazul de fata un string numit numberString
    public static int computeSumOfDigits(String numberString) {
        //declar o variabila in care voi calcula suma
        //suma va fi un numar - deci tipul variabilei e int
        //numele variabilei trebuie sa fie unul cu semnificatie - deci am numit-o ca suma de cifre
        int sumOfDigits = 0;

        //parcurgem pas cu pas(variabila index), din unu in unu(index++), fiecare character al stringului numit numberString
        //pana cand pasul e mai mic decat lungimea stringului
        //lungimea unui string e numarul de charactere pe care le are stringul
        //variabila index e pasul la care sunt in for, al catelea pas e , porning de la 0 in cazul acesta
//        index++ este ca si cum as scrie index=index+1 e acelasi lucru
//
//        so ... pt fiecare pas pornind de la 0, mergand din 1 in 1 atata timp cat pasul e mai mic decat lungimea stringului
        //adaugam la suma cifra
        for (int index = 0; index < numberString.length(); index++) {
            //aici se adauga la suma preexsitenta, noua cifra citita

            //numberString.charAt(index) - ia characterul de pe pozitia index din string
            //de ex din stringul "123", char de pe poz 0 e '1',char de pe poz 1 e '2', char de pe poz 2 e '3'
            char charFromIndexInNumber = numberString.charAt(index);

            //se converteste char la String - pt ca metoda Integer.parseInt cere ca parametru un string nu un char
            String charToString = Character.toString(charFromIndexInNumber);
            //convertim Stringul la numar - ca tip de data
            int charConvertedToInt = Integer.parseInt(charToString);
            //Adunam numarul la suma
            sumOfDigits += charConvertedToInt;

            //se mai putea scrie si :
//            sumOfDigits =sumOfDigits + Integer.parseInt("" + numberString.charAt(index));
            //de ex din stringul "123", daca incercati sa accesati si numberString.charAt(3) => exceptie - sirul are doar 3 elem deci maxim index acceptat e 2 pt ca incepe de la 0
        }
        System.out.println("Sum of  number: " + numberString + " is : " + sumOfDigits);
        //returnam rezultatul functiei - trebuie sa fie de acelasi tip cum e declarat la inceputul metodei deci int
        return sumOfDigits;
    }
}