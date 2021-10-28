package app.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Random;

public class SpinEvent implements ActionListener {

    private SlotStable[][] _slots;
    private int[][] _valueSlots;
    private BufferedImage _cireasa , _lamaie , _lebenita , _portocale , _pruna , _struguri, _sapte;

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
        Random r = new Random();

        for(int j = 0; j < 5; ++j){
            for(int i = 2; i >=1; --i ){
                _valueSlots[i][j] = _valueSlots[i-1][j];
            }
        }

        for(int j = 0; j < 5; ++j){
            _valueSlots[0][j] = r.nextInt(1,8);
        }


        for(int i = 0 ; i < 3; ++i){
            for(int j = 0 ; j < 5; ++j){
                switch(_valueSlots[i][j]){
                    case 1:{
                        _slots[i][j].setImage(_cireasa);
                        _slots[i][j].repaint();
                        break;
                    }
                    case 2:{
                        _slots[i][j].setImage(_lamaie);
                        _slots[i][j].repaint();
                        break;
                    }
                    case 3:{
                        _slots[i][j].setImage(_lebenita);
                        _slots[i][j].repaint();
                        break;
                    }
                    case 4:{
                        _slots[i][j].setImage(_portocale);
                        _slots[i][j].repaint();
                        break;
                    }
                    case 5:{
                        _slots[i][j].setImage(_pruna);
                        _slots[i][j].repaint();
                        break;
                    }
                    case 6:{
                        _slots[i][j].setImage(_struguri);
                        _slots[i][j].repaint();
                        break;
                    }
                    case 7:{
                        _slots[i][j].setImage(_sapte);
                        _slots[i][j].repaint();
                        break;
                    }


                }
            }
        }


        }
    }
