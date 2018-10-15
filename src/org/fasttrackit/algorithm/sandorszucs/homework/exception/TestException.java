package org.fasttrackit.algorithm.sandorszucs.homework.exception;

import java.util.*;

/**
 * @author ttritean
 * @since 10/9/2018
 */
public class TestException {

    public static void readInt(String number) throws NumberFormatException {

        int numberToInt = Integer.parseInt(number);
        System.out.println(numberToInt);
    }

    public static void main(String args[]) {
//example abouot equals : set and Map
        Vehicle v1 = new Vehicle("ford1","x");
        Vehicle v2 = new Vehicle("vehic2","y");
        Vehicle v3 = new Vehicle("ford1","x");

        Map<String, List<Vehicle>> vegMap = new HashMap<>();


        vegMap.put("veerve",new ArrayList<>());
        vegMap.get("veerve").add(v1);
//        vegMap.put("veerve",v1);


        Set<Vehicle> vehicles = new HashSet<>();
        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(v3);

        System.out.println("Setul are nr de elemente:" + vehicles.size());
        Vehicle v4 = v1;

        System.out.println(v1.equals(v2));
        System.out.println(v1.equals(v3));



//        Magazin magazin = new Magazin();
//        magazin.addVehicle(new Vehicle("BMW"));
//        magazin.addVehicle(new Vehicle("Ford"));
//        magazin.addVehicle(new Vehicle("Trabant"));
//        magazin.addVehicle(new Vehicle("ala"));
//
//        try {
//            magazin.checkAllNamesWithCheckedException();
//        } catch (MyCheckedException mre) {
//            System.out.println("---------------------------");
//
//            System.out.println("IN TEST EXCPTION AM PRINS VEHICLE EXCEPTION");
//            System.out.println(mre);
////
//            System.out.println("---------------------------");
//            System.out.println("catched exception thrown by Magazin");
//        }
//

//        readInt("123");
//        int a = 2;
//
//        try {
//            //open connection
//            readInt("4");
//            readInt("ala");
//        } finally {
//            System.out.println("FINALLY");
//
//            }
//
//
//
//        try {
//            readInt("bala");
//        }catch (NumberFormatException nfe) {
//            System.out.println(nfe.getMessage());
//            System.out.println("Give me a number please, not a sentence.");
//        }
    }

}
