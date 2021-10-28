package app.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SlotMachine {

    private JPanel _mainPanel, _centerPanel;
    private JFrame _frame;
    private BufferedImage _cireasa = null , _lamaie = null, _lebenita = null, _portocale = null,
                          _pruna = null, _struguri = null, _sapte = null;
    private SlotStable _linia1Col1, _linia1Col2, _linia1Col3, _linia1Col4, _linia1Col5;
    private SlotStable _linia2Col1, _linia2Col2, _linia2Col3, _linia2Col4, _linia2Col5;
    private SlotStable _linia3Col1, _linia3Col2, _linia3Col3, _linia3Col4, _linia3Col5;
    private JButton _spin;
    private Integer _nrLinia1Col1, _nrLinia1Col2,_nrLinia1Col3, _nrLinia1Col4, _nrLinia1Col5;
    private Integer _nrLinia2Col1,  _nrLinia2Col2,  _nrLinia2Col3, _nrLinia2Col4, _nrLinia2Col5;
    private Integer _nrLinia3Col1, _nrLinia3Col2, _nrLinia3Col3, _nrLinia3Col4, _nrLinia3Col5;

    public SlotMachine(){

         readImages();

        _mainPanel = new JPanel();
        _mainPanel.setLayout(new BorderLayout());

        initializeMyCenterPanelStable();

       _mainPanel.add(_centerPanel,BorderLayout.CENTER);
       _spin = new JButton("Spin");
       _spin.addActionListener(new SpinEvent(_nrLinia1Col1, _nrLinia1Col2,_nrLinia1Col3, _nrLinia1Col4, _nrLinia1Col5,
               _nrLinia2Col1,  _nrLinia2Col2,  _nrLinia2Col3, _nrLinia2Col4, _nrLinia2Col5,_nrLinia3Col1, _nrLinia3Col2,
               _nrLinia3Col3, _nrLinia3Col4, _nrLinia3Col5, _linia1Col1, _linia1Col2, _linia1Col3, _linia1Col4, _linia1Col5,
               _linia2Col1, _linia2Col2, _linia2Col3, _linia2Col4, _linia2Col5,_linia3Col1, _linia3Col2, _linia3Col3, _linia3Col4,
               _linia3Col5, _cireasa , _lamaie , _lebenita , _portocale , _pruna , _struguri, _sapte));

       _mainPanel.add(_spin,BorderLayout.PAGE_END);

        myFrame();
    }

    public void initializeMyCenterPanelStable(){

        _centerPanel = new JPanel();
        _centerPanel.setLayout(new GridLayout(3,5));

        _linia1Col1 = new SlotStable(_pruna);
        _nrLinia1Col1 = 5;
        _linia1Col2 = new SlotStable(_pruna);
        _nrLinia1Col2 = 5;
        _linia1Col3 = new SlotStable(_cireasa);
        _nrLinia1Col3 = 1;
        _linia1Col4 = new SlotStable(_cireasa);
        _nrLinia1Col4 = 1;
        _linia1Col5 = new SlotStable(_lamaie);
        _nrLinia1Col5 = 2;
        _linia2Col1 = new SlotStable(_sapte);
        _nrLinia2Col1 = 7;
        _linia2Col2 = new SlotStable(_sapte);
        _nrLinia2Col2 = 7;
        _linia2Col3 = new SlotStable(_struguri);
        _nrLinia2Col3 = 6;
        _linia2Col4 = new SlotStable(_lebenita);
        _nrLinia2Col4 = 3;
        _linia2Col5 = new SlotStable(_portocale);
        _nrLinia2Col5 = 4;
        _linia3Col1 = new SlotStable(_pruna);
        _nrLinia3Col1 = 5;
        _linia3Col2 = new SlotStable(_cireasa);
        _nrLinia3Col2 = 1;
        _linia3Col3 = new SlotStable(_lamaie);
        _nrLinia3Col3 = 2;
        _linia3Col4 = new SlotStable(_lamaie);
        _nrLinia3Col4 = 2;
        _linia3Col5 = new SlotStable(_sapte);
        _nrLinia3Col5 = 7;

        _centerPanel.add(_linia1Col1);
        _centerPanel.add(_linia1Col2);
        _centerPanel.add(_linia1Col3);
        _centerPanel.add(_linia1Col4);
        _centerPanel.add(_linia1Col5);

        _centerPanel.add(_linia2Col1);
        _centerPanel.add(_linia2Col2);
        _centerPanel.add(_linia2Col3);
        _centerPanel.add(_linia2Col4);
        _centerPanel.add(_linia2Col5);

        _centerPanel.add(_linia3Col1);
        _centerPanel.add(_linia3Col2);
        _centerPanel.add(_linia3Col3);
        _centerPanel.add(_linia3Col4);
        _centerPanel.add(_linia3Col5);

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
        _frame.setResizable(false);
        _frame.setSize(700,450);
        _frame.setVisible(true);
    }

    public static void main(String[] args) {
      SlotMachine s = new SlotMachine();
    }


}
