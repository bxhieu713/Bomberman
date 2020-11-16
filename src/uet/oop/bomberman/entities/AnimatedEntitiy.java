package uet.oop.bomberman.entities;

import javafx.stage.Screen;

/**
 * Entity có thể chuyển động
 */
public abstract class AnimatedEntitiy extends Entity {

    protected int animate = 0;
    protected final int MAX_ANIMATE = 7500;

    protected void animate() {
        if (animate < MAX_ANIMATE) {
            animate++;
        } else {
            animate = 0;
        }
    }


}
