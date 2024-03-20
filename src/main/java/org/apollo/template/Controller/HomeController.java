package org.apollo.template.Controller;

import org.apollo.template.Service.Debugger.DebugMessage;

public class HomeController {
    private static HomeController INSTANCE;


    private HomeController() {
        if (INSTANCE == null) {
            DebugMessage.info(this, "Creating an instance of " + this);
        }
    }

    public static HomeController getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HomeController();
        }
        return INSTANCE;
    }
}
