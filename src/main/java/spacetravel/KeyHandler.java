package spacetravel;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;


public class KeyHandler {
    Scene scene;

    public KeyHandler(Scene scene){
        this.scene = scene;
        EventHandler<KeyEvent> event = e -> {
            System.out.println(e.getCode());
        };
        scene.setOnKeyPressed(event);
    }
}