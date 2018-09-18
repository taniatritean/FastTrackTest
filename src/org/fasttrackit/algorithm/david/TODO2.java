package org.fasttrackit.algorithm.david;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TODO2 {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

            System.out.println("Dati lungimnea sirului:");
            int lungimeaSirului=scanner.nextInt();
            scanner.nextLine();
            int[] sirNumere = new int[lungimeaSirului];
            for(int i=0;i<lungimeaSirului;i++){
                System.out.println("Dati un numar din sir");
                sirNumere[i]=scanner.nextInt();
                scanner.nextLine();
            }
            int sumaNumere = 0;
            for (int pas = 0; pas < sirNumere.length; pas++) {
                sumaNumere += sirNumere[pas];
            }

            int sumaNumere1=0;
            int pas1=0;
            while(pas1<sirNumere.length){
                sumaNumere1+=sirNumere[pas1];
                pas1++;
            }

            int sumaNumere2=0;
            int pas2=0;
            do{
                sumaNumere2+=sirNumere[pas2];
                pas2++;
            }while(pas2<sirNumere.length);

            int sumaNumere3=sumaNumerelorSirului(sirNumere);

            if(sumaNumere==sumaNumere1&&sumaNumere1==sumaNumere2){
                System.out.println("sunt egale");
            }
            if(sumaNumere3==sumaNumere){
                System.out.println("Si astea sunt egale");
            }

            int mediaAritmetica = sumaNumere / sirNumere.length;
            System.out.println("Media aritmentica a numerelor este " + mediaAritmetica);

}
    private static int sumaNumerelorSirului(int[] sir){
        int suma=0;
        for(int i=0;i<sir.length;i++){
            suma+=sir[i];
        }
        return suma;
    }
    private static List<Integer> convertArgsToNumbersAsPrimitives(String[] args){
        List<Integer> numbers = new ArrayList();
        for(int i=0;i<args.length;i++){
            int x=Integer.parseInt(args[i]);
            numbers.add(x);
        }
        return numbers;
    }

}
