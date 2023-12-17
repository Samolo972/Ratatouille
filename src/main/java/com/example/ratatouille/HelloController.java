package com.example.ratatouille;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.kordamp.ikonli.javafx.FontIcon;

import java.io.IOException;

public class HelloController {

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
    private Label message;

    @FXML
    private FontIcon lock;

    private ActionEvent event;

    private boolean isConnected = false;

    @FXML
    void connecter(ActionEvent event) throws IOException {
        String identifiant = identi.getText();
        String motDePasseTexte = motDePasse.getText();

        if ("test".equals(identifiant) && "test".equals(motDePasseTexte)) {
            WelcomeUser.setText("Bienvenue, " + identifiant + " !");
            lock.setIconLiteral("fa-unlock");
            isConnected = true;
        } else {
            message.setText("Identifiant ou mot de passe incorrect !");
        }
    }

    @FXML
    void switchToAccueil(ActionEvent event) throws IOException {
        if (isConnected) {
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            switchScene(event, root);
        } else {
            message.setText("Vous devez vous connecter d'abord.");
        }
    }

    @FXML
    void switchToProduits(ActionEvent event) throws IOException {
        if (isConnected) {
            Parent root = FXMLLoader.load(getClass().getResource("produits.fxml"));
            switchScene(event, root);
        } else {
            message.setText("Vous devez vous connecter d'abord.");
        }
    }

    @FXML
    void switchToCommandes(ActionEvent event) throws IOException {
        if (isConnected) {
            Parent root = FXMLLoader.load(getClass().getResource("commandes.fxml"));
            switchScene(event, root);
        } else {
            message.setText("Vous devez vous connecter d'abord.");
        }
    }

    @FXML
    void switchTotableau(ActionEvent event) throws IOException {
        if (isConnected) {
            Parent root = FXMLLoader.load(getClass().getResource("TableauDeBord.fxml"));
            switchScene(event, root);
        } else {
            message.setText("Vous devez vous connecter d'abord.");
        }
    }

    private void switchScene(ActionEvent event, Parent root) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void FermerApp(ActionEvent event) {
        Platform.exit();
    }




}
