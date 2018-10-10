package org.fasttrackit.algorithm.andreeasauchea.exception;

import java.util.Objects;

public class Vehicle {

    private String name;
    private String serie;

    public Vehicle(String name){
        this.name = name;
    }

    public Vehicle (String name, String serie){
        this.name = name;
        this.serie = serie;
    }

    public String getName() {
        return name;
    }

    public boolean isNameValid (String name) throws MyRuntimeException{
        System.out.println("Numele de validat este " + name);
        if (name.startsWith("a")){
            throw new MyRuntimeException();
        }
        return false;
    }

    public boolean isNameValid () throws MyChekedException{
        System.out.println("Numele de validat este " + name);
        if (name.startsWith("a")){
            throw new MyRuntimeException();
        }
        return false;
    }

    public String getSerie() {
        return serie;
    }

    @Override
    public boolean equals(Object obj) {
        return serie.equals(((Vehicle)obj).getSerie());
    }

    @Override
    public int hashCode() {
        return serie.hashCode();
    }
}
