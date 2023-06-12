/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class CatogeryController implements Initializable {

    @FXML
    private Button school;
    @FXML
    public Button places;
    @FXML
    private Button body;
    @FXML
    private Button health;
    @FXML
    private Button sport;
    @FXML
    private Button home;
    @FXML
    private Button clothes;
    @FXML
    private Button materials;
    @FXML
    private Button food;
    @FXML
    private Button animal;
    public static boolean schoolCheck = false;
    public static boolean placesCheck = false;
    public static boolean bodyCheck = false;
    public static boolean healthCheck = false;
    public static boolean sportCheck = false;
    public static boolean homeCheck = false;
    public static boolean clothesheck = false;
    public static boolean materialsCheck = false;
    public static boolean foodCheck = false;
    public static boolean animalCheck = false;
    public static int countP = 0;
    public static int countSC = 0;
    public static int countB = 0;
    public static int countH = 0;
    public static int countSP = 0;
    public static int countHO = 0;
    public static int countC = 0;
    public static int countM = 0;
    public static int countF = 0;
    public static int countA = 0;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void changeScreenButtonPushed(ActionEvent event) throws IOException {

        URL url = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\test2project\\scores.fxml").toURI().toURL();
        Parent score = FXMLLoader.load(url);

        Scene categoery = new Scene(score);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(categoery);
        window.show();

    }

    @FXML
    private void movetoP(ActionEvent event) throws IOException {

        if (countP == 0) {
            placesCheck = true;
            countP++;
            URL url = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\test2project\\game.fxml").toURI().toURL();
            Parent score = FXMLLoader.load(url);
            Scene categoery = new Scene(score);
            //This line gets the Stage information
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(categoery);
            window.show();
        } else {
            places.setDisable(true);
        }
    }

    @FXML
    private void movetoSc(ActionEvent event) throws IOException {
        if (countSC == 0) {
            schoolCheck = true;
            countSC++;
            URL url = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\test2project\\game.fxml").toURI().toURL();
            Parent score = FXMLLoader.load(url);
            Scene categoery = new Scene(score);
            //This line gets the Stage information
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(categoery);
            window.show();
        } else {
            school.setDisable(true);
        }
    }

    @FXML
    private void movetoB(ActionEvent event) throws IOException {
        if (countB == 0) {
            bodyCheck = true;
            countB++;
            URL url = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\test2project\\game.fxml").toURI().toURL();
            Parent score = FXMLLoader.load(url);
            Scene categoery = new Scene(score);
            //This line gets the Stage information
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(categoery);
            window.show();
        } else {
            body.setDisable(true);
        }
    }

    @FXML
    private void movetoH(ActionEvent event) throws IOException {
        if (countH == 0) {
            healthCheck = true;
            countH++;
            URL url = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\test2project\\game.fxml").toURI().toURL();
            Parent score = FXMLLoader.load(url);
            Scene categoery = new Scene(score);
            //This line gets the Stage information
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(categoery);
            window.show();
        } else {
            health.setDisable(true);
        }
    }

    @FXML
    private void movetoSP(ActionEvent event) throws IOException {
        if (countSP == 0) {
            sportCheck = true;
            countSP++;
            URL url = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\test2project\\game.fxml").toURI().toURL();
            Parent score = FXMLLoader.load(url);

            Scene categoery = new Scene(score);

            //This line gets the Stage information
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(categoery);
            window.show();
        } else {
            sport.setDisable(true);
        }
    }

    @FXML
    private void movetoHO(ActionEvent event) throws IOException {
        if (countHO == 0) {
            homeCheck = true;
            countHO++;
            URL url = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\test2project\\game.fxml").toURI().toURL();
            Parent score = FXMLLoader.load(url);
            Scene categoery = new Scene(score);
            //This line gets the Stage information
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(categoery);
            window.show();
        } else {
            home.setDisable(true);
        }
    }

    @FXML
    private void movetoC(ActionEvent event) throws IOException {
        if (countC == 0) {
            clothesheck = true;
            countC++;
            URL url = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\test2project\\game.fxml").toURI().toURL();
            Parent score = FXMLLoader.load(url);
            Scene categoery = new Scene(score);
            //This line gets the Stage information
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(categoery);
            window.show();
        } else {
            clothes.setDisable(true);
        }
    }

    @FXML
    private void movetoM(ActionEvent event) throws IOException {
        if (countM == 0) {
            materialsCheck = true;
            countM++;
            URL url = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\test2project\\game.fxml").toURI().toURL();
            Parent score = FXMLLoader.load(url);
            Scene categoery = new Scene(score);
            //This line gets the Stage information
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(categoery);
            window.show();
        } else {
            materials.setDisable(true);
        }

    }

    @FXML
    private void movetoF(ActionEvent event) throws IOException {
        if (countF == 0) {
            foodCheck = true;
            countF++;
            URL url = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\test2project\\game.fxml").toURI().toURL();
            Parent score = FXMLLoader.load(url);

            Scene categoery = new Scene(score);

            //This line gets the Stage information
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(categoery);
            window.show();
        } else {
            food.setDisable(true);
        }

    }

    @FXML
    private void movetoA(ActionEvent event) throws IOException {
        if (countA == 0) {
            animalCheck = true;
            countA++;
            URL url = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\test2project\\game.fxml").toURI().toURL();
            Parent score = FXMLLoader.load(url);

            Scene categoery = new Scene(score);

            //This line gets the Stage information
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(categoery);
            window.show();
        } else {
            animal.setDisable(true);
        }

    }
}
