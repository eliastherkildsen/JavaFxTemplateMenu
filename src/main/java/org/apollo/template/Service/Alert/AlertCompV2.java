package org.apollo.template.Service.Alert;

import javafx.scene.control.TextArea;

public class AlertCompV2 extends TextArea {

    private int totalNumberOfLines;
    private int lineSizeInPx = 21;

    public AlertCompV2(AlertType alertType, String message) {
        super(message);



        setMouseTransparent(true);
        autosize();
        setWrapText(true); // Enable text wrapping
        applyStyle(alertType);
        setMaxWidth(300);
        setMinWidth(300);

        this.totalNumberOfLines = calculateNumberOfLines(message);

        setMaxHeight(lineSizeInPx * totalNumberOfLines); // Allow the TextArea to shrink if needed
        setMinHeight(100);

        setOpacity(.90);
    }

    private int calculateNumberOfLines(String message) {
        return getText().split("\n").length;
    }

    private void applyStyle(AlertType alertType) {
        switch (alertType) {
            case ERROR:
                getStyleClass().add("alertError");
                break;
            case SUCCESS:
                getStyleClass().add("alertSuccess");
                break;
            case INFO:
                getStyleClass().add("alertInfo");
                break;
        }

        // Load the custom style sheet
        getStylesheets().add(getClass().getResource("/org/apollo/template/css/alertStyles.css").toExternalForm());
    }
}
