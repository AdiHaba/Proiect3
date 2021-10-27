package app.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class SlotMachine {

    private JPanel _mainPanel, _centerPanel;
    private JFrame _frame;
    private BufferedImage bg = null;


    public SlotMachine(){

        _mainPanel = new JPanel();
        _mainPanel.setLayout(new BorderLayout());

       _centerPanel = new JPanel();
       _centerPanel.setLayout(new GridLayout(3,5));
       myCenterPanel();

       _mainPanel.add(_centerPanel,BorderLayout.CENTER);

        myFrame();
        _frame.setVisible(true);
    }

    public void myCenterPanel(){
        _centerPanel.add(new SlotMove());
        _centerPanel.add(new SlotMove());
        _centerPanel.add(new SlotMove());
        _centerPanel.add(new SlotMove());
        _centerPanel.add(new SlotMove());

        _centerPanel.add(new SlotMove());
        _centerPanel.add(new SlotMove());
        _centerPanel.add(new SlotMove());
        _centerPanel.add(new SlotMove());
        _centerPanel.add(new SlotMove());

        _centerPanel.add(new SlotMove());
        _centerPanel.add(new SlotMove());
        _centerPanel.add(new SlotMove());
        _centerPanel.add(new SlotMove());
        _centerPanel.add(new SlotStable());
    }

    public void myFrame(){
        _frame = new JFrame("Slot");
        _frame.setContentPane(_mainPanel);
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frame.setLocation(500,90);
        _frame.setSize(700,400);
    }

    public static void main(String[] args) {
      SlotMachine s = new SlotMachine();
    }


}
