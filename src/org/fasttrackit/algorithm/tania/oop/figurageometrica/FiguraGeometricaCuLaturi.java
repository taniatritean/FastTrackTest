package org.fasttrackit.algorithm.tania.oop.figurageometrica;


/**
 * @author ttritean
 * @since 9/25/2018
 */
public abstract class FiguraGeometricaCuLaturi implements FormaGeometricaTania {

    private int color;

    public abstract int getNumberOfLaturi();

    public String getDenumireMatematica() {
        return "aceasta este o figura cu laturi";
    }

    protected String getInternalName() {
        return "internal name";
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
