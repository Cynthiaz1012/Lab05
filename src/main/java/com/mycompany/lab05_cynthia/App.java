package com.mycompany.lab05_cynthia;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Label titleLabel = new Label("Bag Order");
        
        ListView<String> bagList = new ListView<>();
        bagList.getItems().add("Full Decorative");
        bagList.getItems().add("Beaded");
        bagList.getItems().add("Pirate Design");
        bagList.getItems().add("Fringed");
        bagList.getItems().add("Leather");
        bagList.getItems().add("Plain");
        
    }

    public static void main(String[] args) {
        launch();
    }

}