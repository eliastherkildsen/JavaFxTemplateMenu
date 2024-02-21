package org.apollo.template.View;

import org.apollo.template.Controller.ControllerList;

public enum ViewList {

    MAIN("MainView.fxml", ControllerList.MAIN_CONTROLLER),
    FAQ("FAQView.fxml", ControllerList.FAQ_CONTROLLER),
    SETTINGS("SettingsView.fxml", ControllerList.SETTINGS_CONTROLLER),
    HOME("HomeView.fxml", ControllerList.HOME_CONTROLLER);

    private final String FXML_FILE_NAME;
    private final ControllerList CONTROLLER;

    ViewList(String fxmlFileName, ControllerList controller) {
        this.FXML_FILE_NAME = fxmlFileName;
        this.CONTROLLER = controller;
    }

    public String getFxmlFileName() {
        return this.FXML_FILE_NAME;
    }

    public Object getController() {
        return CONTROLLER.getController();
    }

    public static final String LOADER_LOCATION = "/org/apollo/template/";

}
