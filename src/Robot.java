public class Robot {
    private int hunger;
    private boolean light;
    private int x;
    private int y;

    /**
     * Constructor to make a new robot
     * @param hunger hunger variable to keep track of the robots hunger
     * @param light light variable so the robot knows if it likes light or dark
     */
    public Robot(int hunger, boolean light, int x, int y) {
        this.hunger = hunger;
        this.light = light;
        this.x = x;
        this.y = y;
    }

    /**
     * get the value of X
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     * Get the value of Y
     * @return
     */
    public int getY() {
        return y;
    }
}
