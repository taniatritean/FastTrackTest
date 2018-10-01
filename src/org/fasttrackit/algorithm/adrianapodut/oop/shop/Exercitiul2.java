package org.fasttrackit.algorithm.adrianapodut.oop.shop;


public class Exercitiul2 {
    public static void main(String args[]) {

        //se creaza catalogul
        Catalog catalog = new Catalog("Adriana");
        //se  creaza un catalog implicit (default, cu doua categorii si cate doua produse pentru fiecare categorie)
        creareaCataloguluiImplicit(catalog);
        //se creaza cosul de cumparaturi
        CosDeCumparaturi cosCumparaturi = new CosDeCumparaturi();
        //se initializeaza o variabila pentru verificarea continuarii cumparaturilor
        boolean continuareCumparaturi = true;
        while (continuareCumparaturi) {
            //se afiseaza categoriile si produsele catalogului
            Operatiuni.afisareCatalog(catalog);

            //se alege o categorie
            CategorieDeProduse categoriaAleasa = Operatiuni.alegereCategorie(catalog);
            System.out.println("s-a ales categoria: " + categoriaAleasa.getNumeCategorie());

            //se alege un produs
            Produs produsulAles = Operatiuni.alegereProdus(categoriaAleasa);
            System.out.println("s-a ales produsul: " + produsulAles.getNumeProdus());

            //se alege cantitatea
            int cantitateaAleasa = Operatiuni.alegereCantitate();
            System.out.println("s-a ales cantitatea: " + cantitateaAleasa);

            // se afiseaza totalul produsului
            cosCumparaturi.calculareTotalProdus(produsulAles, cantitateaAleasa);
            //confirmare adaugare produs in cos
            if (Operatiuni.confirmareAdaugareProdus()) {
                cosCumparaturi.adaugareProdusInCos(produsulAles, cantitateaAleasa);
                continuareCumparaturi = Operatiuni.confirmareContinuareCumparaturi();
            } else {
                continuareCumparaturi = Operatiuni.confirmareContinuareCumparaturi();
            }
            cosCumparaturi.calculareTotalCos();
            if (!continuareCumparaturi){
                System.out.println("Multumim. O zi frumoasa!");
            }
        }

    }

    private static void creareaCataloguluiImplicit(Catalog catalog) {
        //se creaza prima categorie de produse
        CategorieDeProduse categorieMobila = new CategorieDeProduse("Mobila", catalog);
        //se adauga categoria la lista categoriileCatalogului (din clasa Exercitiul2)
        //se creaza primul produs
        Produs scaun = new Produs("Scaun", 50, categorieMobila);
        //se creaza al doilea produs
        Produs dulap = new Produs("Dulap", 200, categorieMobila);

        //se creaza a doua categorie de produse
        CategorieDeProduse categorieEectrocasnice = new CategorieDeProduse("Electrocasnice", catalog);
        //se adauga categoria la lista
        //se creaza primul produs
        Produs aragaz = new Produs("Aragaz", 300, categorieEectrocasnice);
        //se creaza al doilea produs
        Produs frigider = new Produs("Frigider", 400, categorieEectrocasnice);
    }
}