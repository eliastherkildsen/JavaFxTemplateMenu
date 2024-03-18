package org.apollo.template.Service.Alert;

import javafx.scene.image.Image;

public class Alert {

    private int durationInSeconds;
    private AlertMessage alertMessage;


    public Alert(int durationInSeconds, AlertMessage alertMessage) {
        this.durationInSeconds = durationInSeconds;
        this.alertMessage = alertMessage;
    }

    public String getAlertMessage() {
        return alertMessage.getMessage();
    }

    public Image getAlertImage(){
        return alertMessage.getAlertImage();
    }

}
