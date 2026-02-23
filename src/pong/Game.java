package pong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Game extends Canvas implements Runnable, KeyListener {

    public static int WIDTH = 240;
    public static int HEIGHT = 160;
    public static int SCALE = 3;
    public BufferedImage layer = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
    public static Player player;
    public static Enemy enemy;
    public static Ball ball;
    public static Level level;
    public static int pointPlayer = 0, pointComputador = 0;


    public Game(){
        this.setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
        this.addKeyListener(this);
        player = new Player(0, 60);
        enemy = new Enemy(235, 60);
        ball = new Ball(120,HEIGHT/2 - 1);
        level = new Level();


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
        frame.toFront();
        game.setFocusable(true);
        game.requestFocusInWindow();
        new Thread(game).start();

    }

    public void tick(){
        player.tick();
        enemy.tick();
        ball.tick();
        level.tick();
    }

    public void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null){
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = layer.getGraphics();
        //Creando o player
        g.setColor(Color.black); //Set o player para black, melhorando a movimentação
        g.fillRect(0,0,WIDTH,HEIGHT); //Set o player para black, melhorando a movimentação
        player.render(g);
        enemy.render(g);
        ball.render(g);
        level.render(g);

        g.setFont(new Font("arial", Font.BOLD,8));
        g.setColor(Color.white);
        g.drawString("Player: " + pointPlayer + " | " + " Computador: " + pointComputador, 80, 10 );


        g = bs.getDrawGraphics();
        //Creando a layer para o jogo
        g.drawImage(layer, 0, 0,WIDTH*SCALE,HEIGHT*SCALE,null);

        bs.show();
    }

    @Override
    public void run() {
        while(true){
            tick();
            render();
            try {
                Thread.sleep(1000 / 60);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W){
            player.up = true;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S) {
            player.down = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W){
            player.up = false;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S) {
            player.down = false;
        }
    }
}
