package org.apollo.template.Service.Alert;

import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import org.apollo.template.Controller.MainController;

public class Alert {

    private int durationInSeconds;
    private AlertImages alertImages;
    private String alertMessage;
    private AlertComp alertComp;

    public Alert(int durationInSeconds, AlertImages alertImages, String alertMessage) {
        this.durationInSeconds = durationInSeconds;
        this.alertImages = alertImages;
        this.alertMessage = alertMessage;

        alertComp = new AlertComp(new Image(alertImages.getImagePath()), alertMessage);

    }

    public void start() {


        StackPane stackPane = MainController.getInstance().getStackPane();
        stackPane.getChildren().add(alertComp);
        stackPane.setAlignment(alertComp, javafx.geometry.Pos.BOTTOM_RIGHT);

        Thread timerThread = new Thread(() -> {
            try {
                Thread.sleep(durationInSeconds * 1000);
            } catch (InterruptedException e) {
                // Handle interruption if necessary
                e.printStackTrace();
            }


        });

        timerThread.start();

    }



}
