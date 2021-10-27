package app.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SlotStable extends JPanel {

    private BufferedImage _image;
    private int yOffset = 0;
    private int yDelta = 4;

    public SlotStable(BufferedImage _image){
        this._image = _image;
    }

    @Override
    public Dimension getPreferredSize() {
       return new Dimension(115,155);
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        int xPos = (getWidth() - _image.getWidth()) / 2;
        int yPos = yOffset = 0;

        Graphics2D g2d = (Graphics2D) g.create();
          g2d.drawImage(_image,xPos,yPos,this);

    }

}
