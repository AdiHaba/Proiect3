package app.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Random;

public class SpinEvent implements ActionListener {

    private Integer _nrLinia1Col1, _nrLinia1Col2,_nrLinia1Col3, _nrLinia1Col4, _nrLinia1Col5;
    private Integer _nrLinia2Col1,  _nrLinia2Col2,  _nrLinia2Col3, _nrLinia2Col4, _nrLinia2Col5;
    private Integer _nrLinia3Col1, _nrLinia3Col2, _nrLinia3Col3, _nrLinia3Col4, _nrLinia3Col5;
    private SlotStable _linia1Col1, _linia1Col2, _linia1Col3, _linia1Col4, _linia1Col5;
    private SlotStable _linia2Col1, _linia2Col2, _linia2Col3, _linia2Col4, _linia2Col5;
    private SlotStable _linia3Col1, _linia3Col2, _linia3Col3, _linia3Col4, _linia3Col5;
    private BufferedImage _cireasa , _lamaie , _lebenita , _portocale , _pruna , _struguri, _sapte;

    public SpinEvent(Integer _nrLinia1Col1,Integer _nrLinia1Col2, Integer _nrLinia1Col3, Integer _nrLinia1Col4,
                     Integer _nrLinia1Col5, Integer _nrLinia2Col1,Integer  _nrLinia2Col2,Integer  _nrLinia2Col3,
                     Integer _nrLinia2Col4, Integer  _nrLinia2Col5,Integer  _nrLinia3Col1, Integer _nrLinia3Col2,
                     Integer _nrLinia3Col3, Integer _nrLinia3Col4, Integer _nrLinia3Col5,  SlotStable _linia1Col1,
                     SlotStable _linia1Col2, SlotStable _linia1Col3, SlotStable _linia1Col4, SlotStable _Linia1Col5,
                     SlotStable _linia2Col1, SlotStable _linia2Col2, SlotStable _linia2Col3, SlotStable _linia2Col4,
                     SlotStable _linia2Col5, SlotStable _linia3Col1, SlotStable _linia3Col2, SlotStable _linia3Col3,
                     SlotStable _linia3Col4, SlotStable _linia3Col5,BufferedImage _cireasa, BufferedImage _lamaie,
                     BufferedImage _lebenita, BufferedImage _portocale, BufferedImage _pruna, BufferedImage _struguri,
                     BufferedImage _sapte){

        this._nrLinia1Col1 = _nrLinia1Col1;
        this._nrLinia1Col2 = _nrLinia1Col2;
        this._nrLinia1Col3 = _nrLinia1Col3;
        this._nrLinia1Col4 = _nrLinia1Col4;
        this._nrLinia1Col5 = _nrLinia1Col5;
        this._nrLinia2Col1 = _nrLinia2Col1;
        this._nrLinia2Col2 = _nrLinia2Col2;
        this._nrLinia2Col3 = _nrLinia2Col3;
        this._nrLinia2Col4 = _nrLinia2Col4;
        this._nrLinia2Col5 = _nrLinia2Col5;
        this._nrLinia3Col1 = _nrLinia3Col1;
        this._nrLinia3Col2 = _nrLinia3Col2;
        this._nrLinia3Col3 = _nrLinia3Col3;
        this._nrLinia3Col4 = _nrLinia3Col4;
        this._nrLinia3Col5 = _nrLinia3Col5;
        this._linia1Col1 = _linia1Col1;
        this._linia1Col2 = _linia1Col2;
        this._linia1Col3 = _linia1Col3;
        this._linia1Col4 = _linia1Col4;
        this._linia1Col5 = _Linia1Col5;
        this._linia2Col1 = _linia2Col1;
        this._linia2Col2 = _linia2Col2;
        this._linia2Col3 = _linia2Col3;
        this._linia2Col4 = _linia2Col4;
        this._linia2Col5 = _linia2Col5;
        this._linia3Col1 = _linia3Col1;
        this._linia3Col2 = _linia3Col2;
        this._linia3Col3 = _linia3Col3;
        this._linia3Col4 = _linia3Col4;
        this._linia3Col5 = _linia3Col5;
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

        _nrLinia3Col1  = _nrLinia2Col1;
        _nrLinia3Col2 = _nrLinia2Col2;
        _nrLinia3Col3 = _nrLinia2Col3;
        _nrLinia3Col4 = _nrLinia2Col4;
        _nrLinia3Col5 = _nrLinia2Col5;

        _nrLinia2Col1 = _nrLinia1Col1;
        _nrLinia2Col2 = _nrLinia1Col2;
        _nrLinia2Col3 = _nrLinia1Col3;
        _nrLinia2Col4 = _nrLinia1Col4;
        _nrLinia2Col5 = _nrLinia1Col5;

        _nrLinia1Col1 = r.nextInt(1,8);
        _nrLinia1Col2 = r.nextInt(1,8);
        _nrLinia1Col3 = r.nextInt(1,8);
        _nrLinia1Col4 = r.nextInt(1,8);
        _nrLinia1Col5 = r.nextInt(1,8);

        switch(_nrLinia1Col1){
            case 1:{
                _linia1Col1.setImage(_cireasa);
                _linia1Col1.repaint();
                break;
            }
            case 2:{
                _linia1Col1.setImage(_lamaie);
                _linia1Col1.repaint();
                break;
            }
            case 3:{
                _linia1Col1.setImage(_lebenita);
                _linia1Col1.repaint();
                break;
            }
            case 4:{
                _linia1Col1.setImage(_portocale);
                _linia1Col1.repaint();
                break;
            }
            case 5:{
                _linia1Col1.setImage(_pruna);
                _linia1Col1.repaint();
                break;
            }
            case 6:{
                _linia1Col1.setImage(_struguri);
                _linia1Col1.repaint();
                break;
            }
            case 7:{
                _linia1Col1.setImage(_sapte);
                _linia1Col1.repaint();
                break;
            }


        }

        switch(_nrLinia2Col1) {
            case 1: {
                _linia2Col1.setImage(_cireasa);
                _linia2Col1.repaint();
                break;
            }
            case 2: {
                _linia2Col1.setImage(_lamaie);
                _linia2Col1.repaint();
                break;
            }
            case 3: {
                _linia2Col1.setImage(_lebenita);
                _linia2Col1.repaint();
                break;
            }
            case 4: {
                _linia2Col1.setImage(_portocale);
                _linia2Col1.repaint();
                break;
            }
            case 5: {
                _linia2Col1.setImage(_pruna);
                _linia2Col1.repaint();
                break;
            }
            case 6: {
                _linia2Col1.setImage(_struguri);
                _linia2Col1.repaint();
                break;
            }
            case 7: {
                _linia2Col1.setImage(_sapte);
                _linia2Col1.repaint();
                break;
            }
        }


        switch(_nrLinia3Col1) {
            case 1: {
                _linia3Col1.setImage(_cireasa);
                _linia3Col1.repaint();
                break;
            }
            case 2: {
                _linia3Col1.setImage(_lamaie);
                _linia3Col1.repaint();
                break;
            }
            case 3: {
                _linia3Col1.setImage(_lebenita);
                _linia3Col1.repaint();
                break;
            }
            case 4: {
                _linia3Col1.setImage(_portocale);
                _linia3Col1.repaint();
                break;
            }
            case 5: {
                _linia3Col1.setImage(_pruna);
                _linia3Col1.repaint();
                break;
            }
            case 6: {
                _linia3Col1.setImage(_struguri);
                _linia3Col1.repaint();
                break;
            }
            case 7: {
                _linia3Col1.setImage(_sapte);
                _linia3Col1.repaint();
                break;
            }
        }

        switch(_nrLinia1Col2){
            case 1:{
                _linia1Col2.setImage(_cireasa);
                _linia1Col2.repaint();
                break;
            }
            case 2:{
                _linia1Col2.setImage(_lamaie);
                _linia1Col2.repaint();
                break;
            }
            case 3:{
                _linia1Col2.setImage(_lebenita);
                _linia1Col2.repaint();
                break;
            }
            case 4:{
                _linia1Col2.setImage(_portocale);
                _linia1Col2.repaint();
                break;
            }
            case 5:{
                _linia1Col2.setImage(_pruna);
                _linia1Col2.repaint();
                break;
            }
            case 6:{
                _linia1Col2.setImage(_struguri);
                _linia1Col2.repaint();
                break;
            }
            case 7:{
                _linia1Col2.setImage(_sapte);
                _linia1Col2.repaint();
                break;
            }


        }

        switch(_nrLinia2Col2) {
            case 1: {
                _linia2Col2.setImage(_cireasa);
                _linia2Col2.repaint();
                break;
            }
            case 2: {
                _linia2Col2.setImage(_lamaie);
                _linia2Col2.repaint();
                break;
            }
            case 3: {
                _linia2Col2.setImage(_lebenita);
                _linia2Col2.repaint();
                break;
            }
            case 4: {
                _linia2Col2.setImage(_portocale);
                _linia2Col2.repaint();
                break;
            }
            case 5: {
                _linia2Col2.setImage(_pruna);
                _linia2Col2.repaint();
                break;
            }
            case 6: {
                _linia2Col2.setImage(_struguri);
                _linia2Col2.repaint();
                break;
            }
            case 7: {
                _linia2Col2.setImage(_sapte);
                _linia2Col2.repaint();
                break;
            }

        }

            switch (_nrLinia3Col2) {
                case 1: {
                    _linia3Col2.setImage(_cireasa);
                    _linia3Col2.repaint();
                    break;
                }
                case 2: {
                    _linia3Col2.setImage(_lamaie);
                    _linia3Col2.repaint();
                    break;
                }
                case 3: {
                    _linia3Col2.setImage(_lebenita);
                    _linia3Col2.repaint();
                    break;
                }
                case 4: {
                    _linia3Col2.setImage(_portocale);
                    _linia3Col2.repaint();
                    break;
                }
                case 5: {
                    _linia3Col2.setImage(_pruna);
                    _linia3Col2.repaint();
                    break;
                }
                case 6: {
                    _linia3Col2.setImage(_struguri);
                    _linia3Col2.repaint();
                    break;
                }
                case 7: {
                    _linia3Col2.setImage(_sapte);
                    _linia3Col2.repaint();
                    break;
                }

            }

        switch (_nrLinia1Col3) {
            case 1: {
                _linia1Col3.setImage(_cireasa);
                _linia1Col3.repaint();
                break;
            }
            case 2: {
                _linia1Col3.setImage(_lamaie);
                _linia1Col3.repaint();
                break;
            }
            case 3: {
                _linia1Col3.setImage(_lebenita);
                _linia1Col3.repaint();
                break;
            }
            case 4: {
                _linia1Col3.setImage(_portocale);
                _linia1Col3.repaint();
                break;
            }
            case 5: {
                _linia1Col3.setImage(_pruna);
                _linia1Col3.repaint();
                break;
            }
            case 6: {
                _linia1Col3.setImage(_struguri);
                _linia1Col3.repaint();
                break;
            }
            case 7: {
                _linia1Col3.setImage(_sapte);
                _linia1Col3.repaint();
                break;
            }

        }

        switch (_nrLinia2Col3) {
            case 1: {
                _linia2Col3.setImage(_cireasa);
                _linia2Col3.repaint();
                break;
            }
            case 2: {
                _linia2Col3.setImage(_lamaie);
                _linia2Col3.repaint();
                break;
            }
            case 3: {
                _linia2Col3.setImage(_lebenita);
                _linia2Col3.repaint();
                break;
            }
            case 4: {
                _linia2Col3.setImage(_portocale);
                _linia2Col3.repaint();
                break;
            }
            case 5: {
                _linia2Col3.setImage(_pruna);
                _linia2Col3.repaint();
                break;
            }
            case 6: {
                _linia2Col3.setImage(_struguri);
                _linia2Col3.repaint();
                break;
            }
            case 7: {
                _linia2Col3.setImage(_sapte);
                _linia2Col3.repaint();
                break;
            }

        }

        switch (_nrLinia3Col3) {
            case 1: {
                _linia3Col3.setImage(_cireasa);
                _linia3Col3.repaint();
                break;
            }
            case 2: {
                _linia3Col3.setImage(_lamaie);
                _linia3Col3.repaint();
                break;
            }
            case 3: {
                _linia3Col3.setImage(_lebenita);
                _linia3Col3.repaint();
                break;
            }
            case 4: {
                _linia3Col3.setImage(_portocale);
                _linia3Col3.repaint();
                break;
            }
            case 5: {
                _linia3Col3.setImage(_pruna);
                _linia3Col3.repaint();
                break;
            }
            case 6: {
                _linia3Col3.setImage(_struguri);
                _linia3Col3.repaint();
                break;
            }
            case 7: {
                _linia3Col3.setImage(_sapte);
                _linia3Col3.repaint();
                break;
            }

        }

        switch (_nrLinia1Col4) {
            case 1: {
                _linia1Col4.setImage(_cireasa);
                _linia1Col4.repaint();
                break;
            }
            case 2: {
                _linia1Col4.setImage(_lamaie);
                _linia1Col4.repaint();
                break;
            }
            case 3: {
                _linia1Col4.setImage(_lebenita);
                _linia1Col4.repaint();
                break;
            }
            case 4: {
                _linia1Col4.setImage(_portocale);
                _linia1Col4.repaint();
                break;
            }
            case 5: {
                _linia1Col4.setImage(_pruna);
                _linia1Col4.repaint();
                break;
            }
            case 6: {
                _linia1Col4.setImage(_struguri);
                _linia1Col4.repaint();
                break;
            }
            case 7: {
                _linia1Col4.setImage(_sapte);
                _linia1Col4.repaint();
                break;
            }

        }

        switch (_nrLinia2Col4) {
            case 1: {
                _linia2Col4.setImage(_cireasa);
                _linia2Col4.repaint();
                break;
            }
            case 2: {
                _linia2Col4.setImage(_lamaie);
                _linia2Col4.repaint();
                break;
            }
            case 3: {
                _linia2Col4.setImage(_lebenita);
                _linia2Col4.repaint();
                break;
            }
            case 4: {
                _linia2Col4.setImage(_portocale);
                _linia2Col4.repaint();
                break;
            }
            case 5: {
                _linia2Col4.setImage(_pruna);
                _linia2Col4.repaint();
                break;
            }
            case 6: {
                _linia2Col4.setImage(_struguri);
                _linia2Col4.repaint();
                break;
            }
            case 7: {
                _linia2Col4.setImage(_sapte);
                _linia2Col4.repaint();
                break;
            }

        }

        switch (_nrLinia3Col4) {
            case 1: {
                _linia3Col4.setImage(_cireasa);
                _linia3Col4.repaint();
                break;
            }
            case 2: {
                _linia3Col4.setImage(_lamaie);
                _linia3Col4.repaint();
                break;
            }
            case 3: {
                _linia3Col4.setImage(_lebenita);
                _linia3Col4.repaint();
                break;
            }
            case 4: {
                _linia3Col4.setImage(_portocale);
                _linia3Col4.repaint();
                break;
            }
            case 5: {
                _linia3Col4.setImage(_pruna);
                _linia3Col4.repaint();
                break;
            }
            case 6: {
                _linia3Col4.setImage(_struguri);
                _linia3Col4.repaint();
                break;
            }
            case 7: {
                _linia3Col4.setImage(_sapte);
                _linia3Col4.repaint();
                break;
            }

        }

        switch (_nrLinia1Col5) {
            case 1: {
                _linia1Col5.setImage(_cireasa);
                _linia1Col5.repaint();
                break;
            }
            case 2: {
                _linia1Col5.setImage(_lamaie);
                _linia1Col5.repaint();
                break;
            }
            case 3: {
                _linia1Col5.setImage(_lebenita);
                _linia1Col5.repaint();
                break;
            }
            case 4: {
                _linia1Col5.setImage(_portocale);
                _linia1Col5.repaint();
                break;
            }
            case 5: {
                _linia1Col5.setImage(_pruna);
                _linia1Col5.repaint();
                break;
            }
            case 6: {
                _linia1Col5.setImage(_struguri);
                _linia1Col5.repaint();
                break;
            }
            case 7: {
                _linia1Col5.setImage(_sapte);
                _linia1Col5.repaint();
                break;
            }

        }

        switch (_nrLinia2Col5) {
            case 1: {
                _linia2Col5.setImage(_cireasa);
                _linia2Col5.repaint();
                break;
            }
            case 2: {
                _linia2Col5.setImage(_lamaie);
                _linia2Col5.repaint();
                break;
            }
            case 3: {
                _linia2Col5.setImage(_lebenita);
                _linia2Col5.repaint();
                break;
            }
            case 4: {
                _linia2Col5.setImage(_portocale);
                _linia2Col5.repaint();
                break;
            }
            case 5: {
                _linia2Col5.setImage(_pruna);
                _linia2Col5.repaint();
                break;
            }
            case 6: {
                _linia2Col5.setImage(_struguri);
                _linia2Col5.repaint();
                break;
            }
            case 7: {
                _linia2Col5.setImage(_sapte);
                _linia2Col5.repaint();
                break;
            }

        }

        switch (_nrLinia3Col5) {
            case 1: {
                _linia3Col5.setImage(_cireasa);
                _linia3Col5.repaint();
                break;
            }
            case 2: {
                _linia3Col5.setImage(_lamaie);
                _linia3Col5.repaint();
                break;
            }
            case 3: {
                _linia3Col5.setImage(_lebenita);
                _linia3Col5.repaint();
                break;
            }
            case 4: {
                _linia3Col5.setImage(_portocale);
                _linia3Col5.repaint();
                break;
            }
            case 5: {
                _linia3Col5.setImage(_pruna);
                _linia3Col5.repaint();
                break;
            }
            case 6: {
                _linia3Col5.setImage(_struguri);
                _linia3Col5.repaint();
                break;
            }
            case 7: {
                _linia3Col5.setImage(_sapte);
                _linia3Col5.repaint();
                break;
            }

        }

        }
    }
