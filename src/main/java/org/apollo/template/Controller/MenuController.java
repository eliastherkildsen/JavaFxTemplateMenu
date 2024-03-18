package org.apollo.template.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import org.apollo.template.Service.Alert.Alert;
import org.apollo.template.Service.Alert.AlertComp;
import org.apollo.template.Service.Alert.AlertMessage;
import org.apollo.template.Service.Debugger.DebugMessage;
import org.apollo.template.View.BorderPaneRegion;
import org.apollo.template.View.ViewList;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuController {

    private static MenuController INSTANCE = new MenuController();
    @FXML
    private AnchorPane root;


    private MenuController() {
        if (INSTANCE == null) {
            DebugMessage.info(this, "Creating an instance of " + this);
        }
    }


    @FXML
    protected void onBtnHome() {
        MainController.getInstance().changeView(ViewList.HOME, BorderPaneRegion.CENTER);
    }

    @FXML
    protected void onBtnSettings( ) {
        MainController.getInstance().changeView(ViewList.SETTINGS, BorderPaneRegion.CENTER);
    }

    @FXML
    protected void onBtnGame( ) {
        MainController.getInstance().changeView(ViewList.GAME, BorderPaneRegion.CENTER);
    }

    public static MenuController getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MenuController();
        }
        return INSTANCE;
    }

}
