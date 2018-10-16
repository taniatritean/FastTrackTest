package org.fasttrackit.algorithm.tania.oop.lab6;

/**
 * @author ttritean
 * @since 10/2/2018
 */
public class Om {

    private String nume;
    private int varsta;

    protected String getMagicString() {
        return "om";
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;

    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public boolean equals(Object obj) {

        return nume.equals(((Om)obj).getNume());
    }

    @Override
    public int hashCode() {
        return nume.hashCode();
    }
}
