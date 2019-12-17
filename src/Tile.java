public class Tile {
    private boolean robot;
    private boolean light;
    private boolean food;

    public Tile(boolean robot, boolean food, boolean light) {
        this.robot = robot;
        this.food = food;
        this.light = light;
    }

    public boolean isRobot() {
        return robot;
    }

    public void setRobot(boolean robot) {
        this.robot = robot;
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }
}
