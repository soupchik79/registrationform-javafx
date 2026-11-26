package org.example.registration_form;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloController {
    @FXML
    private TextField login;
    @FXML
    private TextField password;
    @FXML
    private Label unicity;
    public TextField getLogin() {
        return login;
    }
    public TextField getPassword() {
        return password;
    }
    public Label getUnicity() {
        return unicity;
    }
    
}
