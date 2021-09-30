package bolarebota;

import java.awt.*;

public class Bola {
    private Color color;
    private int x;
    private int y;
    private int dir;

    private final int VEL = 5;
    private final int TAM = 150;
    public Bola(Color color, int x, int y){
        this.color = color;
        this.x = x;
        this.y = y;
        //dir = 1;
    }

    public void pintar(Graphics g){
        g.setColor(color);
        g.fillOval(x, y, TAM, TAM);        
    }    
    public void mover(){
        if(dir == 0){
            y += VEL; 
        } else if(dir == 1){
            y -= VEL;
        }else if(dir == 2){
            x += VEL;
        }else if(dir == 3){
            x -= VEL;
        }else if(dir == 4){
            x += VEL;
            y += VEL;
        }else if(dir == 5){
            x -= VEL;
            y -= VEL;
        }else if(dir == 6){
            x -= VEL;
            y += VEL;
        }else if(dir == 7){
            x += VEL;
            y -= VEL;
        }   
    }
    public void rebotar(int limX, int limY){
        if(y <= 0){
            int nr = (int) (Math.random()*3)+1;
            dir = nr == 1 ? 6 : nr == 2 ? 0 : 4;
        } else if(x <= 0){
            int nr = (int) (Math.random()*3)+1;
            dir = nr == 1 ? 7 : nr == 2 ? 2 : 4;
        }else if(y >= limY - TAM){
            int nr = (int) (Math.random()*3)+1;
            dir = nr == 1 ? 5 : nr == 2 ? 1 : 7;
        }else if(x >= limX - TAM){
            int nr = (int) (Math.random()*3)+1;
            dir = nr == 1 ? 6 : nr == 2 ? 3 : 5;
        }
    }
    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public int getDir(){
        return dir;
    }
    public void setDir(int dir){
        this.dir = dir;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.dir = y;
    }
    
}
