package app.pariuri;
import java.util.Random;
public class Cursa {
    double[] odds = new double[6];
    Random rand = new Random();
    double max=0;
    int x;
    public Cursa(){
        for(int i=0;i<6;i++){
            odds[i]=rand.nextDouble(0,2);
            if(odds[i]>max) {
                x=i;
                max = odds[i];
            }
        }
        for(int i=0;i<6;i++){
            System.out.print(odds[i] + " ");
        }
        
    }

    public int getX() {
        return x;
    }

    public double getMax() {
        return max;
    }
}
