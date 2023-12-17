package com.example.ratatouille;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modele.GestionCommande;
import modele.GestionProduit;
import org.kordamp.ikonli.javafx.FontIcon;

import java.io.IOException;

public class HelloApplication extends Application {


    public void init() throws IOException{
        GestionProduit gestionProduit = new GestionProduit();
        GestionCommande gestionCommande = new GestionCommande();

    }
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1093,754 );
        stage.setTitle("Page de connexion du restaurant");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}