public class World {
    private int width;
    private int height;
    private Robot robots[];
    private Tile tiles[];

    public World(int width, int height) {
        this.width = width;
        this.height = height;
        this.robots = new Robot[(width*height)/10];
        this.tiles = new Tile[width*height];
    }

    public int getWidth() {
        return width;
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
