import java.util.Locale;
import java.util.Scanner;

public class Ex022 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int N = sc.nextInt();

        for(int i = 1; i <=N; i++){
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            if (num2 == 0 ) {
                System.out.println("divisao impossivel");
            }
            else{
                System.out.printf("%.1f%n",num1 / num2);
            }
        }
        sc.close();
    }
}
