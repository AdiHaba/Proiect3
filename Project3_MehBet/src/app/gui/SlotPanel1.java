package app.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SlotPanel1 extends JPanel {

    private BufferedImage bg = null;
    private int yOffset = 0;
    private int yDelta = 4;

    public SlotPanel1(){

        try{
            bg = ImageIO.read(getClass().getResource("portocala.jpg"));
        }catch (IOException e){
            e.printStackTrace();
        }

        Timer timer = new Timer(40, new ActionListener() {
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
        return new Dimension(bg.getWidth(),bg.getHeight());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

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
