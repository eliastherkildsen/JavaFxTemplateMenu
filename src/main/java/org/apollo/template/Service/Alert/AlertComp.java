package org.apollo.template.Service.Alert;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * Custom component for displaying alerts with an image, header, and two lines of text.
 */
public class AlertComp extends StackPane {

    private ImageView imageView;
    private Label headerLabel, line1Label, line2Label;
    private final int TEXT_PADDING_RIGHT = 40; // Padding from the right edge
    private final int TEXT_PADDING_BOTTOM = 65; // Padding from the bottom edge

    /**
     * Constructs an AlertComp with the specified image, header, and lines of text.
     *
     * @param image   The image to display in the alert.
     * @param header  The header text for the alert.
     * @param line1   The first line of text for the alert.
     * @param line2   The second line of text for the alert.
     */
    public AlertComp(Image image, String header, String line1, String line2) {

        // initializing components.
        imageView = new ImageView(image);
        headerLabel = new Label(header);
        line1Label = new Label(line1);
        line2Label = new Label(line2);

        // setting up the imageView attributes.
        imageView.setFitWidth(300);
        imageView.maxWidth(300);
        imageView.setPreserveRatio(true);
        imageView.setFitHeight(300);
        imageView.maxHeight(180);


        // lining up the components
        // TODO: MAKE MORE DYNAMIC!

        // lining up the header
        StackPane.setAlignment(headerLabel, Pos.BOTTOM_RIGHT);
        headerLabel.setPadding(new Insets(0, TEXT_PADDING_RIGHT, TEXT_PADDING_BOTTOM, 0));
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));

        // lining up the label
        line1Label.setPadding(new Insets(0, TEXT_PADDING_RIGHT, TEXT_PADDING_BOTTOM - 20, 0));
        line2Label.setPadding(new Insets(0, TEXT_PADDING_RIGHT, TEXT_PADDING_BOTTOM - 40, 0));

        // This is done so  that the user can click on stuff behind the imageview.
        this.setMouseTransparent(true);
        this.setAlignment(Pos.BOTTOM_RIGHT);

        // adding all the components to the stack pane.
        this.getChildren().addAll(imageView, headerLabel, line1Label, line2Label);
    }
}
