package app.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SlotMachine {

    private JPanel _mainPanel, _centerPanel;
    private JFrame _frame;
    private BufferedImage _cireasa = null , _lamaie = null, _lebenita = null, _portocale = null,
                          _pruna = null, _sapte = null, _struguri = null;


    public SlotMachine(){

         readImages();

        _mainPanel = new JPanel();
        _mainPanel.setLayout(new BorderLayout());

       _centerPanel = new JPanel();
       _centerPanel.setLayout(new GridLayout(3,5));
       myCenterPanel();

       _mainPanel.add(_centerPanel,BorderLayout.CENTER);
       JButton B = new JButton("aaddd");
       _mainPanel.add(B,BorderLayout.PAGE_END);

        myFrame();
        _frame.setVisible(true);
    }

    public void myCenterPanel(){

        _centerPanel.add(new SlotMove(_lamaie));
        _centerPanel.add(new SlotMove(_sapte));
        _centerPanel.add(new SlotMove(_lebenita));
        _centerPanel.add(new SlotMove(_portocale));
        _centerPanel.add(new SlotMove(_cireasa));

        _centerPanel.add(new SlotMove(_pruna));
        _centerPanel.add(new SlotMove(_struguri));
        _centerPanel.add(new SlotMove(_lamaie));
        _centerPanel.add(new SlotMove(_cireasa));
        _centerPanel.add(new SlotMove(_pruna));

        _centerPanel.add(new SlotMove(_pruna));
        _centerPanel.add(new SlotMove(_lebenita));
        _centerPanel.add(new SlotMove(_sapte));
        _centerPanel.add(new SlotMove(_sapte));
        _centerPanel.add(new SlotStable(_lamaie));

    }

    public void readImages(){

        try{
           _cireasa = ImageIO.read(getClass().getResource("images/cirese.JPG"));
           _lamaie = ImageIO.read(getClass().getResource("images/lamaie.JPG"));
           _lebenita = ImageIO.read(getClass().getResource("images/lebenita.JPG"));
           _portocale = ImageIO.read(getClass().getResource("images/portocala.JPG"));
           _pruna = ImageIO.read(getClass().getResource("images/pruna.JPG"));
           _sapte = ImageIO.read(getClass().getResource("images/sapte.JPG"));
           _struguri = ImageIO.read(getClass().getResource("images/strugure.JPG"));

        }catch (IOException e){
            e.printStackTrace();
        }

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
