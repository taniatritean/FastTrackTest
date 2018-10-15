package org.fasttrackit.algorithm.horatiu.laborator7;


import java.io.FileWriter;

import java.io.PrintWriter;

public class Scriere {
    public static void main(String[] arg) {
        try {
            FileWriter fw = new FileWriter("src\\org\\fasttrackit\\algorithm\\horatiu\\laorator7\\Readme.txt");
            PrintWriter pw = new PrintWriter(fw);

            pw.println("Name: Ioan Iacob");
            pw.println("Town: Tirgu Mures");
            pw.println("Country: Romania");

            pw.close();

        } catch (Exception ex) {
            System.out.println("Could not create file!");
        }
    }
}