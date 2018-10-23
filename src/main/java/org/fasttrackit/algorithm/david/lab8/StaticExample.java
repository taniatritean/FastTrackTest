package org.fasttrackit.algorithm.david.lab8;

import java.util.ArrayList;
import java.util.List;

public class StaticExample {
    public static void main(String[] args) {

        Om om1=new Om("Viorel");
        System.out.println("Number of population is equal to " + Om.nrOfPopulation);
        Om om2=new Om("Gergica");
        System.out.println("Number of population is equal to " + Om.nrOfPopulation);
        Om om3=new Om("Daniela");
        System.out.println("Number of population is equal to " + Om.nrOfPopulation);

        List<Om> oameni=new ArrayList<>();
        oameni.add(om1);
        oameni.add(om2);
        oameni.add(om3);

        for(Om om:oameni){
            System.out.println("The name is "+om.getName());
            System.out.println("Number of population is equal to "+Om.nrOfPopulation);
        }
    }
}
