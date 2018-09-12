package org.fasttrackit.algorithm.daniel;
 import java.util.Scanner;
public class MedieAritmeticaDaniel{

    /** se citeste un nr N, sa se calculeze suma cifrelor*/
public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter n Value:  ");
    int n = s.nextInt();
    int sum=0;
    while (n>0) {
      sum=sum+(n%10);
      n=n/10;
      }
    System.out.println("Sum of Digits:"+sum);
    }

}

