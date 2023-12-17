package modele;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class GestionCommande {

    private ObservableList<Commandes> listeCommandes;

    public GestionCommande() {
        listeCommandes = FXCollections.observableArrayList();
    }

    public ObservableList<Commandes> getListeCommandes() {
        return listeCommandes;
    }

    public void setListeCommandes(ObservableList<Commandes> listeCommandes) {
        this.listeCommandes = listeCommandes;
    }

    public void ajouterCommande(Commandes commande) {
        listeCommandes.add(commande);
    }

    public void supprimerCommande(Commandes commande) {
        listeCommandes.remove(commande);
    }
}
