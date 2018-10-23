package org.fasttrackit.algorithm.tania.oop.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ttritean
 * @since 10/9/2018
 */
public class Magazin {

    private List<Vehicle> vehicule = new ArrayList<>();


    public void addVehicle(Vehicle c) {
        vehicule.add(c);
    }

    public void checkAllNames() throws MyRuntimeException {
        for (Vehicle v : vehicule) {
            try {
                v.isNameValid(v.getName());
            } catch (MyRuntimeException mre) {
                System.out.println("IN MAGAZIN AM PRINS VEHICLE EXCEPTION");
                System.out.println(mre);
//                System.out.println("Am prins exceptia pentru vehiculul " + v.getName());
                throw mre;
            }
        }

    }


    public void checkAllNamesWithCheckedException() throws MyCheckedException {
        for (Vehicle v : vehicule) {
            try {
                v.isNameValid();
            } catch (MyCheckedException e) {
                System.out.println("IN MAGAZIN AM PRINS VEHICLE EXCEPTION");
                System.out.println(e);
//                System.out.println("Am prins exceptia pentru vehiculul " + v.getName());
                throw e;
            }
        }

    }


}
