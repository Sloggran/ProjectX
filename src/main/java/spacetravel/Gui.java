package spacetravel;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Gui{
    private final double WIDTH = 1200;
    private final double HEIGHT = 800;
    private Stage stage;
    private StackPane root;

    public Gui(Stage primaryStage, String title){
        stage = primaryStage;
        stage.setTitle(title);
        StackPane root = new StackPane();
        Rectangle rect = new Rectangle(WIDTH, HEIGHT);
        rect.setFill(Color.BLACK);
        root.getChildren().add(rect);
        stage.setScene(new Scene(root, WIDTH, HEIGHT));
        stage.setResizable(false);
    }

    public void setResolution(int width, int height){
        stage.setWidth(width);
        stage.setHeight(height);
    }

    public void setFullscreen(boolean value){
        stage.setFullScreen(value);
    }


    public void show() {
        stage.show();
    }
}