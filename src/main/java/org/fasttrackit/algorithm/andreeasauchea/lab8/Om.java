package org.fasttrackit.algorithm.andreeasauchea.lab8;

public class Om {

    private String name;
    public static int nrOfPopulation;

    public Om(String name) {
        this.name = name;
        Om.nrOfPopulation++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
