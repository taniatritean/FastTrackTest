package org.fasttrackit.algorithm.david.OOP1;
import java.util.LinkedList;

public class Main {
    private static LinkedList<FormeGeometrice> formeGeometrice=new LinkedList<>();
    public static void main(String[] args) {

        formeGeometrice.add(new Cerc(5));
        formeGeometrice.add(new Patrat(6));
        formeGeometrice.add(new Triunghi(1,2,3));

        tiparireForme();


    }
    public static void tiparireForme(){
        for(int i=0;i<formeGeometrice.size();i++){
            formeGeometrice.get(i).getName();
            formeGeometrice.get(i).getPerimeter();
        }
    }
}
