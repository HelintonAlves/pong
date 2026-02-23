package pong;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable {

    private static int WIDTH = 240;
    private static int HEIGHT = 120;
    private static int SCALE = 3;
    private Player player;

    public Game(){
        this.setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
        player = new Player();
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
        new Thread(game).start();
    }

    public void tick(){

    }

    public void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null){
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        player.render(g);
        bs.show();
    }

    @Override
    public void run() {
        while (true){
            tick();
            render();
            try {
                Thread.sleep(1000/60);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
