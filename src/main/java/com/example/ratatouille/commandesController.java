package com.example.ratatouille;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.kordamp.ikonli.javafx.FontIcon;


import java.io.IOException;

public class commandesController {
    @FXML
    private Label WelcomeUser;

    @FXML
    private Button accueil;

    @FXML
    private Button commandes;

    @FXML
    private Button connecter;

    @FXML
    private TextField identi;

    @FXML
    private TextField motDePasse;

    @FXML
    private Button produits;

    @FXML
    private Button quitter;

    @FXML
    private Button tabBord;

    @FXML
    private ChoiceBox<?> NomCommande;



    @FXML
    private TableColumn<?, ?> PuCommandes;

    @FXML
    private TableColumn<?, ?> QteCommandes;

    @FXML
    private TextField SommeCommandes;

    @FXML
    private Label SommeRendue;



    @FXML
    private Button ajouterCommandes;


    @FXML
    private DatePicker dateCommandes;

    @FXML
    private TableColumn<?, ?> dateCommandes2;

    @FXML
    private Button effacerCommandes;

    @FXML
    private Button majCommandes;

    @FXML
    private TableColumn<?, ?> nomProduitComma;

    @FXML
    private Button payerCommandes;


    @FXML
    private Spinner<?> quantiteCommandes;



    @FXML
    private TextField refCommandes1;

    @FXML
    private TableColumn<?, ?> refCommandes2;

    @FXML
    private Button supprimerCommandes;

    void initialize() {

    }



    @FXML
    void switchTotableau(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TableauDeBord.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene); // Définir la nouvelle scène sur la fenêtre
        stage.show();
    }
    @FXML
    void switchToAccueil(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene); // Définir la nouvelle scène sur la fenêtre
        stage.show();
    }
    @FXML
    void switchToProduits(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("produits.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene); // Définir la nouvelle scène sur la fenêtre
        stage.show();
    }
    @FXML
    void switchToCommandes(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("commandes.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene); // Définir la nouvelle scène sur la fenêtre
        stage.show();
    }
    @FXML
    void FermerApp(ActionEvent event) {
        Platform.exit();
    }
}

