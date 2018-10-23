package org.fasttrackit.algorithm.andreeasauchea.exception;

import java.util.HashSet;
import java.util.Set;

public class TestException {
    public static void readInt(String number) throws NumberFormatException {

        int numberToInt = Integer.parseInt(number);
        System.out.println(numberToInt);
    }

    public static void main(String[] args) {

// exemple about equals : set and Map

        Vehicle v1 = new Vehicle("Ford1", "x");
        Vehicle v2 = new Vehicle("vehi2", "y");
        Vehicle v3 = new Vehicle("Ford1", "x");


        Set<Vehicle> vehicles = new HashSet<>();
        vehicles.add(v1);
        vehicles.add(v2);

        boolean added = vehicles.add(v3);
        System.out.println("I added in the set  the v3 "+ added);
        System.out.println("Setul are numar de elemente: " + vehicles.size());

        System.out.println(v1.equals(v2));
        System.out.println(v1.equals(v3));



    /*    Magazin magazin = new Magazin();
        magazin.addVehicle(new Vehicle("BMW"));
        magazin.addVehicle(new Vehicle("Ford"));
        magazin.addVehicle(new Vehicle("Trabant"));
        magazin.addVehicle(new Vehicle("ala"));

       try {
           magazin.checkAllNames();
       }catch (MyRuntimeException mre){
           System.out.println("In test am prins vehicle exception");
           System.out.println(mre.getStackTrace());
           System.out.println("catched exception thrown by magazin");
       }
             readInt("123");
      try {
          readInt("ala");
      } catch (NumberFormatException nfe) {
          System.out.println(nfe.getMessage());
          System.out.println("Give me a number please, not a sentence.");
       } finally {
          System.out.println("FINALLY");

    }*/

    }
}
