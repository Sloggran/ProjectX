package spacetravel;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    private final String TITLE = "Space Traveller";

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Gui gui = new Gui(primaryStage, TITLE);
        //gui.setResolution(1920, 1080);
        gui.show();
        KeyHandler handler = new KeyHandler(primaryStage.getScene());
    }
}

