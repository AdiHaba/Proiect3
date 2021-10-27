package app.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SlotMove extends JPanel {

    private BufferedImage _image;
    private int yOffset = -10;
    private int yDelta = 4;

    public SlotMove(BufferedImage _image){

        this._image = _image;

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


        int xPos = (getWidth() - _image.getWidth()) / 2;
        int yPos = yOffset;

        yPos = yOffset;
        while (yPos < getHeight()) {
            g2d.drawImage(_image, xPos, yPos, this);
            yPos += _image.getHeight();
        }

        g2d.dispose();

    }



}
