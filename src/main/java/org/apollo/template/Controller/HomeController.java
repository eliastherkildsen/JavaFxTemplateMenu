package org.apollo.template.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
    private AnchorPane root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        TextField tf = new TextField();

        tf.setLayoutX(200);
        tf.setLayoutY(200);
        tf.setText("    ");


        root.getChildren().add(tf);

    }
}
