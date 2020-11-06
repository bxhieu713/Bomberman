package oop.bomberman.entities;

import java.awt.*;
import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;


public abstract class Entity {
    protected int x;
    protected int y;
    protected Image img;

    public Entity(int x, int y, Image img) {
        this.x = x;
        this.y = y;
        this.img = img;
    }


    public abstract void update() ;

    public void render(GraphicsContext gc){
        gc.drawImage(img, x, y);
    }
}
