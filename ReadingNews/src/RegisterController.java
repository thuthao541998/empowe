/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entity.User;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import model.UserModel;

/**
 *
 * @author Admin
 */
public class RegisterController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Pane content_area;
    @FXML
    private TextArea email;
    @FXML
    private TextArea username;
    @FXML
    private Button btnRegister;
    @FXML
    private PasswordField password;
    
    @FXML
    public void openLogin(MouseEvent event) throws IOException{
        Parent root  = FXMLLoader.load(getClass().getResource("Login.fxml"));
        content_area.getChildren().removeAll();
        content_area.getChildren().setAll(root);
    }
    public void btnRegister(MouseEvent event) throws SQLException{
        String username = this.username.getText();
        String password = this.password.getText();
        String email = this.email.getText();
        User user = new User(username, password, email);
        UserModel.register(user);
        System.out.println(user.toString());        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
