package org.fasttrackit.algorithm.andreeasauchea.agendatelefonica;

public class Person {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int id;

    public Person(){

    }

    public Person(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    private void validatePhoneNumber(String phoneNumber) {
//        for (int index = 0; index < phoneNumber.length(); index++) {
//            char characterOfString = phoneNumber.charAt(index);
//            if (characterOfString >= 48 && characterOfString <= 57) {
//                this.phoneNumber = phoneNumber;
//            } else
//                throw new IllegalArgumentException("Nu este un numar de telefon.");
//        }
//    }

    @Override
    public String toString() {
        return  firstName + " " + lastName + " " + phoneNumber;
    }
}
