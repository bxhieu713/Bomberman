package uet.oop.bomberman.characters;

import javafx.stage.Screen;
import uet.oop.bomberman.Board;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.entities.bomb.Bomb;
import uet.oop.bomberman.graphics.Sprite;
import uet.oop.bomberman.input.Keyboard;

import java.util.*;

public class Bomber extends Characters{

    private List<Bomb> bombs;
    protected Keyboard input;
    public static List<Item> _items = new ArrayList<Item>();//xu li Item

    public Bomber(int x, int y, Board board) {
        super(x, y, board);
        bombs = board.getBombs();
        input = board.getInput();
        _sprite = Sprite.player_right;
    }

    @Override
    public void update() {

    }

    @Override
    public void render(Screen screen) {

    }

    @Override
    public boolean collide(Entity e) {
        return false;
    }

    @Override
    protected void move(double x1, double y1) {

    }

    @Override
    protected void calculateMove() {

    }

    @Override
    protected boolean canMove(double x1, double y1) {
        return false;
    }

    @Override
    public void kill() {

    }

    @Override
    protected void afterKill() {

    }
}
