package uet.oop.bomberman.stage;

import uet.oop.bomberman.Game;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private Game game;

    public GamePanel(Frame frame) {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE));

        game = new Game(frame);

        add(game);

        game.setVisible(true);

        setVisible(true);
//        setFocusable(true);
    }

    public Game getGame() {
        return game;
    }
}
