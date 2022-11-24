package NTTDATA.it.programmaricorsione;

public class Main {
    public static void main(String[] args) {
        double n1=12,n2=15;
        System.out.println(aDouble(n1)+"/"+aDouble(n2));
    }

    private static double aDouble (double n){

        if (n%2 == 1){
            return 0;
        }else{
            return 1+aDouble(n/2);
        }
    }
}