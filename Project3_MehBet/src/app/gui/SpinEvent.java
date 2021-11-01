package app.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Random;

///////////////////v//////////////////latacode
class castig{
    public int[] semn= new int[5];
    public double win=0;

    public double getWin() {
        return win;
    }

    public castig(int[] semn, int sum){

        int numar=0;
        if(semn[0]==semn[1] && semn[1] == semn[2])
            numar=3;
        if(semn[0]==semn[1] && semn[1] == semn[2] && semn[2] == semn[3])
            numar=4;
        if(semn[0]==semn[1] && semn[1] == semn[2] && semn[2] == semn[3] && semn[3] == semn[4])
            numar=5;


        for(int j=0;j<5;j++){
            if(semn[0]==1){
                if(numar==3){
                    win=0.25*sum;
                }
                else if(numar==4){
                    win=0.5*sum;
                }
                else if(numar==5){
                    win=sum;
                }
                else win=0;
            }
            else if(semn[0]==2){
                if(numar==3){
                    win=0.5*sum;
                }
                else if(numar==4){
                    win=sum;
                }
                else if(numar==5){
                    win=1.5*sum;
                }
                else win=0;
            }
            else if(semn[0]==3){
                if(numar==3){
                    win=sum;
                }
                else if(numar==4){
                    win=2*sum;
                }
                else if(numar==5){
                    win=3*sum;
                }
                else win=0;
            }
            else if(semn[0]==4){
                if(numar==3){
                    win=2*sum;
                }
                else if(numar==4){
                    win=6*sum;
                }
                else if(numar==5){
                    win=9*sum;
                }
                else win=0;
            }
            else if(semn[0]==5){
                if(numar==3){
                    win=3*sum;
                }
                else if(numar==4){
                    win=9*sum;
                }
                else if(numar==5){
                    win=15*sum;
                }
                else win=0;
            }
            else if(semn[0]==6){
                if(numar==3){
                    win=5*sum;
                }
                else if(numar==4){
                    win=10*sum;
                }
                else if(numar==5){
                    win=25*sum;
                }
                else win=0;
            }
            else if(semn[0]==7){
                if(numar==3){
                    win=25*sum;
                }
                else if(numar==4){
                    win=50*sum;
                }
                else if(numar==5){
                    win=100*sum;
                }
                else win=0;
            }

        }
    }
///////////////////^//////////////////latacode

}
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

        for (int j = 0; j < 5; ++j) {
            for (int i = 2; i >= 1; --i) {
                _valueSlots[i][j] = _valueSlots[i - 1][j];
            }
        }

        for (int j = 0; j < 5; ++j) {
            _valueSlots[0][j] = r.nextInt(1, 8);
        }

        ///////////////////v//////////////////latacode

        int[][] linie = new int[5][5];
        for(int j = 0;j<5;j++) {
            for (int i = 0; i < 5; i++) {
                if(j==0)
                    linie[j][i] = _valueSlots[0][i];
                if(j==1)
                    linie[j][i] = _valueSlots[1][i];
                if(j==2)
                    linie[j][i] = _valueSlots[2][i];
                if(j==3){
                    linie[j][0]= _valueSlots[2][0];
                    linie[j][1]= _valueSlots[1][1];
                    linie[j][2] = _valueSlots[0][2];
                    linie[j][3] = _valueSlots[1][3];
                    linie[j][4] = _valueSlots[2][4];
                }
                if(j==4){
                    linie[j][0]= _valueSlots[0][0];
                    linie[j][1]= _valueSlots[1][1];
                    linie[j][2] = _valueSlots[2][2];
                    linie[j][3] = _valueSlots[1][3];
                    linie[j][4] = _valueSlots[0][4];
                }
                System.out.print(linie[j][i] + " ");

            }
            System.out.println();
        }
        double sum=0;
        castig c;

        c= new castig(linie[0],10);
        sum=sum+ c.getWin();
        System.out.println("Ai castigat " + c.getWin() + " de pe linia 1");
        c=new castig(linie[1],10);
        sum = sum + c.getWin();
        System.out.println("Ai castigat " + c.getWin() + " de pe linia 2");
        c=new castig(linie[2],10);
        sum = sum + c.getWin();
        System.out.println("Ai castigat " + c.getWin() + " de pe linia 3");
        c=new castig(linie[3],10);
        sum = sum + c.getWin();
        System.out.println("Ai castigat " + c.getWin() + " de pe linia 4");
        c=new castig(linie[4],10);
        sum = sum + c.getWin();
        System.out.println("Ai castigat " + c.getWin() + " de pe linia 5");

        System.out.println("Ai castigat " + sum);


        ///////////////////^///////////////////latacode

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 5; ++j) {
                switch (_valueSlots[i][j]) {
                    case 1: {
                        _slots[i][j].setImage(_cireasa);
                        _slots[i][j].repaint();
                        break;
                    }
                    case 2: {
                        _slots[i][j].setImage(_lamaie);
                        _slots[i][j].repaint();
                        break;
                    }
                    case 3: {
                        _slots[i][j].setImage(_lebenita);
                        _slots[i][j].repaint();
                        break;
                    }
                    case 4: {
                        _slots[i][j].setImage(_portocale);
                        _slots[i][j].repaint();
                        break;
                    }
                    case 5: {
                        _slots[i][j].setImage(_pruna);
                        _slots[i][j].repaint();
                        break;
                    }
                    case 6: {
                        _slots[i][j].setImage(_struguri);
                        _slots[i][j].repaint();
                        break;
                    }
                    case 7: {
                        _slots[i][j].setImage(_sapte);
                        _slots[i][j].repaint();
                        break;
                    }


                }
            }
        }




    }
}
