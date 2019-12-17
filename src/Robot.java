public class Robot {
    private int hunger;
    private boolean light;

    /**
     * Constructor to make a new robot
     * @param hunger hunger variable to keep track of the robots hunger
     * @param light light variable so the robot knows if it likes light or dark
     */
    public Robot(int hunger, boolean light) {
        this.hunger = hunger;
        this.light = light;
    }

    /**
     * Gets the value of hunger
     * @return returns that value
     */
    public int getHunger() {
        return hunger;
    }

    /**
     * Sets hunger to another value
     * @param hunger new variable to keep track of the new hunger
     */
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    /**
     * Return the value of light, if its true or false
     * @return
     */
    public boolean isLight() {
        return light;
    }

    /**
     * Reduces the value of hunger so that the robot eventually need to seek food
     * @return
     */
    public int hungry() {
        return hunger--;
    }
}
