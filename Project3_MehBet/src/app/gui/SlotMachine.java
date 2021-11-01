package app.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class SlotMachine {

    private JPanel _mainPanel, _centerPanel,_botPanel;
    private JFrame _frame;
    private JButton _spin;
    private JButton set;
    private JTextField suma;
    private SlotStable[][] _slots;
    private int[][] _valueSlots;
    private BufferedImage _cireasa = null , _lamaie = null, _lebenita = null, _portocale = null,
                          _pruna = null, _struguri = null, _sapte = null;


    public SlotMachine(){

        if(SwingUtilities.isEventDispatchThread()){

            readImages();

            _mainPanel = new JPanel();
            _mainPanel.setLayout(new BorderLayout());

            initializeMyCenterPanelStable();

            _mainPanel.add(_centerPanel,BorderLayout.CENTER);
            _spin = new JButton("Spin");

            _spin.addActionListener(new SpinEvent(_slots,_valueSlots, _portocale , _struguri , _pruna , _lamaie , _lebenita , _cireasa, _sapte));


            ////////////////////////v//////////////////latacode
            _botPanel = new JPanel();
            _botPanel.setLayout(new FlowLayout());

            set = new JButton("Set");
            suma = new JTextField();
            suma.setPreferredSize(new Dimension(20,20));
            _botPanel.add(set);
            _botPanel.add(suma);
            _mainPanel.add(_botPanel,BorderLayout.SOUTH);
            ///////////////////////^//////////////////latacode
            _botPanel.add(_spin,BorderLayout.PAGE_END);

            myFrame();
        }else{
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {

                    readImages();

                    _mainPanel = new JPanel();
                    _mainPanel.setLayout(new BorderLayout());

                    initializeMyCenterPanelStable();

                    _mainPanel.add(_centerPanel,BorderLayout.CENTER);
                    _spin = new JButton("Spin");

                    _spin.addActionListener(new SpinEvent(_slots,_valueSlots, _portocale , _struguri , _pruna , _lamaie , _lebenita , _cireasa, _sapte));


                    ////////////////////////v//////////////////latacode
                    _botPanel = new JPanel();
                    _botPanel.setLayout(new FlowLayout());

                    set = new JButton("Set");
                    suma = new JTextField();
                    suma.setPreferredSize(new Dimension(20,20));
                    _botPanel.add(set);
                    _botPanel.add(suma);
                    _mainPanel.add(_botPanel,BorderLayout.SOUTH);
                    ///////////////////////^//////////////////latacode
                    _botPanel.add(_spin,BorderLayout.PAGE_END);

                    myFrame();
                }
            });
        }

    }

    public void initializeMyCenterPanelStable(){

        _centerPanel = new JPanel();
        _centerPanel.setLayout(new GridLayout(3,5));

        _slots = new SlotStable[3][5];
        _valueSlots = new int[3][5];

        Random r = new Random();

        for(int i = 0; i < 3; ++i) {
            for (int j = 0; j < 5; ++j) {

                _valueSlots[i][j] = r.nextInt(1, 8);

                switch (_valueSlots[i][j]) {
                    case 1: {
                        _slots[i][j] = new SlotStable(_cireasa);
                        _centerPanel.add(_slots[i][j]);
                        break;
                    }
                    case 2: {
                        _slots[i][j] = new SlotStable(_lamaie);
                        _centerPanel.add(_slots[i][j]);
                        break;
                    }
                    case 3: {
                        _slots[i][j] = new SlotStable(_lebenita);
                        _centerPanel.add(_slots[i][j]);
                        break;
                    }
                    case 4: {
                        _slots[i][j] = new SlotStable(_portocale);
                        _centerPanel.add(_slots[i][j]);
                        break;
                    }
                    case 5: {
                        _slots[i][j] = new SlotStable(_pruna);
                        _centerPanel.add(_slots[i][j]);
                        break;
                    }
                    case 6: {
                        _slots[i][j] = new SlotStable(_struguri);
                        _centerPanel.add(_slots[i][j]);
                        break;
                    }
                    case 7: {
                        _slots[i][j] = new SlotStable(_sapte);
                        _centerPanel.add(_slots[i][j]);
                        break;
                    }
                }
            }

        }

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
        _frame.setSize(800,600);
        _frame.setVisible(true);
    }

    public static void main(String[] args) {

        try{
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    SlotMachine s = new SlotMachine();
                }
            });
        }catch(InterruptedException e){
            System.out.println("... s-a intrerupt executia!");
        }
        catch (InvocationTargetException ex){
            System.out.println("... eroare in metoda run() ");
        }

    }


}
