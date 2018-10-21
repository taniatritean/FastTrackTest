package org.fasttrackit.algorithm.sandorszucs.homework.lab8;
import java.util.ArrayList;
import java.util.List;

public class StaticExample {

    public static void main(String[] args) {

        Om om1 = new Om("Viorel");
        System.out.println("Number of population " + Om.nrOfPopulation);
        Om om2 = new Om("Georgica");
        System.out.println("Number of population " + Om.nrOfPopulation);
        Om om3 = new Om("Daniela");
        System.out.println("Number of population " + Om.nrOfPopulation);

        List<Om> oameni = new ArrayList<>();
        oameni.add(om1);
        oameni.add(om2);
        oameni.add(om3);


        om1.getName();
        for (Om om: oameni) {
            System.out.println(om.getName());
//            System.out.println("Number of population " + Om.nrOfPopulation);
        }

        ClasaDeLegatura.printNumberOfPopulation();







    }
}
