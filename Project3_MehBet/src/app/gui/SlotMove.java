package app.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SlotMove extends JPanel {

    private BufferedImage bg = null;
    private int yOffset = 0;
    private int yDelta = 4;

    public SlotMove(){

        try{
            bg = ImageIO.read(getClass().getResource("lamaie.jpg"));
        }catch (IOException e){
            e.printStackTrace();
        }



        Timer timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yOffset += yDelta;
                if (yOffset > getHeight()) {
                    yOffset = 0;
                }
                repaint();
            }
        });

        timer.start();


    }


    @Override
    public Dimension getPreferredSize() {
      //  return new Dimension(bg.getWidth(),bg.getHeight());
        return new Dimension(115,155);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

      //  g2d.drawImage(bg,0,0,this);

        int xPos = (getWidth() - bg.getWidth()) / 2;
        int yPos = yOffset;

        yPos = yOffset;
        while (yPos < getHeight()) {
            g2d.drawImage(bg, xPos, yPos, this);
            yPos += bg.getHeight();
        }

        g2d.dispose();

    }

}
