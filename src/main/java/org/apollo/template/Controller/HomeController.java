package org.apollo.template.Controller;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import org.apollo.template.Service.Alert.Alert;
import org.apollo.template.Service.Alert.AlertImages;
import org.apollo.template.Service.Debugger.DebugMessage;


public class HomeController {
    private static HomeController INSTANCE;
    @FXML
    private AnchorPane root;


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

    // region buttons

    public void onBtnError(){
        new Alert(3, AlertImages.ERROR, "This is a test of Error", "The test is to show of this Alert component", "Alert component").start();
    }
    public void onBtnInfo(){
        new Alert(3, AlertImages.INFO, "This is a test", "The test is to show of this", "Alert component").start();
    }
    public void onBtnSuccess(){
        new Alert(3, AlertImages.SUCCESS, "This is a test", "The test is to show of this", "Alert component").start();
    }


    // endregion


}
