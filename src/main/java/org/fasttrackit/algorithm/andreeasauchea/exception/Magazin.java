package org.fasttrackit.algorithm.andreeasauchea.exception;

import java.util.ArrayList;
import java.util.List;

public class Magazin {

    private List<Vehicle> vehicule = new ArrayList<>();

    public void addVehicle(Vehicle c) {
        vehicule.add(c);
    }

    public void checkAllNames() throws MyRuntimeException {
        for (Vehicle v : vehicule){
            try {
            v.isNameValid(v.getName());
        }catch (MyRuntimeException mre){
                System.out.println("In magazin am prins vehicle exception");
                System.out.println(mre.getStackTrace());
 //               System.out.println("Am prins exceptia pentru vehiculul cu numele " + v.getName());
                throw mre;
            }
        }
    }

    public void checkAllNamesWithCheckedException() throws MyChekedException {
        for (Vehicle v : vehicule){
            try {
                v.isNameValid();
            }catch (MyChekedException e){
                System.out.println("In magazin am prins vehicle exception");
                System.out.println(e);
                //               System.out.println("Am prins exceptia pentru vehiculul cu numele " + v.getName());
                throw e;
            }
        }
    }
}
