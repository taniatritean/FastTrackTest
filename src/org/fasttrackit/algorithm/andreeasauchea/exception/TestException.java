package org.fasttrackit.algorithm.andreeasauchea.exception;

public class TestException {
    public static void readInt(String number) throws NumberFormatException {

        int numberToInt = Integer.parseInt(number);
        System.out.println(numberToInt);
    }

    public static void main(String[] args) {

        Magazin magazin = new Magazin();
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

        //      readInt("123");
    //    try {
      //      readInt("ala");
        //} catch (NumberFormatException nfe) {
          //  System.out.println(nfe.getMessage());
            //System.out.println("Give me a number please, not a sentence.");
       // } finally {
         //   System.out.println("FINALLY");

    }
}
