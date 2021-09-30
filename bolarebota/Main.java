package bolarebota;

import javax.swing.JFrame;
import java.awt.*;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        JFrame frm = new JFrame("Bola - Rebote");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.add(new MiPanel());
        frm.pack();
        //frm.setSize(800,600);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        while(true){
            frm.repaint();
            Thread.sleep(20);
        }
    }
}