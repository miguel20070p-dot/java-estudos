import java.util.Scanner;

public class Ex013 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INTERVALOS: [0,25], (25,50], (50,75], (75,100");

        double numero = sc.nextDouble();

        if (numero >=0 && numero <= 25){
            System.out.println("INTERVALO [0,25]");
        }
        else if(numero >25 && numero <=50) {
            System.out.println("INTERVALO (25,50]");
        }
        else if(numero >50 && numero <=75){
            System.out.println("INTERVALO (50,75]");
        }
        else if (numero >75 && numero <=100){
            System.out.println("INTERVALO (75, 100]");
        }
        else
            System.out.println("FORA DO INTERVALO");
    }
}
