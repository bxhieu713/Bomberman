package uet.oop.bomberman.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {
    private boolean[] keys = new boolean[100];
    public boolean up, down, left, right, space;

    public void update() {
        up = keys[KeyEvent.VK_UP] || keys[KeyEvent.VK_W];
        down = keys[KeyEvent.VK_DOWN] || keys[KeyEvent.VK_S];
        left = keys[KeyEvent.VK_LEFT] || keys[KeyEvent.VK_A];
        right = keys[KeyEvent.VK_RIGHT] || keys[KeyEvent.VK_D];
        space = keys[KeyEvent.VK_SPACE] || keys[KeyEvent.VK_X];
    }

    @Override
    public void keyTyped(KeyEvent e) {  //Được triệu hồi khi một key đã được gõ

    }

    @Override
    public void keyPressed(KeyEvent e) { //Được triệu hồi khi một key đã được nhấn
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) { //Được triệu hồi khi một key đã được nhả ra
        keys[e.getKeyCode()] = false;
    }
}
