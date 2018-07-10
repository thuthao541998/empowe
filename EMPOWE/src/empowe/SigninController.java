/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empowe;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author Admin
 */
public class SigninController implements Initializable {
    
    @FXML
    private Pane content_area;   
    @FXML
    private AnchorPane pane;   
    
    @FXML
    public void openSignup(MouseEvent event) throws IOException{
        Parent fxml = FXMLLoader.load(getClass().getResource("Signup.fxml"));        
        content_area.getChildren().removeAll();
        content_area.getChildren().setAll(fxml);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    
}
