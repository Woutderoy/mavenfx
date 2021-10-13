package nl.inholland.javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import nl.inholland.javafx.UI.loginWindow;

public class App extends Application {
    @Override
    public void start(Stage window) throws Exception {

        // rendering the text more crisply
        System.setProperty("prism.lcdtext", "false");

        // We should open a login window, but that is outside of scope for this lesson.
        // So we go straight to the main window of the application

        // open the main window
        loginWindow lw = new loginWindow();
        lw.getStage().setMinHeight(30);
        lw.getStage().setMinWidth(70);
        lw.getStage().show();
    }
    }

