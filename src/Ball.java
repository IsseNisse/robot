import java.awt.*;

public class Ball {
    private int x;
    private int y;
    private int vX;
    private int vY;
    private int size;
    private Color color;

    public Ball(int x, int y, int vX, int vY, int size, Color color) {
        this.x = x;
        this.y = y;
        this.vX = vX;
        this.vY = vY;
        this.size = size;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getvX() {
        return vX;
    }

    public int getvY() {
        return vY;
    }

    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public void move() {
        this.x = this.x + this.vX;
        this.y = this.y + this.vY;
    }
   
}
