package org.fasttrackit.algorithm.sandorszucs.homework.exception;

public class Vehicle {

    private String name;

    private String serie;
    public Vehicle(String name) {
        this.name = name;
    }
    public Vehicle(String name, String seria) {
        this.name = name;
        this.serie = seria;
    }

    public String getSerie() {
        return serie;
    }

//    @Override
//    public boolean equals(Object obj) {
//       return serie.equals(((Vehicle)obj).getSerie());
//    }
//
//    @Override
//    public int hashCode() {
//        return serie.hashCode();
//    }

    public String getName() {
        return name;
    }

    public boolean isNameValid(String name) throws MyRuntimeException {
        System.out.println("Numele de validat este " + name);
        if (name.startsWith("a")) {
            throw new MyRuntimeException();
        }
        return false;
    }

    public boolean isNameValid() throws MyCheckedException {
        System.out.println("Numele de validat este " + name);
        if (name.startsWith("a")) {
            throw new MyCheckedException();
        }
        return false;
    }


}
