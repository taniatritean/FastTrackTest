package org.fasttrackit.algorithm.david.TemaMagazin;

import java.util.*;

import static java.lang.Character.MIN_VALUE;

public class ListaProduse {

    private Map<String, Set<Produs>> produse=new HashMap<>();

    public void addProdus(String categorieProdus, String numeProdus, int pretProdus) throws DuplicatedProductt {

        if(esteEgal(numeProdus)==true){
            throw new DuplicatedProductt();
        }

        boolean w=false;
        for(String x:produse.keySet()){
            if(categorieProdus==x){
                w=true;
            }
        }

        Produs produs = new Produs(numeProdus, categorieProdus, pretProdus);

        if(w==false) {
            Set<Produs> listaProduse = new HashSet<>();
            listaProduse.add(produs);
            produse.put(categorieProdus, listaProduse);
        }else{
            Set<Produs> listax=produse.get(categorieProdus);
            listax.add(produs);
            produse.put(categorieProdus, listax);


        }
    }
    private boolean esteEgal(String numeProdus){
        for(Map.Entry<String, Set<Produs>> entry:produse.entrySet()){
            String key=entry.getKey();
            Set<Produs> lista=entry.getValue();
            for(Produs p:lista){
                if(p.getNume()==numeProdus){
                    return true;
                }
            }
        }
        return false;
    }





















    public void show(){
        Map<String, Set<Produs>> aranjata=new TreeMap<>(produse);
        for(Map.Entry<String, Set<Produs>> entry:aranjata.entrySet()){
            String key=entry.getKey();
            System.out.println(key+"----->");
            Set<Produs> lista=entry.getValue();
            int al=MIN_VALUE;
            String nume1="";
            int contor=0;
            for(Produs p:lista){
                contor++;
                System.out.println(p);
                if(al<p.getPret()){
                    al=p.getPret();
                    nume1=p.getNume();
                }
            }
            System.out.println("This category has "+contor+" elements");
            System.out.println("The most expensive item of this category("+al+"$) is "+nume1);
            System.out.println("********************************************************************************");
        }

    }
}

