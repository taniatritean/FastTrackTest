package org.fasttrackit.algorithm.andreeasauchea;

import org.fasttrackit.algorithm.andreeasauchea.figurigeometrice.Cerc;
import org.fasttrackit.algorithm.andreeasauchea.figurigeometrice.FiguraGeometrica;
import org.fasttrackit.algorithm.andreeasauchea.figurigeometrice.Patrat;
import org.fasttrackit.algorithm.andreeasauchea.figurigeometrice.Triunghi;

import java.util.ArrayList;
import java.util.List;

public class OOPExercitiu1 {
    public static void main(String[] args) {
        List<FiguraGeometrica> forme = new ArrayList<>();
        /*FiguraGeometrica cerc = new Cerc(3);
        FiguraGeometrica patrat = new Patrat(4);
        FiguraGeometrica triunghi = new Triunghi(2, 3, 4);
        forme.add(0, cerc);
        forme.add(1, patrat);
        forme.add(2, triunghi);*/
        forme.add(new Cerc(3));
        forme.add(new Patrat(4));
        forme.add(new Triunghi(2, 3, 4));
       /* for (int index = 0; index < forme.size(); index++) {
            forme.get(index).denumire();
            forme.get(index).perimetru();
            if (forme.get(index) instanceof Cerc) {
                Cerc cerc1 = (Cerc) forme.get(index);
                cerc1.raza();
            }
        }*/
        for(FiguraGeometrica figuraGeometrica : forme){
            figuraGeometrica.denumire();
            figuraGeometrica.perimetru();
            if (figuraGeometrica instanceof Cerc){
                ((Cerc) figuraGeometrica).raza();
            }
        }
    }
}




