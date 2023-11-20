package com.example.ratatouille;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;




import java.io.IOException;

public class produitsController {
    @FXML
    private TableColumn<?, ?> PrixTab;

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
    private TableColumn<?, ?> qteTab;

    @FXML
    private Button quitter;

    @FXML
    private TextField refProduit;

    @FXML
    private TextField searchBar;

    @FXML
    private Button tabBord;

    @FXML
    private TableColumn<?, ?> tabNom;

    @FXML
    private TableView<?> tabProduit;

    @FXML
    private TableColumn<?, ?> tabRef;

    @FXML
    private TableColumn<?, ?> typeTab;

    @FXML
    private Button updateProduit;

    @FXML
    private ChoiceBox<String> typeProduit;

    @FXML
    private void initialize() {
        typeProduit.getItems().addAll("Legumes","Fruits","Viandes","Fruit", "Viennoiserie", "Féculents", "Légumineuse");
    }


//    Les changements de scene
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
