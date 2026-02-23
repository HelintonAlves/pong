package pong;

import java.awt.*;
import java.lang.annotation.Retention;
import java.util.Random;

public class Ball {

    public double x, y;
    public int width, height;
    public double dx, dy;
    public double speed = 1.1;


    public Ball(int x, int y){
        this.x = x;
        this.y = y;
        this.width = 5;
        this.height = 5;
        RandomBall();

    }

    public void RandomBall(){
        int angle = new Random().nextInt(65 - 40) + 40;
        dx = Math.cos(Math.toRadians(angle));
        dy = Math.sin(Math.toRadians(angle));
    }

    public void tick(){
        if (y + (dy*speed) + height > Game.HEIGHT){
            dy*=-1;
        } else if (y + (dy*speed) < 0) {
            dy*=-1;
        }

        if( x <= 0){
            System.out.println("Ponto do computador");
            new Game();
            Game.pointComputador++;
            return;

        } else if (x >= Game.WIDTH) {
            System.out.println("Ponto do jogador");
            new Game();
            Game.pointPlayer++;
            return;
        }

        Rectangle bounds = new Rectangle((int)(x+(dx*speed)), (int)(y+(dy*speed)), width,height);
        Rectangle boundsPlayer = new Rectangle(Game.player.x, Game.player.y, Game.player.width, Game.player.height);
        Rectangle boundsEnemy = new Rectangle((int)Game.enemy.x, (int)Game.enemy.y, Game.enemy.width, Game.enemy.height);

        if (bounds.intersects(boundsPlayer)){
            RandomBall();
            if (dy < 0)
                dx*=+1;
        }else if (bounds.intersects(boundsEnemy)){
            RandomBall();
            if (dy > 0)
                dx*=-1;
        }

        x += dx*speed;
        y += dy*speed;

    }

    public void render(Graphics g){
        g.setColor(Color.yellow);
        g.fillRect((int) x,(int) y, width, height);
    }
}
