package org.fasttrackit.algorithm.david.TemaMagazin;


public class Main {
    public static void main(String[] args) {
        ListaProduse listaProduse=new ListaProduse();
        try {
            listaProduse.addProdus("mobilier", "scaun", 12);
        }catch(DuplicatedProductt dp){
            System.out.println("This name is already used.");
        }
        try {
            listaProduse.addProdus("canapea","scaun",13);
        }catch(DuplicatedProductt dp){
            System.out.println("This name is already used.");
        }

        try{
            listaProduse.addProdus("mobilier","perete",100);
        }catch (DuplicatedProductt dp){
            System.out.println("This name is already used.");
        }
        try{
            listaProduse.addProdus("mobilier","canapea",120);
        }catch (DuplicatedProductt dp){
            System.out.println("This name is already used.");
        }try{
            listaProduse.addProdus("bucatarie","frigider",102);
        }catch (DuplicatedProductt dp){
            System.out.println("This name is already used.");
        }try{
            listaProduse.addProdus("bucatarie","termopan",122);
        }catch (DuplicatedProductt dp){
            System.out.println("This name is already used.");
        }try{
            listaProduse.addProdus("sufragerie","ciorap",122);
        }catch (DuplicatedProductt dp){
            System.out.println("This name is already used.");
        }try{
            listaProduse.addProdus("sufragerie","fotoliu",122);
        }catch (DuplicatedProductt dp){
            System.out.println("This name is already used.");
        }
        listaProduse.show();
    }
}
