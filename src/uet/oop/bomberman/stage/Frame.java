package uet.oop.bomberman.stage;

import uet.oop.bomberman.Game;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public GamePanel gamePanel;
    private JPanel containerPanel;
    private InfoPanel infoPanel;

    private Game game;

    public Frame() {
        containerPanel = new JPanel(new BorderLayout());  //tạo bộ chứa mới
        gamePanel = new GamePanel(this);
        infoPanel = new InfoPanel(gamePanel.getGame());

        containerPanel.add(infoPanel, BorderLayout.PAGE_START);
        containerPanel.add(gamePanel, BorderLayout.PAGE_END);

        game = gamePanel.getGame();

        add(containerPanel);

        setResizable(false);  //không thể thay đổi kích thước cửa sổ đã dự định
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // hiển thị nút đóng
        pack(); // kích thước cửa sổ bằng hoặc cao hơn khung hình
        setLocationRelativeTo(null);
        setVisible(true);

        game.start();


    }

    public void setTime(int time){
        infoPanel.setTime(time);
    }

    public void setPoints(int points) {
        infoPanel.setPoints(points);
    }

}
