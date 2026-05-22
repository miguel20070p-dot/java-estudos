import java.util.Scanner;

public class Ex015 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double renda = sc.nextDouble();
        double imposto = 0.0;

        if (renda <=2000){
            System.out.println("INSENTO");
        }
        else if (renda >= 2000.01 && renda <=3000 ){
            double conta1 = (renda - 2000) *0.08;
            System.out.println("R$: " + conta1);
        }
        else if (renda >= 3000.01 && renda <=4500){
            double conta2 = 1000 * 0.08 + (renda - 3000) *0.18;
            System.out.println("R$: " + conta2);
        }
        else{
            double conta3 = 1000 * 0.08 + 1500 * 0.18 + (renda - 4500 ) * 0.28;
            System.out.println("R$: " + conta3);
        }
        sc.close();
    }
}
