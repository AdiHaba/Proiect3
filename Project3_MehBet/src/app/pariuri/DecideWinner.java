package app.pariuri;
import app.Interfaces.IDecide;

import java.util.Random;
public class DecideWinner implements IDecide {
    String winner;
    int winnerCurse;
    Random rand = new Random();
    int r;
    public DecideWinner(String a, String b){
        r=rand.nextInt(1,3);
        if(r == 1)
            this.winner=a;
        else this.winner = b;
    }

    public String getWinner() {
        return winner;
    }


}
