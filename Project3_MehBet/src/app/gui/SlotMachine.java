package app.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SlotMachine {

    private JPanel _mainPanel, _centerPanel;
    private JFrame _frame;
    private BufferedImage bg = null;


    public SlotMachine(){

        _mainPanel = new JPanel();
        _mainPanel.setLayout(new BorderLayout());

        myCenterPanel();
        _mainPanel.add(_centerPanel,BorderLayout.CENTER);

        myFrame();
        _frame.setVisible(true);
    }

    public void myCenterPanel(){

        _centerPanel = new JPanel();
        _centerPanel.setLayout(new GridLayout(3,5));

        _centerPanel.add(new SlotPanel1());
        _centerPanel.add(new SlotPanel1());
        _centerPanel.add(new SlotPanel1());
        _centerPanel.add(new SlotPanel1());
        _centerPanel.add(new SlotPanel1());

        _centerPanel.add(new SlotPanel1());
        _centerPanel.add(new SlotPanel1());
        _centerPanel.add(new SlotPanel1());
        _centerPanel.add(new SlotPanel1());
        _centerPanel.add(new SlotPanel1());

        _centerPanel.add(new SlotPanel1());
        _centerPanel.add(new SlotPanel1());
        _centerPanel.add(new SlotPanel1());
        _centerPanel.add(new SlotPanel1());
        _centerPanel.add(new SlotPanel1());
    }

    public void myFrame(){
        _frame = new JFrame("Slot");
        _frame.setContentPane(_mainPanel);
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
       SlotPanel1 s = new SlotPanel1();
    }
}
