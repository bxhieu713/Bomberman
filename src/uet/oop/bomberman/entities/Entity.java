package uet.oop.bomberman.entities;

import javafx.stage.Screen;
import uet.oop.bomberman.graphics.IRender;
import uet.oop.bomberman.graphics.Sprite;

/**
 * Lớp Entity đại diện cho các tọa độ trong game
 */
public abstract class Entity implements IRender {
    protected double x;
    protected double y;
    protected boolean remove = false;
    protected Sprite sprite;


    public abstract void update();

    public abstract void render(Screen screen);

    public void remove() {
        remove = true;
    }

    public boolean isRemove() {
        return remove;
    }

    abstract public boolean collide(Entity e) ;


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Sprite getSprite() {
        return sprite;
    }
    //    public int getXTile() {
//        return Coordinates.pixelToTile(x + sprite.SIZE / 2);
//    }
//
//    public int getYTile() {
//        return Coordinates.pixelToTile(y - sprite.SIZE / 2);
//    }


}
