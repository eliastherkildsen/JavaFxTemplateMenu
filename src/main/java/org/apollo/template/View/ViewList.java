package org.apollo.template.View;

import org.apollo.template.Controller.FAQController;
import org.apollo.template.Controller.HomeController;
import org.apollo.template.Controller.SettingsController;

public enum ViewList {

    MAIN("MainView.fxml", new SettingsController()), // This controller needs to be set in the FXML view!
    FAQ("FAQView.fxml", new FAQController()),
    SETTINGS("SettingsView.fxml", new SettingsController()),
    HOME("HomeView.fxml", new HomeController());

    private final String fxmlFileName;
    private final Object CONTROLLER;

    ViewList(String fxmlFileName, Object controller) {
        this.fxmlFileName = fxmlFileName;
        this.CONTROLLER = controller;
    }

    public String getFxmlFileName() {
        return this.fxmlFileName;
    }

    public Object getCONTROLLER() {
        return CONTROLLER;
    }

    public static final String LOADER_LOCATION = "/org/apollo/template/";

}
