package org.fasttrackit.algorithm.andreeasauchea.problemaoptionalalab7;

import java.util.*;
import java.io.*;

public class Magazin {
    public static void main(String[] args) {

        Map<String, List<Produs>> catalog = new HashMap<>();

        String filePath = "src\\org\\fasttrackit\\algorithm\\andreeasauchea\\problemaoptionalalab7\\catalog.txt";
        String line;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null){
                String[] parts = line.split(",", 3);
                if (parts.length >= 3) {
                    String name = parts[0];
                    String category = parts[1];
                    String price = parts[2];
                    Produs produs = new Produs(name, category, Double.valueOf(price));
                    if (catalog.get(category) == null){
                        List<Produs> list = new ArrayList<>();
                        list.add(produs);
                        catalog.put(category, list);
                    } else {
                        List<Produs> temporal = catalog.get(category);
                        if (isDuplicatedProduct(temporal, produs)) {
                            throw new DuplicatedProduct();
                        } else{
                            temporal.add(produs);
                        }
                    }
                } else {
                    System.out.println("ignoring line: " + line);
                }
            }

            for (String key : catalog.keySet()) {
                System.out.println(key + ":" + catalog.get(key).toString());
            }
            reader.close();
        } catch (FileNotFoundException fnf) {
            System.out.println("Document inexistent.");
        } catch (IOException io){
            System.out.println("No input.");
        } catch (DuplicatedProduct dp){
            System.out.println("Ati introdus produs duplicat.");
        }

        for (String key : catalog.keySet()) {
            System.out.println(key + ":" + catalog.get(key).size());
        }

        List<Produs> produsList = new ArrayList<>();
        for (String key : catalog.keySet()) {
            produsList.addAll(catalog.get(key));
        }

        if (produsList.size() > 0) {
            Collections.sort(produsList, new Comparator<Produs>() {
                @Override
                public int compare(final Produs object1, final Produs object2) {
                    return object1.getName().compareTo(object2.getName());
                }
            });
        }

        for (Produs produs : produsList){
            System.out.println(produs.toString());
        }

        for (String key : catalog.keySet()) {
            List<Produs> temp = catalog.get(key);
            if (temp.size() > 0) {
                Collections.sort(temp, new Comparator<Produs>() {
                    @Override
                    public int compare(final Produs object1, final Produs object2) {
                        return Double.compare(object1.getPrice(), object2.getPrice());
                    }
                });
            }
            System.out.println("Cel mai  scump produs al categoriei este: " + temp.get(temp.size()-1));
        }

    }

    private static boolean isDuplicatedProduct(List<Produs> temporal, Produs produs) {
        for (int index = 0; index < temporal.size(); index++){
            if (temporal.get(index).equals(produs)){
                return true;
            }
        }
        return false;
    }
}
