package uet.oop.bomberman.entities.bomb;

import javafx.stage.Screen;
import uet.oop.bomberman.entities.Entity;

public class FlameSegment extends Entity {
    protected boolean last;

    public FlameSegment(double x, double y, int direction, boolean last) {
        this.x = x;
        this.y = y;
        this.last = last;

        switch (direction) {
            case 0:
            case 1:
        }
    }
    @Override
    public void update() {

    }

    public void render(Screen screen) {
        int xt = (int) x * 16;
        int yt = (int) y * 16;

        screen.renderEntity(xt, yt , this);
    }

    @Override
    public boolean collide(Entity e) {
        return false;
    }
}
