package org.apollo.template.Controller;

public enum ControllerList {

    MAIN_CONTROLLER(new MainController()),
    SETTINGS_CONTROLLER(new SettingsController()),
    HOME_CONTROLLER(new HomeController()),
    FAQ_CONTROLLER(new FAQController());

    private final Object controller;

    ControllerList(Object controller) {
        this.controller = controller;
    }

    public Object getController() {
        return controller;
    }

}
