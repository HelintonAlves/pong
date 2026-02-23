package pong;

import java.awt.*;

public class Level {

    public static int level = 1, vitoriaPlayer = 0;


    public void tick(){

        if (Game.pointPlayer == 3 && (Game.pointComputador < 3)) {
            Game.pointPlayer = 0;
            Game.pointComputador = 0;
            level+=1;
            switch (level){
                case 1:
                    level = 1;
                    Enemy.speedEnemy = 0.07;
                    Ball.speedBall = 1.1;
                    if (vitoriaPlayer > 0)
                        vitoriaPlayer++;
                    break;
                case 2:
                    level = 2;
                    Enemy.speedEnemy = 0.09;
                    Ball.speedBall = 1.3;
                    vitoriaPlayer++;
                    break;
                case 3:
                    level = 3;
                    Enemy.speedEnemy = 0.10;
                    Ball.speedBall = 1.4;
                    vitoriaPlayer++;
                    break;
                case 4:
                    level = 4;
                    Enemy.speedEnemy = 0.11;
                    Ball.speedBall = 1.5;
                    vitoriaPlayer++;
                    break;
                default:
                    Enemy.speedEnemy = 0.07;
                    Ball.speedBall = 1.1;
                    vitoriaPlayer++;
                    level = 1;
                    break;

            }
        }



    }

    public void render(Graphics g){
        g.setFont(new Font("arial", Font.BOLD,8));
        g.setColor(Color.white);
        g.drawString("Level " + level, 5, Game.HEIGHT - 5);
        if (level > 0){
            g.setFont(new Font("arial", Font.BOLD, 8));
            g.setColor(Color.MAGENTA);
            g.drawString("Vitória Player: " + vitoriaPlayer, 180,Game.HEIGHT - 5);
        }
    }

}
