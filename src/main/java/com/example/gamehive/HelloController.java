package com.example.gamehive;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class HelloController {

    @FXML
    private Button letsgoButton;
    @FXML
    private ImageView game;

    @FXML
    void onletsgoclicked(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("mainmenu.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) letsgoButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Main Menu");
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
