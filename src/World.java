import java.util.Random;

public class World {
    private int width;
    private int height;
    private Robot[] robots;
    private Tile[] tiles;

    public World(int width, int height, int robots) {
        this.width = width;
        this.height = height;
        this.robots = new Robot[robots];
        this.tiles = new Tile[width*height];
        createRobots();
    }

    public int getWidth() {
        return width;
    }

    public Robot[] getRobots() {
        return robots;
    }

    private void createRobots() {
        int size = this.robots.length;
        boolean light;
        for (int i = 0 ; i < size ; i++) {
            Random rand = new Random();
            int n = rand.nextInt(50);

            int m = rand.nextInt(2);
            if (m == 1) {
                light = true;
            } else {
                light = false;
            }
            int x = rand.nextInt(30);
            int y = rand.nextInt(30);
            robots[i] = new Robot(n,light,x,y);
        }
    }

    public int getHeight() {
        return height;
    }

    public Tile[] getTiles() {
        return tiles;
    }

    private void lightCheck() {
        for (int i = 0; i < robots.length ; i++) {

        }
    }
}
