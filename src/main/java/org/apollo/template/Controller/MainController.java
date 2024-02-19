package org.apollo.template.Controller;

/*

    This it the main controller of the View, all other views are precedent within this view.

 */

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import org.apollo.template.View.ViewList;
import java.net.URL;
import java.util.ResourceBundle;

import static org.apollo.template.ViewLoader.loadView;

public class MainController implements Initializable {
    @FXML
    private BorderPane borderPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        borderPane.setCenter(loadView(ViewList.HOME));
    }

    @FXML
    protected void onBtnHome() {
        borderPane.setCenter(loadView(ViewList.HOME));
    }

    @FXML
    protected void onBtnSettings( ) {
        borderPane.setCenter(loadView(ViewList.SETTINGS));
    }

    @FXML
    protected void onBtnLogin( ) {
        borderPane.setCenter(loadView(ViewList.FAQ));
    }







}