//package com.example.ratatouille;
//
//
//import javafx.application.Platform;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.control.cell.TextFieldTableCell;
//import javafx.stage.Stage;
//import modele.Commandes;
//
//
//import java.io.IOException;
//
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//
//public class commandesController {
//    @FXML
//    private Label WelcomeUser;
//
//    @FXML
//    private Button accueil;
//
//    @FXML
//    private Button commandes;
//
//    @FXML
//    private Button connecter;
//
//    @FXML
//    private TextField identi;
//
//    @FXML
//    private TextField motDePasse;
//
//    @FXML
//    private Button produits;
//
//    @FXML
//    private Button quitter;
//
//    @FXML
//    private Button tabBord;
//
//    @FXML
//    private ChoiceBox<Commandes> NomCommande;
//
//    @FXML
//    private TableColumn<Commandes, String> PuCommandes;
//
//    @FXML
//    private TableColumn<Commandes, String> QteCommandes;
//
//    @FXML
//    private TextField SommeCommandes;
//
//    @FXML
//    private Label SommeRendue;
//
//    @FXML
//    private Button ajouterCommandes;
//
//    @FXML
//    private DatePicker dateCommandes;
//
//    @FXML
//    private TableColumn<Commandes, String> dateCommandes2;
//
//    @FXML
//    private Button effacerCommandes;
//
//    @FXML
//    private Button majCommandes;
//
//    @FXML
//    private TableColumn<Commandes, String> nomProduitComma;
//
//    @FXML
//    private Button payerCommandes;
//
//    @FXML
//    private Spinner<Integer> quantiteCommandes;
//
//    @FXML
//    private TextField refCommandes1;
//
//    @FXML
//    private TableColumn<Commandes, String> refCommandes2;
//
//    @FXML
//    private Button supprimerCommandes;
//
//    private ObservableList<Commandes> listeCommandes = FXCollections.observableArrayList();
//    @FXML
//    void initialize() {
//        // Initialisez vos éléments graphiques ici
//
//        // Exemple d'ajout de données à la ChoiceBox
//        listeCommandes.add(new Commandes());
//        listeCommandes.add(new Commandes());
//
//        // Associez la ChoiceBox à la liste de commandes
//        NomCommande.setItems(listeCommandes);
//
//        // Configurez les cellules éditables des colonnes
//        configurerCellulesEditable();
//    }
//
//    private void configurerCellulesEditable() {
//        PuCommandes.setCellFactory(TextFieldTableCell.<Commandes>forTableColumn());
//        dateCommandes2.setCellFactory(TextFieldTableCell.forTableColumn());
//        nomProduitComma.setCellFactory(TextFieldTableCell.forTableColumn());
//        refCommandes2.setCellFactory(TextFieldTableCell.forTableColumn());
//        QteCommandes.setCellFactory(TextFieldTableCell.<Commandes>forTableColumn());
//    }
//
//    @FXML
//    private void ajouterCommandes() {
//        // Ajoutez votre logique pour traiter l'ajout de commandes
//        Commandes nouvelleCommande = new Commandes();
//        listeCommandes.add(nouvelleCommande);
//        NomCommande.getSelectionModel().select(nouvelleCommande);
//    }
//
//
//
//
//
//    @FXML
//    void switchTotableau(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("TableauDeBord.fxml"));
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        Scene scene = new Scene(root);
//        stage.setScene(scene); // Définir la nouvelle scène sur la fenêtre
//        stage.show();
//    }
////    @FXML
////    void switchToAccueil(ActionEvent event) throws IOException {
////        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
////        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
////        Scene scene = new Scene(root);
////        stage.setScene(scene); // Définir la nouvelle scène sur la fenêtre
////        stage.show();
////    }
//    @FXML
//    void switchToProduits(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("produits.fxml"));
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        Scene scene = new Scene(root);
//        stage.setScene(scene); // Définir la nouvelle scène sur la fenêtre
//        stage.show();
//    }
//    @FXML
//    void switchToCommandes(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("commandes.fxml"));
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        Scene scene = new Scene(root);
//        stage.setScene(scene); // Définir la nouvelle scène sur la fenêtre
//        stage.show();
//    }
//    @FXML
//    void FermerApp(ActionEvent event) {
//        Platform.exit();
//    }
//}
//
