package uet.oop.bomberman.entities.bomb;

import javafx.stage.Screen;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.entities.AnimatedEntitiy;

public class Bomb extends AnimatedEntitiy {
    protected double _timeToExplode = 100; // thời gian kích nổ (120s)
    protected double _timeAfterExplode = 20; // thời gian nổ bomb (20s)
    protected boolean _exploded = false;


    public Bomb(int x, int y) {
        super();
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
}
