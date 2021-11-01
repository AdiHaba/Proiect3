package app.gui;

import app.classes.SpinThread;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class SpinEvent implements ActionListener {

    private SlotStable[][] _slots;
    private int[][] _valueSlots;
    private BufferedImage _cireasa , _lamaie , _lebenita , _portocale , _pruna , _struguri, _sapte;
    private SpinThread t1;

    public SpinEvent(SlotStable[][] _slots, int[][] _valueSlots,BufferedImage _cireasa, BufferedImage _lamaie,
                     BufferedImage _lebenita, BufferedImage _portocale, BufferedImage _pruna, BufferedImage _struguri,
                     BufferedImage _sapte){

        this._valueSlots = _valueSlots;
        this._slots = _slots;
        this._cireasa = _cireasa;
        this._lamaie = _lamaie;
        this._lebenita = _lebenita;
        this._portocale = _portocale;
        this._pruna = _pruna;
        this._struguri =_struguri;
        this._sapte = _sapte;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        t1 = new SpinThread(_slots,_valueSlots, _portocale , _struguri , _pruna , _lamaie , _lebenita , _cireasa, _sapte);
        t1.start();

    }
}
