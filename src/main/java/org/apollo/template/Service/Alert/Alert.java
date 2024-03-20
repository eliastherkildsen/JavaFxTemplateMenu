package org.apollo.template.Service.Alert;

import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import org.apollo.template.Controller.MainController;

public class Alert {

    private int durationInSeconds;
    private AlertImages alertImages;
    private String alertHeader, alertLine1, alertLine2;
    private AlertComp alertComp;
    private StackPane stackPane = MainController.getInstance().getStackPane();
    private static boolean isShowing = false; // Track if an alert is currently showing
    private static Alert activeAlert;

    public Alert(int durationInSeconds, AlertImages alertImages, String alertHeader, String alertLine1, String alertLine2) {
        this.durationInSeconds = durationInSeconds;
        this.alertImages = alertImages;
        this.alertHeader = alertHeader;
        this.alertLine1 = alertLine1;
        this.alertLine2 = alertLine2;

        alertComp = new AlertComp(new Image(alertImages.getImagePath()), alertHeader, alertLine1, alertLine2);
    }

    public void start() {

        if (activeAlert != null){
            activeAlert.deleteAlertComp();
        }

        activeAlert = this;

        stackPane.getChildren().add(alertComp);
        isShowing = true; // Mark that an alert is currently showing

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

    private void deleteAlertComp() {
        Platform.runLater(() -> {
            stackPane.getChildren().remove(alertComp);
        });
    }
}
