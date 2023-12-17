package modele;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Commandes {
    private StringProperty nomCommandeProperty;
    private StringProperty puCommandeProperty;
    private StringProperty qteCommandeProperty;
    private StringProperty sommeCommandeProperty;
    private StringProperty dateCommandeProperty;
    private StringProperty refCommandeProperty;

    public Commandes() {
        this.nomCommandeProperty = new SimpleStringProperty();
        this.puCommandeProperty = new SimpleStringProperty();
        this.qteCommandeProperty = new SimpleStringProperty();
        this.sommeCommandeProperty = new SimpleStringProperty();
        this.dateCommandeProperty = new SimpleStringProperty();
        this.refCommandeProperty = new SimpleStringProperty();
    }
    public Commandes(String nomCommande, String puCommande, String qteCommande, String sommeCommande, String dateCommande, String refCommande) {
        this.nomCommandeProperty = new SimpleStringProperty(nomCommande);
        this.puCommandeProperty = new SimpleStringProperty(puCommande);
        this.qteCommandeProperty = new SimpleStringProperty(qteCommande);
        this.sommeCommandeProperty = new SimpleStringProperty(sommeCommande);
        this.dateCommandeProperty = new SimpleStringProperty(dateCommande);
        this.refCommandeProperty = new SimpleStringProperty(refCommande);
    }

    public String getNomCommandeProperty() {
        return nomCommandeProperty.get();
    }

    public StringProperty nomCommandePropertyProperty() {
        return nomCommandeProperty;
    }

    public void setNomCommandeProperty(String nomCommandeProperty) {
        this.nomCommandeProperty.set(nomCommandeProperty);
    }

    public String getPuCommandeProperty() {
        return puCommandeProperty.get();
    }

    public StringProperty puCommandePropertyProperty() {
        return puCommandeProperty;
    }

    public void setPuCommandeProperty(String puCommandeProperty) {
        this.puCommandeProperty.set(puCommandeProperty);
    }

    public String getQteCommandeProperty() {
        return qteCommandeProperty.get();
    }

    public StringProperty qteCommandePropertyProperty() {
        return qteCommandeProperty;
    }

    public void setQteCommandeProperty(String qteCommandeProperty) {
        this.qteCommandeProperty.set(qteCommandeProperty);
    }

    public String getSommeCommandeProperty() {
        return sommeCommandeProperty.get();
    }

    public StringProperty sommeCommandePropertyProperty() {
        return sommeCommandeProperty;
    }

    public void setSommeCommandeProperty(String sommeCommandeProperty) {
        this.sommeCommandeProperty.set(sommeCommandeProperty);
    }

    public String getDateCommandeProperty() {
        return dateCommandeProperty.get();
    }

    public StringProperty dateCommandePropertyProperty() {
        return dateCommandeProperty;
    }

    public void setDateCommandeProperty(String dateCommandeProperty) {
        this.dateCommandeProperty.set(dateCommandeProperty);
    }

    public String getRefCommandeProperty() {
        return refCommandeProperty.get();
    }

    public StringProperty refCommandePropertyProperty() {
        return refCommandeProperty;
    }

    public void setRefCommandeProperty(String refCommandeProperty) {
        this.refCommandeProperty.set(refCommandeProperty);
    }




}
