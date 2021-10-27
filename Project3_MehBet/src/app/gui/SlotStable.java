package app.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SlotStable extends JPanel {

    private BufferedImage bg = null;
    private int yOffset = 0;
    private int yDelta = 4;

    public SlotStable(){

        try{
            bg = ImageIO.read(getClass().getResource("images/lamaie.JPG"));
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public Dimension getPreferredSize() {
       return new Dimension(115,155);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

          g2d.drawImage(bg,0,0,this);

    }

}
