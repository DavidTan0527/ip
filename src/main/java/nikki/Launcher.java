package nikki;

import javafx.application.Application;
import javafx.scene.text.Font;

/**
 * A launcher class to workaround classpath issues.
 */
public class Launcher {
    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }
}