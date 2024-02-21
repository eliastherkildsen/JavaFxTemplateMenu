package org.apollo.template.View;

import org.apollo.template.Controller.ControllerList;

public enum ViewList {

    MAIN("MainView.fxml", ControllerList.MAIN_CONTROLLER), // This controller needs to be set in the FXML view!
    FAQ("FAQView.fxml", ControllerList.FAQ_CONTROLLER),
    SETTINGS("SettingsView.fxml", ControllerList.SETTINGS_CONTROLLER),
    HOME("HomeView.fxml", ControllerList.HOME_CONTROLLER);

    private final String fxmlFileName;
    private final ControllerList CONTROLLER;

    ViewList(String fxmlFileName, ControllerList controller) {
        this.fxmlFileName = fxmlFileName;
        this.CONTROLLER = controller;
    }

    public String getFxmlFileName() {
        return this.fxmlFileName;
    }

    public Object getController() {
        return CONTROLLER.getController();
    }

    public static final String LOADER_LOCATION = "/org/apollo/template/";

}
