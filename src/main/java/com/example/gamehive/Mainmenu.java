package com.example.gamehive;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Mainmenu {

    @FXML
    private Button tictactoeButton;

    @FXML
    private Button pingpongButton;

    @FXML
    private Button snakegameButton;

    @FXML
    private Button sudokuButton;

    @FXML
    private Button wordspellButton;

    @FXML
    private Button inversegridButton;

    @FXML
    private ImageView tictactoeimage;

    @FXML
    void openTicTacToe(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("tictactoe.fxml"));
            Stage stage = (Stage) tictactoeButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Tic Tac Toe");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void openpingpong(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("pong.fxml"));
            Stage stage = (Stage) pingpongButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Ping Pong");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void opensnakegame(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("snake.fxml"));
            Stage stage = (Stage) snakegameButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Snake Game");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void opensudokugame(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("sudoku.fxml"));
            Stage stage = (Stage) sudokuButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Sudoku");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void openwordspell(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("wordspell.fxml"));
            Stage stage = (Stage) wordspellButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Word Spell");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void opencredit(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("credits.fxml"));
            Stage stage = (Stage) inversegridButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Credits");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void openinversegrid(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("inversegrid.fxml"));
            Stage stage = (Stage) inversegridButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Inverse Grid");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }






}