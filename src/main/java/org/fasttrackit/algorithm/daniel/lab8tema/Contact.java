package org.fasttrackit.algorithm.daniel.lab8tema;

import java.io.Serializable;

public class Contact implements Serializable {
     private String name;
     private int number;
     public static int nrOfContacts=0;

     public Contact(String name,int number){
          this.name=name;
          this.number=number;
          nrOfContacts++;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getNumber() {
          return number;
     }

     public void setNumber(int number) {
          this.number = number;
     }
     public String toString() {
          return " Contact:    "  + name + "  " + number;
     }
     }

