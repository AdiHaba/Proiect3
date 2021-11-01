package app.pariuri;
import app.Interfaces.IMeci;

import java.util.Random;
public class Meci implements IMeci {

    String e1,e2;
    Random rand = new Random();
    public Meci(String[] e){

        this.e1 = e[rand.nextInt(0,10)];
        this.e2 = e[rand.nextInt(0,10)];
        while(e2==e1){
            this.e2 = e[rand.nextInt(0,10)];
        }
    }

    public String getE1() {
        return e1;
    }
    public String getE2(){
        return e2;
    }
}
