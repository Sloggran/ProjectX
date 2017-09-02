package spacetravel;

public enum Key{
    Left("A", true), Right("D", true), Up("W", true), Down("S", true);

    String keycode;
    boolean moving;

    Key(String keycode, boolean moving){
        this.keycode = keycode;
        this.moving = moving;
    }
}
