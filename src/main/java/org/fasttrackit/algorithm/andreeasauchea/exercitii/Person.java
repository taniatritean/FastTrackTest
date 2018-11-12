package org.fasttrackit.algorithm.andreeasauchea.exercitii;

public class Person {

    private String name = new String();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        return name.equals(((Person)obj).getName());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
