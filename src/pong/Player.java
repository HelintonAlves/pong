package pong;

import java.awt.*;

public class Player {

    public boolean up, down;
    public int x, y, width, height;

    public Player(int x , int y){
        this.x = x;
        this.y = y;
        this.width = 10;
        this.height = 40;
    }

    public void tick(){
        if(up){
            y--;
        } else if (down) {
            y++;
        }

        //Lógica da colisão com a janela
        if (y < 0){
            y = 0;
        } else if (y+height > Game.HEIGHT) {
            y = Game.HEIGHT - height;
        }


    }

    public void render(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(x, y, width, height);
    }

}
