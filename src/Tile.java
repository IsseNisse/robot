public class Tile {
    private boolean robot;
    private boolean light;
    private boolean food;
    private int x;
    private int y;

    /**
     *
     * @param robot - håller koll på om det finns en robot eller ej på tilen
     * @param food - håller koll på om det finns mat eller ej på tilen
     * @param light - håller koll på om det finns ljus eller ej på tilen
     * @param x - tilens poistion i x
     * @param y - tilens position i y
     */
    public Tile(boolean robot, boolean food, boolean light, int x, int y) {
        this.robot = robot;
        this.food = food;
        this.light = light;
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return - return värdet på robot
     */
    public boolean isRobot() {
        return robot;
    }

    /**
     *
     * @param robot - ändrar värdet på robot
     */
    public void setRobot(boolean robot) {
        this.robot = robot;
    }

    /**
     *
     * @return - return värdet på light
     */
    public boolean isLight() {
        return light;
    }

    /**
     *
     * @param light - ändrar värdet på light
     */
    public void setLight(boolean light) {
        this.light = light;
    }

    /**
     *
     * @return - return värdet på food
     */
    public boolean isFood() {
        return food;
    }

    /**
     *
     * @param food - ändrar värdet på food
     */
    public void setFood(boolean food) {
        this.food = food;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
