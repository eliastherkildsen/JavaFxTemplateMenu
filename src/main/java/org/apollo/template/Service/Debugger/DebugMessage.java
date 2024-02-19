/*
 * @author Mads R, Knudsen
 * @version 1.0
 * @since 23.01.2024
 */

package org.apollo.template.Service.Debugger;

import org.apollo.template.Service.AnsiColorCode;
import org.apollo.template.Service.ConfigLoader;

public class DebugMessage {

    /**
     * Shows a formatted Debug message in the cmd.
     * @param instance Object
     * @param message String
     */
    public static void info (Object instance, String message){
        if (ConfigLoader.instance.getDebug() == 1){
            System.out.printf("%s[%s]%s %s%s%n", AnsiColorCode.BLUE, instance.getClass().getSimpleName() , AnsiColorCode.GREEN, message, AnsiColorCode.RESET);
        }
    }
    /**
     * Shows a formatted Debug message in the cmd.
     * @param instance Object
     * @param message String
     */
    public static void error (Object instance, String message){
        if (ConfigLoader.instance.getDebug() == 1) {
            System.out.printf("%s[%s]%s %s%s%n", AnsiColorCode.BLUE, instance.getClass().getSimpleName(), AnsiColorCode.RED, message, AnsiColorCode.RESET);
        }
    }

    /**
     * Shows a formatted Debug message in the cmd.
     * To handle edge cases like static methods.
     * @param clazz Class
     * @param message String
     */
    public static void info (Class<?> clazz, String message){
        if (ConfigLoader.instance.getDebug() == 1) {
            System.out.printf("%s[%s]%s %s%s%n", AnsiColorCode.BLUE, clazz.getSimpleName(), AnsiColorCode.GREEN, message, AnsiColorCode.RESET);

        }
    }

    /**
     * Shows a formatted Debug message in the cmd.
     * To handle edge cases like Static methods.
     * @param clazz Class
     * @param message String
     */
    public static void error (Class<?> clazz, String message){
        if (ConfigLoader.instance.getDebug() == 1) {
            System.out.printf("%s[%s]%s %s%s%n", AnsiColorCode.RED, clazz.getSimpleName(), AnsiColorCode.RED, message, AnsiColorCode.RESET);
        }
    }
}
