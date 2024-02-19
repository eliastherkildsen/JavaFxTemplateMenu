package org.apollo.template.View;

public enum ViewList {

    MAIN("MainView.fxml"),
    FAQ("FAQView.fxml"),
    SETTINGS("SettingsView.fxml"),
    HOME("HomeView.fxml");


    private final String fxmlFileName;
    ViewList(String fxmlFileName) {
        this.fxmlFileName = fxmlFileName;
    }
    public String getFxmlFileName() {
        return fxmlFileName;
    }
    public static final String LOADER_LOCATION = "/org/apollo/template/";

}

