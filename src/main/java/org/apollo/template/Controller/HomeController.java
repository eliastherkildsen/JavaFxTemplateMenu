package org.apollo.template.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import org.apollo.template.Service.Alert.Alert;
import org.apollo.template.Service.Alert.AlertComp;
import org.apollo.template.Service.Alert.AlertMessage;
import org.apollo.template.Service.Debugger.DebugMessage;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements  Initializable{
    private static HomeController INSTANCE = new HomeController();
    @FXML
    private AnchorPane root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        root.getChildren().add(new AlertComp(new Alert(2, AlertMessage.END_DATE_BEFORE_START_DATE)).getAnchorPane());
    }

    private HomeController() {
        if (INSTANCE == null) {
            DebugMessage.info(this, "Creating an instance of " + this);
        }
    }

    public static HomeController getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HomeController();
        }
        return INSTANCE;
    }
}
