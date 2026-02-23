package pong;

import java.awt.*;

public class Level {

    public int level = 1;

    public void tick(){

    }

    public void render(Graphics g){
        g.setFont(new Font("arial", Font.BOLD,8));
        g.setColor(Color.white);
        g.drawString("Level " + level, 5, Game.HEIGHT - 5);
    }

}
