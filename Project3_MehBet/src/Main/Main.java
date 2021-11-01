
package Main;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int ok=1;
        int[] linie = new int[5];
        Random rand = new Random();

        for(int i=0;i<5;i++){
            linie[i] = rand.nextInt(1,8);
            System.out.print(linie[i] + " ");
            if(i>0 && linie[i]!=linie[i-1])
                ok=0;
        }
        if(ok==1){
            System.out.println("Ai castigat");
        }
        else System.out.println("nu ai castigat");
    }
}
