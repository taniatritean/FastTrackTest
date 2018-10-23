package org.fasttrackit.algorithm.tania.oop.figurageometrica;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OOPExercise1 {

    public static void main(String[] args) {

        //creez o lista de figuri geometrice
        List<FormaGeometricaTania> formeGeometrice = new ArrayList<>();

//adaug in lista 3 figuri : cerc, patrat, triunghi;
        FormaGeometricaTania cerc1 = new CercTania(5);
        formeGeometrice.add(cerc1);
        formeGeometrice.add(new CercTania(5));
        formeGeometrice.add(new Patrat(6));
        formeGeometrice.add(new Triunghi(1, 2, 3));

        for (int i = 0; i < formeGeometrice.size(); i++) {
            FormaGeometricaTania formaGeometricaDinSir = formeGeometrice.get(i);
            System.out.println("-------------------------------");

            System.out.println("Numele figurii geometrice este: "
                    + formaGeometricaDinSir.getName());
            System.out.println("Perimetrul figurii geometrice este: "
                    + formaGeometricaDinSir.getPerimeter());

            //verificam daca e cerc
            if (formaGeometricaDinSir instanceof CercTania) {
                int radius = ((CercTania) formaGeometricaDinSir).getRadius();
                System.out.println("Raza figurii geometrice este: " + radius);
                //tiparim raza

            }
            //verificam daca e patrat
            if (formaGeometricaDinSir instanceof Patrat) {
                double area = ((Patrat) formaGeometricaDinSir).getArea();
                System.out.println("Aria figurii geometrice este: " + area);
//tiparim area
            }
        }

    }

}
