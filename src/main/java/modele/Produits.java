package modele;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Produits {
    public StringProperty nomProduitProperty;
    public FloatProperty prixProduitProperty;
    public  FloatProperty prixProduit1Property;
    public StringProperty refProduitProperty;
    public StringProperty typeProduitProperty;
    public IntegerProperty qteProduitProperty;


    public Produits(){
        this.nomProduitProperty = new SimpleStringProperty();
        this.prixProduitProperty = new SimpleFloatProperty();
        this.qteProduitProperty = new SimpleIntegerProperty();
        this.refProduitProperty = new SimpleStringProperty();
        this.prixProduit1Property = new SimpleFloatProperty();
        this.typeProduitProperty = new SimpleStringProperty();
    }

    // GETTERS
    public String getNomProduit() {
        return nomProduitProperty.get();
    }

    public float getPrixProduit() {
        return prixProduitProperty.get();
    }

    public float getPrixProduit1() {
        return prixProduit1Property.get();
    }

    public String getRefProduit() {
        return refProduitProperty.get();
    }

    public String getTypeProduit() {
        return typeProduitProperty.get();
    }

    public int getQteProduit() {
        return qteProduitProperty.get();
    }

    // SETTERS
    public void setNomProduit(String nomProduit) {
        this.nomProduitProperty.set(nomProduit);
    }

    public void setPrixProduit(float prixProduit) {
        this.prixProduitProperty.set(prixProduit);
    }

    public void setPrixProduit1(float prixProduit1) {
        this.prixProduit1Property.set(prixProduit1);
    }

    public void setRefProduit(String refProduit) {
        this.refProduitProperty.set(refProduit);
    }







}
