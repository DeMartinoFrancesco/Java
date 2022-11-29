package NTT_DATA_ProgrammaBubbleSort;

        import java.util.Arrays;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n,i,c;
        int nA[] = new int[10];
        for(i=0; i < nA.length; i++){
            System.out.println("Inserisci il "+(i+1)+" numero");
            n = kb.nextInt();
            nA[i] = n;
        }

        bubbleSort(nA);

        for(int n2 : nA){
            System.out.println(n2);
        }
    }

    public static void bubbleSort(int [] a) {
        for(int i = 0; i < a.length; i++) {
            boolean b = false;
            for(int j = 0; j < a.length-1; j++) {

                if(a[j]>a[j+1]) {
                    int k = a[j];
                    a[j] = a[j+1];
                    a[j+1] = k;
                    b=true;
                }
            }
            if(!b) break;
        }
    }
}