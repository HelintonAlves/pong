package pong;

import javax.swing.*;
import java.awt.*;

public class Game extends Canvas implements Runnable {

    private static int WIDTH = 240;
    private static int HEIGHT = 120;
    private static int SCALE = 3;

    public Game(){
        this.setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
    }

    public static void main(String[] args) {
        Game game = new Game();
        JFrame frame = new JFrame("PONG");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(game);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    @Override
    public void run() {

    }
}
