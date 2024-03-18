package org.apollo.template.Controller;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import org.apollo.template.Service.Debugger.DebugMessage;
import org.apollo.template.View.BorderPaneRegion;
import org.apollo.template.View.ViewList;

import static org.apollo.template.ViewLoader.loadView;

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
