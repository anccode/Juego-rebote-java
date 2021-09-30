package bolarebota;

import javax.swing.JPanel;
import java.awt.*;


public class MiPanel extends JPanel {
    private Bola bolita;

    public MiPanel(){
        bolita = new Bola(Color.BLUE,525,325);
    }

    public void paint(Graphics g ) {
        super.paint(g);
        bolita.pintar(g);
        bolita.mover();
        bolita.rebotar(getWidth(), getHeight());
    }

    public Dimension getPreferredSize() {
        return new Dimension(1200, 800);
    }

}
