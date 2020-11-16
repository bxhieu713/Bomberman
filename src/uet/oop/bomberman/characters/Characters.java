package uet.oop.bomberman.characters;

import javafx.stage.Screen;
import uet.oop.bomberman.Board;
import uet.oop.bomberman.Game;
import uet.oop.bomberman.entities.AnimatedEntitiy;

public abstract class Characters extends AnimatedEntitiy {
    protected Board board;
    protected int direction = -1;
    protected boolean alive = true;
    protected boolean moving = false;
    public int timeAfter = 30;

    public Characters(int x, int y, Board board) {
        this.x = x;
        this.y = y;
        this.board = board;
    }

    @Override
    public abstract void update();

    @Override
    public abstract void render(Screen screen);


    protected abstract void move(double x1, double y1); // xác định hướng đi

    protected abstract void calculateMove(); // tính các bước đi

    protected abstract boolean canMove(double x1, double y1); // kiểm tra đối tượng có thể đi đến vị trí (x1, y1) hay ko


    public abstract void kill(); // đối tượng bị tiêu diệt

    protected abstract void afterKill(); // xử lí khi đối tượng bị tiêu diệt


    protected double getXMessage() {
        return (x * Game.SCALE) + (sprite.SIZE / 2 * Game.SCALE);
    }

    protected double getYMessage() {
        return (y * Game.SCALE) - (sprite.SIZE / 2 * Game.SCALE);
    }

}
