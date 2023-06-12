/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2project;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author بشاير
 */
public class GogoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void playing(ActionEvent event) throws IOException{
         URL url = new File("C:\\Users\\Admin\\OneDrive\\Documents\\NetBeansProjects\\test2project\\src\\test2project\\SIGNIN.fxml").toURI().toURL();
     Parent score = FXMLLoader.load(url);
        
     Scene categoery = new Scene(score);
 
    //This line gets the Stage information
    Stage window  = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene (categoery);
    window.show(); 
    }
}
