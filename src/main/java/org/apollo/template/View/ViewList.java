package org.apollo.template.View;

public enum ViewList {

    MAIN("MainView.fxml", "MainController"), // This controller needs to be set in the FXML view!
    FAQ("FAQView.fxml", "FAQController"),
    SETTINGS("SettingsView.fxml", "SettingsController"),
    HOME("HomeView.fxml", "HomeController");

    private final String fxmlFileName;
    private final String Controller;

    ViewList(String fxmlFileName, String controller) {
        this.fxmlFileName = fxmlFileName;
        Controller = controller;
    }

    public String getFxmlFileName() {
        return fxmlFileName;
    }

    public String getController() {
        return Controller;
    }

    public static final String LOADER_LOCATION = "/org/apollo/template/";

}

