package org.fasttrackit.algorithm.horatiu.laborator7;

import java.io.FileWriter;

import java.io.PrintWriter;


public void Citire(){
        try{  FileWriter fOut=new FileWriter("readme.txt");
            PrintWriter ps=new PrintWriter(fOut);

            ps.println("Name: Ioan Iacob");

            ps.println("Town: Tirgu Mures");

            ps.println("Country: Romania");

            ps.close();

            fOut.close();
        }catch(IOException ex){

        System.out.println("Could not create file.");

        System.exit(1);
        }
}

