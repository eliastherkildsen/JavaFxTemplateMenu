package org.apollo.template;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import org.apollo.template.View.ViewList;

import java.io.IOException;

public class ViewLoader {

    public static AnchorPane loadView(ViewList fxmlFileName) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(ViewLoader.class.getResource(fxmlFileName.getFxmlFileName()));

        try {
            return loader.load();
        } catch (IOException e) {
            throw new RuntimeException("Error loading FXML view: " + fxmlFileName, e);
        }
    }

}
