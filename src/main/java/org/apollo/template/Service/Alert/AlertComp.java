package org.apollo.template.Service.Alert;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class AlertComp extends StackPane {

    private ImageView imageView;
    private Label Header, Line1, Line2;
    private final int textPaddingRight = 135;
    private final int textPaddingBouttom = 65;

    public AlertComp(Image image, String header, String line1, String line2) {
        imageView = new ImageView(image);
        Header = new Label(header);
        Line1 = new Label(line1);
        Line2 = new Label(line2);


        imageView.setFitWidth(300);
        imageView.maxWidth(300);
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(300);
        imageView.maxHeight(180);


        // Center the label within the image
        StackPane.setAlignment(Header, Pos.BOTTOM_RIGHT);

        // Add padding to move the label up by 10 pixels
        Header.setPadding(new Insets(0, textPaddingRight, textPaddingBouttom, 0));
        Header.setFont(Font.font("Arial", FontWeight.BOLD, 12));

        Line1.setPadding(new Insets(0, textPaddingRight, textPaddingBouttom - 20, 0));
        Line2.setPadding(new Insets(0, textPaddingRight, textPaddingBouttom - 40, 0));

        // Make the ImageLabelComponent transparent to mouse events
        setMouseTransparent(true);


        // Set alignment of the component within the StackPane
        setAlignment(Pos.BOTTOM_RIGHT);

        getChildren().addAll(imageView, Header, Line1, Line2);
    }

    // Setters for image and text
    public void setImage(Image image) {
        imageView.setImage(image);
    }

    public void setText(String text) {
        Header.setText(text);
    }
}
