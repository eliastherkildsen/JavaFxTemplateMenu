package org.apollo.template.Service.Alert;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class AlertComp {

    private AnchorPane anchorPane;
    private VBox vBox;
    private ImageView imageView;
    private Label label;

    public AlertComp(Alert alert) {

        anchorPane = new AnchorPane();
        imageView = new ImageView(alert.getAlertImage());
        imageView.setOpacity(75);
        imageView.setLayoutX(200);
        imageView.setLayoutY(200);

        label = new Label(alert.getAlertMessage());
        label.setLayoutX(300);
        label.setLayoutY(300);


        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(label);

    }

    public AnchorPane getAnchorPane(){
        return anchorPane;
    }
}
