package NTTDATA.It.Programmaforeach;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n;
        int nA[] = new int[10];
        for(int i = 0; i < nA.length; i++){
            System.out.println("Inserisci il "+(i+1)+" numero");
            n = kb.nextInt();
            nA[i] = n;
        }

        Arrays.sort(nA);

        for(int a : nA){
            System.out.println(a);
        }
    }
}