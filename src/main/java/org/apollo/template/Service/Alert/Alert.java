package org.apollo.template.Service.Alert;

import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import org.apollo.template.Controller.MainController;

/**
 * The Alert class provides functionality to display alerts on a JavaFX StackPane.
 * Each alert consists of an image, a header, and two lines of text.
 */
public class Alert {
    private int durationInSeconds; // Duration for which the alert will be displayed
    private AlertComp alertComp; // Visual component of the alert
    private StackPane stackPane = MainController.getInstance().getStackPane(); // StackPane to display alerts
    private static Alert activeAlert; // The currently active alert

    /**
     * Constructs a new Alert object with the provided parameters.
     *
     * @param durationInSeconds Duration for which the alert will be displayed
     * @param alertImages      Images associated with the alert
     * @param alertHeader      Header text of the alert
     * @param alertLine1       First line of text of the alert
     * @param alertLine2       Second line of text of the alert
     */
    public Alert(int durationInSeconds, AlertImages alertImages, String alertHeader, String alertLine1, String alertLine2) {
        this.durationInSeconds = durationInSeconds;
        alertComp = new AlertComp(new Image(alertImages.getImagePath()), alertHeader, alertLine1, alertLine2);
    }

    /**
     * Starts displaying the alert.
     * If there's an active alert, it is removed before displaying the new one.
     */
    public void start() {
        if (activeAlert != null) {
            activeAlert.deleteAlertComp();
        }

        activeAlert = this;

        stackPane.getChildren().add(alertComp);

        // Create a thread to delete the alert after the specified duration
        Thread timerThread = new Thread(() -> {
            try {
                Thread.sleep(durationInSeconds * 1000);
            } catch (InterruptedException e) {
                // Handle interruption if necessary
                e.printStackTrace();
            }

            deleteAlertComp();
        });

        timerThread.start();
    }

    /**
     * Removes the alert component from the stack pane.
     * This method is called after the alert duration has elapsed.
     */
    private void deleteAlertComp() {
        Platform.runLater(() -> {
            stackPane.getChildren().remove(alertComp);
        });
    }
}
