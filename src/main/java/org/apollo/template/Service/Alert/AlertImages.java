package org.apollo.template.Service.Alert;

/**
 * Enum representing different types of alert images.
 * Each enum value corresponds to an image file path.
 */
public enum AlertImages {

    /**
     * Error alert image.
     */
    ERROR("file:src/main/resources/org/apollo/template/images/Message_RED_transparent.png"),

    /**
     * Information alert image.
     */
    INFO("file:src/main/resources/org/apollo/template/images/Message_YELLOW_transparent.png"),

    /**
     * Success alert image.
     */
    SUCCESS("file:src/main/resources/org/apollo/template/images/Message_Green_transparent.png");

    private String imagePath; // Path to the image associated with the alert

    /**
     * Constructs an AlertImages enum value with the specified image path.
     *
     * @param imagePath The path to the image associated with the alert
     */
    AlertImages(String imagePath) {
        this.imagePath = imagePath;
    }

    /**
     * Returns the path to the image associated with the alert.
     *
     * @return The image path
     */
    public String getImagePath() {
        return imagePath;
    }
}
