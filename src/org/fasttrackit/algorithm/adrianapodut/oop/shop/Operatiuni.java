package org.fasttrackit.algorithm.adrianapodut.oop.shop;


import java.util.List;
import java.util.Scanner;

public class Operatiuni {

    public static void afisareCatalog(Catalog catalog) {
        //se afiseaza categoriile si produsele catalogului
        System.out.println("Categoriile catalogului " + catalog.getNumeMagazin() + " sunt: ");
        //se extrage lista de categorii ale catalogului
        List<CategorieDeProduse> categoriileDeAfisat = catalog.getCategoriileCatalogului();
        for (int i = 0; i < categoriileDeAfisat.size(); i++) {
            //se afiseaza categoriile catalogului (din clasa catalog)
            System.out.println(categoriileDeAfisat.get(i).getNumeCategorie() + " - cu produsele: ");
            //se extrage lista de produse a categoriei i
            List<Produs> produseDeAfisat = catalog.getCategoriileCatalogului().get(i).getPoduseleCategoriei();
            for (int j = 0; j < produseDeAfisat.size(); j++) {
                System.out.println("        " + produseDeAfisat.get(j).getNumeProdus());
            }

        }
    }

    public static CategorieDeProduse alegereCategorie(Catalog catalog) {
        boolean categoriaExista = false;
        // se initializeaza variabila pentru categoria din lista de categorii ale catalogului ce va fi returnata
        CategorieDeProduse categorieDeReturnat = null;
        //se alege o categorie
        System.out.println("Alegeti o categorie (scrieti numele categoriei): ");
      do {
          Scanner inputs = new Scanner(System.in);
          String categorieAleasa = inputs.nextLine();
          //se extrage lista de categorii ale catalogului
          List<CategorieDeProduse> categoriileExistente = catalog.getCategoriileCatalogului();
          //se cauta categoria in lista de categorii pentru a fi returnata
          for (int i = 0; i < categoriileExistente.size(); i++) {
              if (categoriileExistente.get(i).getNumeCategorie().toUpperCase().equals(categorieAleasa.toUpperCase())) {
                  //cand s-a gasit categoria, se atribuie variabilei locale
                  categorieDeReturnat = categoriileExistente.get(i);
                  categoriaExista = true;
              }
          }
          if (!categoriaExista) {
              System.out.println("Categoria nu exista, incrcati din nou");
          }
      }while (!categoriaExista);
        //se returneaza categoria aleasa
        return categorieDeReturnat;
    }

    public static  Produs alegereProdus( CategorieDeProduse categorieAleasa){
      boolean produsExista = false;
        // se initializeaza variabila pentru produsul din lista de poroduse ale categoriei ce va fi returnata
        Produs produsulDeReturnat = null;
        //se extrage lista de produse ale categoriei
        List<Produs> produseleExistente = categorieAleasa.getPoduseleCategoriei();
        //se afiseaza lista de produse disponibile ale categoriei
        System.out.println("Alegeti unul din urmatoarele produse (scrieti numele produsului): ");
        for(int i=0;i<produseleExistente.size();i++){
            System.out.println(produseleExistente.get(i).getNumeProdus());
        }
        do {
            //se citeste produsul
            Scanner inputs = new Scanner(System.in);
            String produsAles = inputs.nextLine();
            //se cauta podusul in lista de produse pentru a fi returnat
            for (int i = 0; i < produseleExistente.size(); i++) {
                if (produseleExistente.get(i).getNumeProdus().toUpperCase().equals(produsAles.toUpperCase())) {
                    //cand s-a gasit produsul, se atribuie variabilei locale
                    produsulDeReturnat = produseleExistente.get(i);
                    produsExista = true;
                }
            }
            if (!produsExista) {
                System.out.println("Produsul nu exista, incrcati din nou");
            }
        }while (!produsExista);
        //se returneaza produsul aleas
        return produsulDeReturnat;
    }
    public static int alegereCantitate(){
        //se introduce cantitatea (numarul de bucati)
        System.out.println("Introduceti cantitatea (numarul de bucati): ");
        Scanner inputs = new Scanner(System.in);
        int cantitate = inputs.nextInt();
        inputs.nextLine();
        return cantitate;
    }

    public static boolean confirmareAdaugareProdus(){
        boolean confirmareProdus;
        //se cere confirmare pentru adaugarea produsului
        System.out.println("Doriti sa adaugati produsul? (Y - pentru Da, N pentru Nu)");
        //se citeste raspunsul
        Scanner inputs = new Scanner(System.in);
        String confirmare = inputs.nextLine();
        //se verifica raspunsul
        if (confirmare.toUpperCase().equals("Y")) {
            confirmareProdus = true;
        } else confirmareProdus = false;
        return confirmareProdus;
    }
    public static boolean confirmareContinuareCumparaturi() {
        boolean continuareCumparaturi;
        //se cere confirmare pentru continuarea cumparaturilor
        System.out.println("Doriti sa continuati cumparaturile? (Y - pentru Da, N pentru Nu)");
        //se citeste raspunsul
        Scanner inputs = new Scanner(System.in);
        String confirmare = inputs.nextLine();
        //se verifica raspunsul
        if (confirmare.toUpperCase().equals("Y")) {
            continuareCumparaturi = true;
        } else continuareCumparaturi = false;
        return continuareCumparaturi;
    }
}
