package com.example.ratatouille;

import javafx.application.Platform;
import javafx.beans.property.IntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import modele.GestionProduit;
import modele.Produits;


import java.io.IOException;

import static javafx.beans.binding.Bindings.bindBidirectional;

public class produitsController {
    @FXML
    private TableColumn<Produits, String> PrixTab;

    @FXML
    private Label WelcomeUser;

    @FXML
    private Button accueil;

    @FXML
    private Button ajouterProduit;

    @FXML
    private Button commandes;

    @FXML
    private Button delProduit;

    @FXML
    private Button delProduitChamps;

    @FXML
    private TextField nomProduit;

    @FXML
    private TextField prixProduit;

    @FXML
    private TextField prixProduit1;

    @FXML
    private Button produits;

    @FXML
    private Pane qteProduit;

    @FXML
    private TableColumn<Produits, String> qteTab;

    @FXML
    private Button quitter;

    @FXML
    private TextField refProduit;

    @FXML
    private TextField searchBar;

    @FXML
    private Button tabBord;

    @FXML
    private TableColumn<Produits, String> tabNom;

    @FXML
    private TableView<Produits> tabProduit;

    @FXML
    private TableColumn<Produits, String> tabRef;

    @FXML
    private TableColumn<Produits, String> typeTab;

    @FXML
    private Button updateProduit;

    @FXML
    private ChoiceBox<String> typeProduit;

    private Produits produitInstance;

    @FXML
    private void initialize() {
        typeProduit.getItems().addAll("Legumes", "Fruits", "Viandes", "Fruit", "Viennoiserie", "Féculents", "Légumineuse", "Pains");

        tabRef.setCellValueFactory(cellData -> cellData.getValue().refProduitPropertyProperty());
        tabNom.setCellValueFactory(cellData -> cellData.getValue().nomProduitPropertyProperty());
        typeTab.setCellValueFactory(cellData -> cellData.getValue().typeProduitPropertyProperty());
        PrixTab.setCellValueFactory(cellData -> cellData.getValue().prixProduitPropertyProperty());
        qteTab.setCellValueFactory(cellData -> cellData.getValue().qteProduitPropertyProperty());

        tabRef.setCellFactory(TextFieldTableCell.forTableColumn());
        tabNom.setCellFactory(TextFieldTableCell.forTableColumn());
        typeTab.setCellFactory(TextFieldTableCell.forTableColumn());
        PrixTab.setCellFactory(TextFieldTableCell.forTableColumn());
        qteTab.setCellFactory(TextFieldTableCell.forTableColumn());


        tabProduit.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

    }

    @FXML
        public void Ajouter(ActionEvent event) {
            String refProduitValue = refProduit.getText();
            String nomProduitValue = nomProduit.getText();
            String typeProduitValue = typeProduit.getValue();
            String prixProduitValue = prixProduit.getText();
            String prixProduit1Value = prixProduit1.getText();


            Produits nouveauProduit = new Produits();
            GestionProduit gs = new GestionProduit();
            nouveauProduit.setRefProduitProperty(refProduitValue);
            nouveauProduit.setNomProduitProperty(nomProduitValue);
            nouveauProduit.setPrixProduitProperty(typeProduitValue);
            nouveauProduit.setPrixProduit1Property(prixProduit1Value);
            nouveauProduit.setTypeProduitProperty(prixProduitValue);


            gs.getListeProduits().add(nouveauProduit);


            ObservableList<Produits> tableData = tabProduit.getItems();
            tableData.add(new Produits(refProduitValue ,nomProduitValue, typeProduitValue,prixProduit1Value,prixProduitValue));


            refProduit.clear();
            nomProduit.clear();
            prixProduit.clear();
            prixProduit1.clear();
        }


    @FXML
    public void updateProduit(ActionEvent event) {
        Produits selectedProduit = tabProduit.getSelectionModel().getSelectedItem();

        if (selectedProduit != null) {
            // Remplir les champs avec les valeurs du produit sélectionné
            refProduit.setText(selectedProduit.getRefProduitProperty());
            nomProduit.setText(selectedProduit.getNomProduitProperty().get());  // Utilisez get() ici
            typeProduit.setValue(selectedProduit.getTypeProduitProperty());
            prixProduit.setText(selectedProduit.getPrixProduitProperty());
            prixProduit1.setText(selectedProduit.getPrixProduit1Property());

            // Mettre à jour la table
            tabProduit.refresh();
        } else {
            // Aucun produit sélectionné, affichez un message d'erreur ou effectuez une action appropriée.
        }
    }







    @FXML
    public void deleteProduit(ActionEvent event) {
        Produits selectedProduit = tabProduit.getSelectionModel().getSelectedItem();

        if (selectedProduit != null) {
            // Supprimer le produit de la liste
            GestionProduit gs = new GestionProduit();
            gs.supprimerProduit(selectedProduit);

            // Supprimer le produit de la table
            tabProduit.getItems().remove(selectedProduit);
        } else {
            // Aucun produit sélectionné, affichez un message d'erreur ou effectuez une action appropriée.
        }
    }












    //    Les changements de scen
    @FXML
    void switchTotableau(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TableauDeBord.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void switchToAccueil(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void switchToProduits(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("produits.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void switchToCommandes(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("commandes.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void FermerApp(ActionEvent event) {
        Platform.exit();
    }
    ///////////////////////////////




}
