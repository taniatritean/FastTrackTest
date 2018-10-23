package org.fasttrackit.algorithm.georgiana;
//Se se calculeze suma primelor n numere naturale, unde n este declarat
public class Problema11 {
    public static void main(String[] args) {
        int n=20;
        int i;
        int s=0;
                for (i=1;i<=n;i++)
                    s=s+i;
        System.out.println(s);
    }
}
