public class Tile {
    private boolean robot;
    private boolean light;
    private boolean food;

    /**
     *
     * @param robot - håller koll på om det finns en robot eller ej på tilen
     * @param food - håller koll på om det finns mat eller ej på tilen
     * @param light - håller koll på om det finns ljus eller ej på tilen
     */
    public Tile(boolean robot, boolean food, boolean light) {
        this.robot = robot;
        this.food = food;
        this.light = light;
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

    /**
     *
     * @return - returnar true om det finns både en robot och mat på en tile
     */
    public boolean isEat() {
        boolean eat = false;
        if (this.food && this.robot) {
            eat = true;
        }
        return eat;
    }
}
