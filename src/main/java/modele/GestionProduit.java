package modele;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class GestionProduit {
    private static ObservableList<Produits>listeProduits;

    public void GestionProduits(){
        listeProduits = FXCollections.observableArrayList();
    }

}
