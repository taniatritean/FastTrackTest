package org.fasttrackit.algorithm.david.lab8;

public class Om {
    public static int nrOfPopulation;
    private String name;

    public Om(String name) {
        this.name = name;
        nrOfPopulation++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
