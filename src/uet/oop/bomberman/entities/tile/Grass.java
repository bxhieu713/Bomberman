package uet.oop.bomberman.entities.tile;


import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.graphics.Sprite;

/**
 * đối tượng mà Bomber và Enemy có thể di chuyển xuyên qua, và cho phép đặt Bomb lên vị trí của nó
 */
public class Grass extends Tile {
    public Grass(int x, int y, Sprite sprite) {
        super(x,y,sprite);
    }

    @Override
    public boolean collide(Entity e) {
        return true; // có thể đi qua
    }
}
