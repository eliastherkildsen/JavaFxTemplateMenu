package org.apollo.template.Service.Alert;

import javafx.application.Platform;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import org.apollo.template.Controller.MainController;

/**
 * The Alert class provides functionality to display alerts on a JavaFX StackPane.
 * Each alert consists of an image, a header, and two lines of text.
 */
public class Alert {
    private final int DURATION_IN_SECONDS; // Duration for which the alert will be displayed
    private final AlertComp ALERT_COMPONENT; // Visual component of the alert
    private final VBox V_BOX;

    /**
     * Constructs a new Alert object with the provided parameters.
     *
     * @param durationInSeconds Duration for which the alert will be displayed

     */
    public Alert(int durationInSeconds, AlertType alertType, String message) {
        this.V_BOX = MainController.getInstance().getvBox();
        this.DURATION_IN_SECONDS = durationInSeconds;
        this.ALERT_COMPONENT = new AlertComp(alertType, message);
    }

    /**
     * Starts displaying the alert.
     * If there's an active alert, it is removed before displaying the new one.
     */
    public void start() {

        V_BOX.getChildren().add(ALERT_COMPONENT); // adding the alertComponent to the Vbox.
        V_BOX.setVgrow(ALERT_COMPONENT, Priority.ALWAYS); // This is done to make the alertComponent able take up as much space as needed.

        // Create a thread to delete the alert after the specified duration
        Thread timerThread = new Thread(() -> {
            try {
                Thread.sleep(DURATION_IN_SECONDS * 1000);
            } catch (InterruptedException e) {
                // Handle interruption if necessary
                e.printStackTrace();
            }

            deleteAlertComp(); // removing the component from the Vbox, and deleting the reference.
        });

        timerThread.start();
    }

    /**
     * Removes the alert component from the stack pane.
     * This method is called after the alert duration has elapsed.
     */
    private void deleteAlertComp() {
        Platform.runLater(() -> {
            V_BOX.getChildren().remove(ALERT_COMPONENT);
        });
    }
}
