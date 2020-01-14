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
            for (int x = -1 ; x < 2 ; x++) {
                for (int y = -1 ; y < 2 ; y++) {
                    if (y == 0 && x == 0) {
                        break;
                    }

                }
            }
        }
    }
}

