package app.pariuri;

import java.util.Random;
import java.util.Scanner;

public class Pariuri {
    public static void main(String[] args) {
        int op=0;
        int stop=0;
        int meci;
        int opEchipa;
        String[] Echipef = new String[10];
        String echipa;

        Echipef[0] = "FCB";
        Echipef[1] = "Steaua";
        Echipef[2] = "CFR";
        Echipef[3] = "Rapid";
        Echipef[4] = "Otelu galati";
        Echipef[5] = "Vulturul Fundatura";
        Echipef[6] = "Viitorul Gherla";
        Echipef[7] = "Romania";
        Echipef[8] = "Bayern";
        Echipef[9] = "Uventus";

        String[] Echipeb = new String[10];


        Echipeb[0] = "Lakers";
        Echipeb[1] = "Bulls";
        Echipeb[2] = "Pistons";
        Echipeb[3] = "Knicks";
        Echipeb[4] = "Jazz";
        Echipeb[5] = "Heat";
        Echipeb[6] = "Hornets";
        Echipeb[7] = "Wizards";
        Echipeb[8] = "Rockets";
        Echipeb[9] = "Blazers";

        String[] JucatoriT = new String[10];


        JucatoriT[0] = "Novak Djokovic";
        JucatoriT[1] = "Roger Federer";
        JucatoriT[2] = "Rafael Nadal";
        JucatoriT[3] = "Daniil Medvedev";
        JucatoriT[4] = "Stefanos Tsitsipas";
        JucatoriT[5] = "Matteo Berrettini";
        JucatoriT[6] = "Andrey Rublev";
        JucatoriT[7] = "Alexander Zverev";
        JucatoriT[8] = "Casper Ruud";
        JucatoriT[9] = "Jannik Sinner";

        DecideWinner win;

        int cursa =0;
        Cursa c;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        Meci[] a= new Meci[5];
        while(stop==0){
            System.out.println("1.Pariuri fotbal");
            System.out.println("2.Pariuri basket");
            System.out.println("3.Pariuri tenis");
            System.out.println("4.Pariuri cai");
            System.out.println("0.Stop");

            op=scan.nextInt();
            switch(op){
                case 0:
                    stop=1;
                    break;
                case 1:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Meciuri disponibile:\n");
                    for(int i = 0;i < 5; i++){
                        a[i] = new Meci(Echipef);

                        System.out.println(i+1 + ". " + a[i].getE1() + " versus " + a[i].getE2());
                    }
                    System.out.println("0. Nici un meci\n\n");
                    System.out.println("Alegeti meciul pe care doriti sa pariati");
                    meci = scan.nextInt();
                    switch (meci){
                        case 1:
                            System.out.println("Introduceti echipa pe care doriti sa pariati: ");
                            System.out.println("1. " + a[0].e1);
                            System.out.println("2. " + a[0].e2);
                            opEchipa = scan.nextInt();
                            win = new DecideWinner(a[0].e1,a[0].e2);
                            if(win.getWinner().equals(a[0].e1) && opEchipa == 1){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else if(win.getWinner().equals(a[0].e2) && opEchipa == 2){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else System.out.println("Nu ai castigat");

                            System.out.println(win.getWinner());

                            break;
                        case 2:
                            System.out.println("Introduceti echipa pe care doriti sa pariati: ");
                            System.out.println("1. " + a[1].e1);
                            System.out.println("2. " + a[1].e2);
                            opEchipa = scan.nextInt();
                            win = new DecideWinner(a[1].e1,a[1].e2);
                            if(win.getWinner().equals(a[1].e1) && opEchipa == 1){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else if(win.getWinner().equals(a[1].e2) && opEchipa == 2){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else System.out.println("Nu ai castigat");

                            System.out.println(win.getWinner());

                            break;
                        case 3:
                            System.out.println("Introduceti echipa pe care doriti sa pariati: ");
                            System.out.println("1. " + a[2].e1);
                            System.out.println("2. " + a[2].e2);
                            opEchipa = scan.nextInt();
                            win = new DecideWinner(a[2].e1,a[2].e2);
                            if(win.getWinner().equals(a[2].e1) && opEchipa == 1){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else if(win.getWinner().equals(a[2].e2) && opEchipa == 2){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else System.out.println("Nu ai castigat");

                            System.out.println(win.getWinner());

                            break;
                        case 4:
                            System.out.println("Introduceti echipa pe care doriti sa pariati: ");
                            System.out.println("1. " + a[3].e1);
                            System.out.println("2. " + a[3].e2);
                            opEchipa = scan.nextInt();
                            win = new DecideWinner(a[3].e1,a[3].e2);
                            if(win.getWinner().equals(a[3].e1) && opEchipa == 1){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else if(win.getWinner().equals(a[3].e2) && opEchipa == 2){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else System.out.println("Nu ai castigat");

                            System.out.println(win.getWinner());

                            break;
                        case 5:
                            System.out.println("Introduceti echipa pe care doriti sa pariati: ");
                            System.out.println("1. " + a[4].e1);
                            System.out.println("2. " + a[4].e2);
                            opEchipa = scan.nextInt();
                            win = new DecideWinner(a[4].e1,a[4].e2);
                            if(win.getWinner().equals(a[4].e1) && opEchipa == 1){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else if(win.getWinner().equals(a[4].e2) && opEchipa == 2){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else System.out.println("Nu ai castigat");

                            System.out.println(win.getWinner());

                            break;
                        case 0: break;
                    }
                    break;
                case 2:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Meciuri disponibile:\n");
                    for(int i = 0;i < 5; i++){
                        a[i] = new Meci(Echipeb);

                        System.out.println(i+1 + ". " + a[i].getE1() + " versus " + a[i].getE2());
                    }
                    System.out.println("0. Nici un meci\n\n");
                    System.out.println("Alegeti meciul pe care doriti sa pariati");
                    meci = scan.nextInt();
                    switch (meci){
                        case 1:
                            System.out.println("Introduceti echipa pe care doriti sa pariati: ");
                            System.out.println("1. " + a[0].e1);
                            System.out.println("2. " + a[0].e2);
                            opEchipa = scan.nextInt();
                            win = new DecideWinner(a[0].e1,a[0].e2);
                            if(win.getWinner().equals(a[0].e1) && opEchipa == 1){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else if(win.getWinner().equals(a[0].e2) && opEchipa == 2){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else System.out.println("Nu ai castigat");

                            System.out.println(win.getWinner());

                            break;
                        case 2:
                            System.out.println("Introduceti echipa pe care doriti sa pariati: ");
                            System.out.println("1. " + a[1].e1);
                            System.out.println("2. " + a[1].e2);
                            opEchipa = scan.nextInt();
                            win = new DecideWinner(a[1].e1,a[1].e2);
                            if(win.getWinner().equals(a[1].e1) && opEchipa == 1){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else if(win.getWinner().equals(a[1].e2) && opEchipa == 2){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else System.out.println("Nu ai castigat");

                            System.out.println(win.getWinner());

                            break;
                        case 3:
                            System.out.println("Introduceti echipa pe care doriti sa pariati: ");
                            System.out.println("1. " + a[2].e1);
                            System.out.println("2. " + a[2].e2);
                            opEchipa = scan.nextInt();
                            win = new DecideWinner(a[2].e1,a[2].e2);
                            if(win.getWinner().equals(a[2].e1) && opEchipa == 1){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else if(win.getWinner().equals(a[2].e2) && opEchipa == 2){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else System.out.println("Nu ai castigat");

                            System.out.println(win.getWinner());

                            break;
                        case 4:
                            System.out.println("Introduceti echipa pe care doriti sa pariati: ");
                            System.out.println("1. " + a[3].e1);
                            System.out.println("2. " + a[3].e2);
                            opEchipa = scan.nextInt();
                            win = new DecideWinner(a[3].e1,a[3].e2);
                            if(win.getWinner().equals(a[3].e1) && opEchipa == 1){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else if(win.getWinner().equals(a[3].e2) && opEchipa == 2){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else System.out.println("Nu ai castigat");

                            System.out.println(win.getWinner());

                            break;
                        case 5:
                            System.out.println("Introduceti echipa pe care doriti sa pariati: ");
                            System.out.println("1. " + a[4].e1);
                            System.out.println("2. " + a[4].e2);
                            opEchipa = scan.nextInt();
                            win = new DecideWinner(a[4].e1,a[4].e2);
                            if(win.getWinner().equals(a[4].e1) && opEchipa == 1){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else if(win.getWinner().equals(a[4].e2) && opEchipa == 2){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else System.out.println("Nu ai castigat");

                            System.out.println(win.getWinner());

                            break;
                        case 0: break;
                    }
                    break;
                case 3:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Meciuri disponibile:\n");
                    for(int i = 0;i < 5; i++){
                        a[i] = new Meci(JucatoriT);

                        System.out.println(i+1 + ". " + a[i].getE1() + " versus " + a[i].getE2());
                    }
                    System.out.println("0. Nici un meci\n\n");
                    System.out.println("Alegeti meciul pe care doriti sa pariati");
                    meci = scan.nextInt();
                    switch (meci){
                        case 1:
                            System.out.println("Introduceti echipa pe care doriti sa pariati: ");
                            System.out.println("1. " + a[0].e1);
                            System.out.println("2. " + a[0].e2);
                            opEchipa = scan.nextInt();
                            win = new DecideWinner(a[0].e1,a[0].e2);
                            if(win.getWinner().equals(a[0].e1) && opEchipa == 1){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else if(win.getWinner().equals(a[0].e2) && opEchipa == 2){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else System.out.println("Nu ai castigat");

                            System.out.println(win.getWinner());

                            break;
                        case 2:
                            System.out.println("Introduceti echipa pe care doriti sa pariati: ");
                            System.out.println("1. " + a[1].e1);
                            System.out.println("2. " + a[1].e2);
                            opEchipa = scan.nextInt();
                            win = new DecideWinner(a[1].e1,a[1].e2);
                            if(win.getWinner().equals(a[1].e1) && opEchipa == 1){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else if(win.getWinner().equals(a[1].e2) && opEchipa == 2){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else System.out.println("Nu ai castigat");

                            System.out.println(win.getWinner());

                            break;
                        case 3:
                            System.out.println("Introduceti echipa pe care doriti sa pariati: ");
                            System.out.println("1. " + a[2].e1);
                            System.out.println("2. " + a[2].e2);
                            opEchipa = scan.nextInt();
                            win = new DecideWinner(a[2].e1,a[2].e2);
                            if(win.getWinner().equals(a[2].e1) && opEchipa == 1){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else if(win.getWinner().equals(a[2].e2) && opEchipa == 2){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else System.out.println("Nu ai castigat");

                            System.out.println(win.getWinner());

                            break;
                        case 4:
                            System.out.println("Introduceti echipa pe care doriti sa pariati: ");
                            System.out.println("1. " + a[3].e1);
                            System.out.println("2. " + a[3].e2);
                            opEchipa = scan.nextInt();
                            win = new DecideWinner(a[3].e1,a[3].e2);
                            if(win.getWinner().equals(a[3].e1) && opEchipa == 1){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else if(win.getWinner().equals(a[3].e2) && opEchipa == 2){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else System.out.println("Nu ai castigat");

                            System.out.println(win.getWinner());

                            break;
                        case 5:
                            System.out.println("Introduceti echipa pe care doriti sa pariati: ");
                            System.out.println("1. " + a[4].e1);
                            System.out.println("2. " + a[4].e2);
                            opEchipa = scan.nextInt();
                            win = new DecideWinner(a[4].e1,a[4].e2);
                            if(win.getWinner().equals(a[4].e1) && opEchipa == 1){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else if(win.getWinner().equals(a[4].e2) && opEchipa == 2){
                                System.out.println("Ai castigat cu pariul pe " + win.getWinner());
                            }
                            else System.out.println("Nu ai castigat");

                            System.out.println(win.getWinner());

                            break;
                        case 0: break;
                    }
                    break;
                case 4:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    cursa = rand.nextInt(0,10);
                    if(cursa<5){
                        System.out.println("Nu sunt curse disponibile momentan");
                    }
                    else {
                        System.out.println("Pe care cal doriti sa pariati?(1-6)");
                        meci=scan.nextInt();
                        c=new Cursa();
                        if(meci-1==c.getX()){
                            System.out.println("Ai castigat");
                        }
                        else System.out.println("Nu ai castigat");

                    }
                    break;
            }
        }
    }
}