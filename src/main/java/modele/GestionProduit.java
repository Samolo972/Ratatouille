package modele;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class GestionProduit {
    private static Produits monProduit;
    private ObservableList<Produits> listeProduits;

    public GestionProduit() {
        monProduit = new Produits();
        listeProduits = FXCollections.observableArrayList();
    }

    public static Produits getMonProduit() {
        return monProduit;
    }

    public static void setMonProduit(Produits monProduit) {
        GestionProduit.monProduit = monProduit;
    }

    public ObservableList<Produits> getListeProduits() {
        return listeProduits;
    }

    public void setListeProduits(ObservableList<Produits> listeProduits) {
        this.listeProduits = listeProduits;
    }


    public void ajouterProduit(Produits produit) {
        listeProduits.add(produit);
    }


    public void supprimerProduit(Produits produit) {
        listeProduits.remove(produit);
    }

}
