package org.apollo.template.Service.Alert;

import javafx.scene.image.Image;

public enum AlertMessage {

    END_DATE_BEFORE_START_DATE("The given end date can not be before the start date!", AlertImage.ERROR);

    private String message;
    private AlertImage alertImage;

    AlertMessage(String message, AlertImage alertImage) {
        this.message = message;
        this.alertImage = alertImage;
    }

    public String getMessage() {
        return message;
    }

    public Image getAlertImage() {
        return new Image(alertImage.getImagePath());
    }
}
