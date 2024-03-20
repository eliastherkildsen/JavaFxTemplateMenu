package org.apollo.template.Service.Alert;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class AlertComp extends StackPane {

    private ImageView imageView;
    private Label label;

    public AlertComp(Image image, String text) {
        imageView = new ImageView(image);
        label = new Label(text);

        // Set max width to 100 pixels and min width to 100 pixels
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(true);

        // Set min height to 60 pixels
        //imageView.setMinHeight(60);

        // Center the label within the image
        StackPane.setAlignment(label, Pos.BOTTOM_RIGHT);

        // Make the ImageLabelComponent transparent to mouse events
        setMouseTransparent(true);


        // Set alignment of the component within the StackPane
        setAlignment(Pos.BOTTOM_RIGHT);

        getChildren().addAll(imageView, label);
    }

    // Setters for image and text
    public void setImage(Image image) {
        imageView.setImage(image);
    }

    public void setText(String text) {
        label.setText(text);
    }
}
