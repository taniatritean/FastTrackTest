package org.fasttrackit.algorithm.tania.oop.exception;

/**
 * @author ttritean
 * @since 10/9/2018
 */
public class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

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
