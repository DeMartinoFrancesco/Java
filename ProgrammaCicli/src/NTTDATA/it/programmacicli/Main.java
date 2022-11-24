package NTTDATA.it.programmacicli;

public class Main {
    public static void main(String[] args) {
        double c=1;
        double n=0;


        System.out.println("Ciclo While");

        while(c<=16){
            System.out.println(""+(2*(2*c)));
            n = Math.pow(2,c);
           // System.out.println(n);
            c++;
        }
        System.out.println("///////////////////////////////////////");

        System.out.println("Ciclo For");

        for(c=1;c<=16;c++){
            n = Math.pow(2,c);
            System.out.println(n);
        }
    }
}