public class Tile {
    private boolean robot;
    private boolean light;
    private boolean food;
    private int x;
    private int y;

    /**
     *
     * @param food - håller koll på om det finns mat eller ej på tilen
     * @param light - håller koll på om det finns ljus eller ej på tilen
     * @param x - tilens poistion i x
     * @param y - tilens position i y
     */
    public Tile(boolean food, boolean light, int x, int y) {
        this.food = food;
        this.light = light;
        this.x = x;
        this.y = y;
    }


    /**
     * return värdet på light
     * @return
     */
    public boolean isLight() {
        return light;
    }

    /**
     * ändrar värdet på light
     * @param light
     */
    public void setLight(boolean light) {
        this.light = light;
    }

    /**
     * return värdet på food
     * @return
     */
    public boolean isFood() {
        return food;
    }

    /**
     * returnar tilens x värde
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     * returnar tilens y värde
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     * ändrar tilens x värde
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * ändrar tilens y värde
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }
}
