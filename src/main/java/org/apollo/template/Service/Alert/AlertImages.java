package org.apollo.template.Service.Alert;

public enum AlertImages {

    ERROR("file:src/main/resources/org/apollo/template/images/Message_RED_transparent.png"),
    INFO("file:src/main/resources/org/apollo/template/images/Message_YELLOW_transparent.png"),
    SUCCESS("file:src/main/resources/org/apollo/template/images/Message_Green_transparent.png");

    private String imagePath;

    AlertImages(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }
}
