package org.fasttrackit.algorithm.david.OOP1;

import java.util.LinkedList;

public class Main {
    private static LinkedList<FormeGeometrice> formeGeometrice=new LinkedList<>();

    public static void main(String[] args) {
        Cerc c=new Cerc(5);
        Patrat p=new Patrat(6);
        Triunghi t=new Triunghi(1,2,3);

        formeGeometrice.add(c);
        formeGeometrice.add(p);
        formeGeometrice.add(t);

        tiparireForme();
    }

    public static void tiparireForme(){
        for(int i=0;i<formeGeometrice.size();i++){
            FormeGeometrice formaGeometricaDinSir = formeGeometrice.get(i);
            formaGeometricaDinSir.getName();
            formaGeometricaDinSir.getPerimeter();

            if (formaGeometricaDinSir instanceof  Cerc) {
                ((Cerc) formaGeometricaDinSir).getRadius();
            }
            if(formaGeometricaDinSir instanceof  Patrat) {
                ((Patrat) formaGeometricaDinSir).getArea();
            }
        }
    }
}
