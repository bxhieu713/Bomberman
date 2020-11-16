package uet.oop.bomberman.entities.tile;

import javafx.stage.Screen;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.graphics.Sprite;

/**
 * Tile gồm những vật cố định, không thể di chuyển
 */
public abstract class Tile extends Entity {

    public Tile(int x, int y, Sprite sprite) {
        this.x = x;
        this.y = y;
        this.sprite = sprite;

    }

    @Override
    public boolean collide(Entity e) {
        return false; // mặc định không cho qua
    }

    @Override
    public void render(Screen screen) {
//        screen.renderEntity( Coordinates.tileToPixel(_x), Coordinates.tileToPixel(_y), this);
    }

    @Override
    public void update() {

    }
}
