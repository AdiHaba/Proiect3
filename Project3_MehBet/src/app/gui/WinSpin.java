package app.gui;

public class WinSpin {
    
    public int[] _semn;
    public double _win = 0;

    public WinSpin(int[] _semn, int sum){

        _semn= new int[5];
        
        int numar=0;
        if(_semn[0]==_semn[1] && _semn[1] == _semn[2])
            numar=3;
        if(_semn[0]==_semn[1] && _semn[1] == _semn[2] && _semn[2] == _semn[3])
            numar=4;
        if(_semn[0]==_semn[1] && _semn[1] == _semn[2] && _semn[2] == _semn[3] && _semn[3] == _semn[4])
            numar=5;


        for(int j=0;j<5;j++){
            if(_semn[0]==1){
                if(numar==3){
                    _win=0.25*sum;
                }
                else if(numar==4){
                    _win=0.5*sum;
                }
                else if(numar==5){
                    _win=sum;
                }
                else _win=0;
            }
            else if(_semn[0]==2){
                if(numar==3){
                    _win=0.5*sum;
                }
                else if(numar==4){
                    _win=sum;
                }
                else if(numar==5){
                    _win=1.5*sum;
                }
                else _win=0;
            }
            else if(_semn[0]==3){
                if(numar==3){
                    _win=sum;
                }
                else if(numar==4){
                    _win=2*sum;
                }
                else if(numar==5){
                    _win=3*sum;
                }
                else _win=0;
            }
            else if(_semn[0]==4){
                if(numar==3){
                    _win=2*sum;
                }
                else if(numar==4){
                    _win=6*sum;
                }
                else if(numar==5){
                    _win=9*sum;
                }
                else _win=0;
            }
            else if(_semn[0]==5){
                if(numar==3){
                    _win=3*sum;
                }
                else if(numar==4){
                    _win=9*sum;
                }
                else if(numar==5){
                    _win=15*sum;
                }
                else _win=0;
            }
            else if(_semn[0]==6){
                if(numar==3){
                    _win=5*sum;
                }
                else if(numar==4){
                    _win=10*sum;
                }
                else if(numar==5){
                    _win=25*sum;
                }
                else _win=0;
            }
            else if(_semn[0]==7){
                if(numar==3){
                    _win=25*sum;
                }
                else if(numar==4){
                    _win=50*sum;
                }
                else if(numar==5){
                    _win=100*sum;
                }
                else _win=0;
            }

        }
    }

    public double getWin() {
        return _win;
    }

}