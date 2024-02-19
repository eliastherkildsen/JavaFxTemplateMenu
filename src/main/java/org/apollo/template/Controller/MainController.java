package org.apollo.template.Controller;

/*

    This it the main controller of the View, all other views are precentet within this view.

 */

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import org.apollo.template.View.ViewList;

import java.io.IOException;

import static org.apollo.template.ViewLoader.loadView;

public class MainController {
    @FXML
    private BorderPane borderPane;


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