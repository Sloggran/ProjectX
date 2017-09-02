package spacetravel;

public class Point {
    private double x, y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void add(int a){
        x += a;
        y += a;
    }

    public void add(Point a){
        x += a.getX();
        y += a.getY();
    }

    public void mult(int a){
        x *= a;
        y *= a;
    }

    public double scalar(Point a){
        return x*a.getX() + y*a.getY();
    }

    public void zero(){
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
