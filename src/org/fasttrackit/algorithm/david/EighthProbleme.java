package org.fasttrackit.algorithm.david;
public class EighthProbleme {
    public static void main(String[] args) {
        int a=78987;
        int ogl=0;
        int copie=a;
        while(copie!=0){
            int cifra=copie%10;
            ogl=ogl*10+cifra;
            copie=copie/10;
        }
        if(a==ogl){
            System.out.println("Numarul "+a+" este palindrom.");
        }else{
            System.out.println("Numarul "+a+" nu este palindrom.");
        }



    }
}
