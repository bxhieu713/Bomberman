package uet.oop.bomberman;

import javafx.stage.Screen;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

/**
 * tùy chọn và cấu hình
 */
public class Game extends Canvas {
    public static final int TILES_SIZE = 16,   // đọ rộng của 1 ô
            WIDTH = TILES_SIZE * (int) (31 / 2),
            HEIGHT = 13 * TILES_SIZE;

    public static int SCALE = 3;  //tỷ lệ

    public static final String TITLE = "BombermanGame";

    private static final int BOMRATE = 1;
    private static final int BOMRADIUS = 1;  // ban kinh
    private static final double BOMBERSPEED = 1.0; //tốc độ của bomber

    public static final int TIME = 200; // THỜI GIAN
    public static final int POINT = 0;

    protected static final int bomrate = BOMRATE;
    protected static final int bomradius = BOMRADIUS;
    protected static final double bomberspeed = BOMBERSPEED;

//    protected int screenDelay = SCREENDELAY;
//    private Keyboard input;

    private boolean running = false;
    private boolean paused = true;

    private Screen screen;
    private Board board;
    private Frame frame;

    private BufferedImage image = new BufferedImage(WIDTH, HEIGHT, java.awt.image.BufferedImage.TYPE_INT_RGB);
    private int[] pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();

    public void start() {

    }
    public Game(Frame frame) {
        frame = frame;
        frame.setTitle(TITLE);

        screen = new Screen(WIDTH, HEIGHT);
        _input = new Keyboard();

        _board = new Board(this, _input, screen);
        addKeyListener(_input);
    }
}
