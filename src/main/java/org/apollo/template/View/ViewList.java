package org.apollo.template.View;

import org.apollo.template.Controller.*;

/**
 * Enum representing different views in the application.
 * Each enum value corresponds to an FXML file name and its associated controller.
 */
public enum ViewList {

    /**
     * Main view.
     */
    MAIN("MainView.fxml", MainController.getInstance()),

    /**
     * Game view.
     */
    GAME("GameView.fxml", GameController.getInstance()),

    /**
     * Settings view.
     */
    SETTINGS("SettingsView.fxml", SettingsController.getInstance()),

    /**
     * Home view.
     */
    HOME("HomeView.fxml", HomeController.getInstance()),

    /**
     * Menu view.
     */
    MENU("MenuView.fxml", MenuController.getInstance());

    private final String FXML_FILE_NAME; // FXML file name of the view
    private final Object CONTROLLER; // Controller associated with the view

    /**
     * Constructs a ViewList enum value with the specified FXML file name and controller.
     *
     * @param fxmlFileName The name of the FXML file representing the view
     * @param controller   The controller associated with the view
     */
    ViewList(String fxmlFileName, Object controller) {
        this.FXML_FILE_NAME = fxmlFileName;
        this.CONTROLLER = controller;
    }

    /**
     * Returns the FXML file name of the view.
     *
     * @return The FXML file name
     */
    public String getFxmlFileName() {
        return this.FXML_FILE_NAME;
    }

    /**
     * Returns the controller associated with the view.
     *
     * @return The controller instance
     */
    public Object getController() {
        return this.CONTROLLER;
    }

    /**
     * Common loader location for all FXML files in the application.
     */
    public static final String LOADER_LOCATION = "/org/apollo/template/";

}
