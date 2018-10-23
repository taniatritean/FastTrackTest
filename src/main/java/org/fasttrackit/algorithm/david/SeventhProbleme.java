package org.fasttrackit.algorithm.david;

public class SeventhProbleme {
    public static void main(String[] args) {
        int a=47986;
        int ogl=0;
        int copie=a;
        while(copie!=0){
            int cifra=copie%10;
            ogl=ogl*10+cifra;
            copie=copie/10;
        }
        System.out.println("Inversului numarului "+a+" este egal cu "+ogl);
    }
}
