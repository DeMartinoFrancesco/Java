package NTTDATA.it.programmaricorsione;

public class Main {
    public static void main(String[] args) {
        double n1=10,n2=15;

        System.out.println(aDouble(n1)+"/"+aDouble(n2));
    }

    private static double aDouble (double n){
        if (n%2 == 0){
            return 1+(n/2);
        }else{
            return 0;
        }
    }
}