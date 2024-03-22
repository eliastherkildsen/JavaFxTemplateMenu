package org.apollo.template.Service.Alert;

import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import org.apollo.template.Controller.MainController;

/**
 * The Alert class provides functionality to display alerts on a JavaFX StackPane.
 * Each alert consists of an image, a header, and two lines of text.
 */
public class Alert {
    private int durationInSeconds; // Duration for which the alert will be displayed
    private AlertCompV2 alertComp; // Visual component of the alert
    private VBox vBox = MainController.getInstance().getvBox();

    /**
     * Constructs a new Alert object with the provided parameters.
     *
     * @param durationInSeconds Duration for which the alert will be displayed

     */
    public Alert(int durationInSeconds, AlertType alertType, String message) {
        this.durationInSeconds = durationInSeconds;
        this.alertComp = new AlertCompV2(alertType, message);
    }

    /**
     * Starts displaying the alert.
     * If there's an active alert, it is removed before displaying the new one.
     */
    public void start() {

        vBox.getChildren().add(alertComp);
        vBox.setVgrow(alertComp, Priority.ALWAYS);

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
            vBox.getChildren().remove(alertComp);
        });
    }
}
