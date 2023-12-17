package modele;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Produits {
    public StringProperty nomProduitProperty;
    public StringProperty prixProduitProperty;
    public StringProperty prixProduit1Property;
    public StringProperty refProduitProperty;
    public StringProperty typeProduitProperty;
    public StringProperty qteProduitProperty;


    public Produits(){
        this.nomProduitProperty = new SimpleStringProperty();
        this.prixProduitProperty = new SimpleStringProperty();
        this.qteProduitProperty = new SimpleStringProperty();
        this.refProduitProperty = new SimpleStringProperty();
        this.prixProduit1Property = new SimpleStringProperty();
        this.typeProduitProperty = new SimpleStringProperty();
    }


    public Produits(String nomProduit, String prixProduit, String refProduit, String typeProduit, String prixProduit1) {
        this.nomProduitProperty = new SimpleStringProperty(nomProduit);
        this.prixProduitProperty = new SimpleStringProperty(refProduit);
        this.qteProduitProperty = new SimpleStringProperty(typeProduit);
        this.refProduitProperty = new SimpleStringProperty(prixProduit);
        this.prixProduit1Property = new SimpleStringProperty(prixProduit1);
        this.typeProduitProperty = new SimpleStringProperty(typeProduit);  // Ajoutez cette ligne pour initialiser la propriété
    }




    public StringProperty getNomProduitProperty() {
        return nomProduitProperty;
    }

    public StringProperty nomProduitPropertyProperty() {
        return nomProduitProperty;
    }

    public void setNomProduitProperty(String nomProduitProperty) {
        this.nomProduitProperty.set(nomProduitProperty);
    }

    public String getPrixProduitProperty() {
        return prixProduitProperty.get();
    }

    public StringProperty prixProduitPropertyProperty() {
        return prixProduitProperty;
    }

    public void setPrixProduitProperty(String prixProduitProperty) {
        this.prixProduitProperty.set(prixProduitProperty);
    }

    public String getPrixProduit1Property() {
        return prixProduit1Property.get();
    }

    public StringProperty prixProduit1PropertyProperty() {
        return prixProduit1Property;
    }

    public void setPrixProduit1Property(String prixProduit1Property) {
        this.prixProduit1Property.set(prixProduit1Property);
    }

    public String getRefProduitProperty() {
        return refProduitProperty.get();
    }

    public StringProperty refProduitPropertyProperty() {
        return refProduitProperty;
    }

    public void setRefProduitProperty(String refProduitProperty) {
        this.refProduitProperty.set(refProduitProperty);
    }

    public String getTypeProduitProperty() {
        return typeProduitProperty.get();
    }

    public StringProperty typeProduitPropertyProperty() {
        return typeProduitProperty;
    }

    public void setTypeProduitProperty(String typeProduitProperty) {
        this.typeProduitProperty.set(typeProduitProperty);
    }

    public String getQteProduitProperty() {
        return qteProduitProperty.get();
    }

    public StringProperty qteProduitPropertyProperty() {
        return qteProduitProperty;
    }

    public void setQteProduitProperty(String qteProduitProperty) {
        this.qteProduitProperty.set(qteProduitProperty);
    }

}
