package Academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int scelta =3;
        int n,n1,n2;
        int c=0;
        double m=0;

        while(scelta!=0) {
            Scanner kb = new Scanner(System.in);
            System.out.println("SCEGLI UN OPERAZIONE");
            System.out.println("0 = ESCI");
            System.out.println("1 = SOMMA");
            System.out.println("2 = MEDIA DI N NUMERI");
            scelta = kb.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("inserisci il primo numero");
                    n1 = kb.nextInt();
                    System.out.println("inserisci il secondo numero");
                    n2 = kb.nextInt();
                    System.out.println("SOMMA: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("inserisci il numero degli operandi");
                    n = kb.nextInt();
                    do{
                        System.out.println("inserisci il numero");
                        n1 = kb.nextInt();
                        m = m + n1;
                        c++;
                    }while(c<n);
                    System.out.println("MEDIA: " + (m / n));
                    m = 0;
                    c = 0;
                    break;
                default:
                    System.out.println("hai inserito un operazione non esistente");
            }

        }
    }
}