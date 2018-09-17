package org.fasttrackit.algorithm.florinfagetan;

import java.util.Scanner;

public class TablaInmultiriiNMFagetan {
    public static void main(String[] args) {
        Scanner intraretastatura = new Scanner(System.in);
        System.out.println("numarul n:");
        int n = intraretastatura.nextInt();
        System.out.println("numarul m:");
        int m = intraretastatura.nextInt();
        if(n<0&&m<0){
            System.out.println("Numerele " +n+ "si" +m+ " a fost transformate in numere pozitive");
            n=n*(-1);
            m=m*(-1);
        }
        int max;
        int min;
        if(n>m){
            max=n;
            min=m;
        }else {
            max=m;
        min=n;
        }
        System.out.println("tabla inmultirii intre " +min+ "si" +max+ ":");

        for(int i=min; i<=max; i++) {

            int produs = min*i;
            System.out.println(min+ "x" +i+ "=" +produs);

            for(int j=0; j<=10; j++){

                int produs2 = j*i;
                System.out.println(j+ "x" +i+ "=" +produs2);



            }


        }
    }
}
