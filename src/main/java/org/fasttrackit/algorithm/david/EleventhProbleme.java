package org.fasttrackit.algorithm.david;

public class EleventhProbleme {
    public static void main(String[] args) {
        int n=4;// try to read n from user input (args or use scanner)
        int s=0;
        for(int i=0;i<n;i++){
            s+=(i+1);
        }
        System.out.println("Suma primelor "+n+" este egala cu "+s);
    }
}
