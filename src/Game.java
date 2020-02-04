import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;


public class Game extends Canvas implements Runnable {
    private String title = "Robots";
    private JFrame frame;
    private int fps = 30;
    private int ups = 30;
    private boolean running = false;
    private Thread thread;
    World world = new World(30,30, 2);

    /**
     * Skapar en frame
     * @param w - framens bredd
     * @param h - framens höjd
     */
    public Game(int w, int h) {
        Dimension size = new Dimension(w, h);
        setPreferredSize(size);
        frame = new JFrame();
        frame.setTitle(title);
    }

    /**
     * startar spelet
     */
    private synchronized void start() {
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    /**
     * avslutar spelet
     */
    private synchronized void stop() {
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * hanterar spelets framerate och updaterate
     */
    @Override
    public void run() {
        double frameUpdateInterval = 1000000000.0 / fps;
        double stateUpdateInterval = 1000000000.0 / ups;
        double deltaFrame = 0;
        double deltaUpdate = 0;
        long lastTime = System.nanoTime();

        while (running) {
            long now = System.nanoTime();
            deltaFrame += (now - lastTime) / frameUpdateInterval;
            deltaUpdate += (now - lastTime) / stateUpdateInterval;
            lastTime = now;

            while (deltaUpdate >= 1) {
                update();
                deltaUpdate--;
            }

            while (deltaFrame >= 1) {
                draw();
                deltaFrame--;
            }
        }
        stop();
    }

    /**
     * ritar ut spelet på framen
     */
    private void draw() {
        BufferStrategy bs = getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();
        g.setColor(new Color(0xFFFFFF));
        g.fillRect(0,0,600,600);
        tiles(g);
        for (int i = 0; i < world.getRobots().length; i++) {
            g.setColor(new Color(0x4a4a4a));
            int x = world.getRobots()[i].getX() * 20;
            int y = world.getRobots()[i].getY() * 20;
            g.fillRect(x,y,20,20);
        }
        g.dispose();
        bs.show();
    }

    /**
     * Ritar ut alla tiles och ger dem olika färger beroende på om dem har en ljuskälla eller mat i sig
     * @param g grafik
     */
    private void tiles(Graphics g) {
        for (int i = 0 ; i < world.getTiles().length ; i++) {
            g.setColor(new Color(0x000000));
            int x = world.getTiles()[i].getX() * 20;
            int y = world.getTiles()[i].getY() * 20;

            g.drawRect(x,y,20,20);

            if (world.getTiles()[i].isLight()) {
                g.setColor(new Color(0xffff00));
                g.fillRect(x,y,20,20);
            }

            if (world.getTiles()[i].isFood()) {
                g.setColor(new Color(0x00ffaa));
                g.fillRect(x,y,20,20);
            }
        }
    }

    private void update() {}

    public static void main(String[] args) {
        Game game = new Game(600,600);
        game.frame.add(game);
        game.frame.pack();
        game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.frame.setLocationRelativeTo(null);
        game.frame.setVisible(true);
        game.start();
    }
}