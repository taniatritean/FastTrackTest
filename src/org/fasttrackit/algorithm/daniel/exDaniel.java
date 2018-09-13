package org.fasttrackit.algorithm.daniel;
import java.util.Scanner;
//Se da un sir de numere ordonate crescator. 
//Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia pe care s-a
//gasit, altfel se va afisa -1.( o sa citesc un sir o sa-l ordonez apoi o sa raspund cerintei)
public class exDaniel {

    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        boolean flag= true;
        int i,j,temp,v=0;
        int a[]= new int[30];
        System.out.println("enter n (nr elemente sir) ");
            int n=s.nextInt();
        System.out.println("intropd numarul care sa fie cautat in sir");
        int x=s.nextInt();
        //citirea elem sirului
        for(i=0;i<n;i++) {
            System.out.println("introd elementele sirului");
            a[i] = s.nextInt();
        }
        //ordonarea sirului crescator
        while ( flag )
        {
            flag= false;
            for( j=0;  j < n -1;  j++ )
            {
                if ( a[ j ] >a[j+1] )
                {
                    temp = a[ j ];
                    a[ j ] = a[ j+1 ];
                    a[ j+1 ] = temp;
                    flag = true;
                }
            }
        }


        //afisam sirul ordonat
        System.out.println("Sirul ordonat este : ");
        for(i=0;i<n;i++)
        System.out.print("a=  " + a[i] + "  ");
        System.out.print("\n");

        //aflam daca valoarea x se afla in sir si returanm pozitia
        for (i=0;i<n;i++)
            if (a[i] == x ) {
                System.out.println(" pozitia la care se afla este : " + i);
                break;


            }
            else v=v+1;

                    if (v==n) {
                    System.out.println("-1");
                        }



    }

}