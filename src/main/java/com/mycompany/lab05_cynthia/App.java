package com.mycompany.lab05_cynthia;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
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
        
        ComboBox<Integer> quantityBox = new ComboBox<>();
        quantityBox.getItems().add(1);
        quantityBox.getItems().add(2);
        quantityBox.getItems().add(3);
        quantityBox.getItems().add(4);
        quantityBox.getItems().add(5);
        quantityBox.getItems().add(6);
        quantityBox.getItems().add(7);
        quantityBox.getItems().add(8);
        quantityBox.getItems().add(9);
        quantityBox.getItems().add(10);
        
        RadioButton smallButton = new RadioButton("Small");
        RadioButton mediumButton = new RadioButton("Medium");
        RadioButton largeButton = new RadioButton("Large");
        
        ToggleGroup sizeGroup = new ToggleGroup();
        smallButton.setToggleGroup(sizeGroup);
        mediumButton.setToggleGroup(sizeGroup);
        largeButton.setToggleGroup(sizeGroup);
        
        HBox sizeBox = new HBox(10);
        sizeBox.getChildren().add(smallButton);
        sizeBox.getChildren().add(mediumButton);
        sizeBox.getChildren().add(largeButton);
        
        Label bagLabel = new Label("Choose a bag:");
        Label quantityLabel = new Label("Quantity:");
        Label sizeLabel = new Label("Size:");
        Button orderButton = new Button("Order");
        Button clearButton = new Button("Clear");
        Label resultLabel = new Label("");  
        
        orderButton.setOnAction(event -> {
            String bag = bagList.getSelectionModel().getSelectedItem();
            Integer quantity = quantityBox.getValue();
            String size = "";
            if (smallButton.isSelected()) {
                size = "Small";
            } else if (mediumButton.isSelected()) {
                size = "Medium";
            } else if (largeButton.isSelected()) {
                size = "Large";
            }
            
            resultLabel.setText("You ordered " + quantity + " " + size + " " + bag + " Bags.");          
        });

    }

    public static void main(String[] args) {
        launch();
    }

}