package Academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int giorno;


        do {

            System.out.println("inserisci in numero da 1 a 7 il giorno da visualizzare");
            giorno = kb.nextInt();
            switch (giorno) {
                case 1:
                    System.out.println(GIORNI.LUNEDI);
                    break;
                case 2:
                    System.out.println(GIORNI.MARTEDI);
                    break;
                case 3:
                    System.out.println(GIORNI.MERCOLEDI);
                    break;
                case 4:
                    System.out.println(GIORNI.GIOVEDI);
                    break;
                case 5:
                    System.out.println(GIORNI.VENERDI);
                    break;
                case 6:
                    System.out.println(GIORNI.SABATO);
                    break;
                case 7:
                    System.out.println(GIORNI.DOMENICA);
                    break;
                default:
                    System.out.println("Input errato");
            }
        }while(giorno>=1&giorno<=7);
    }
}