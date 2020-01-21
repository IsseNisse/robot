public class Ball {
    int x;
    int y;
    int vX;
    int vY;
    int size;
    String color;

    public Ball(int x, int y, int vX, int vY, int size, String color) {
        this.x = x;
        this.y = y;
        this.vX = vX;
        this.vY = vY;
        this.size = size;
        this.color = color;
    }

    public void move() {
        this.x = this.x + this.vX;
        this.y = this.y + this.vY;
        this.vX = this.vX - 1;
        this.vY = this.vY - 1;
    }
}
