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
        createTiles();
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
            light = m == 1;
            int x = rand.nextInt(30);
            int y = rand.nextInt(30);
            robots[i] = new Robot(n,light,x,y);
        }
    }

    private void createTiles() {
        int xX = 0;
        int yY = 0;
        for (int i = 0 ; i < this.tiles.length ; i++) {
            if (xX > 29) {
                xX = 0;
                yY++;
            }
            Random rand = new Random();

            boolean l;
            int m = rand.nextInt(10);
            l = m < 2;

            boolean f;
            int n = rand.nextInt(10);
            f = n < 2;

            this.tiles[i] = new Tile(f,l,xX,yY);
            xX++;
        }
    }

    public int getHeight() {
        return height;
    }

    public Tile[] getTiles() {
        return tiles;
    }
}
