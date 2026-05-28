import java.util.Scanner;
import java.util.Locale;

public class Ex021 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int N = sc.nextInt();

        for (int i = 1; i <=N; i++) {
            double v1 = sc.nextDouble();
            double v2 = sc.nextDouble();
            double v3 = sc.nextDouble();
            double media = (v1 * 2 + v2 * 3 + v3 * 5) / (10);

            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }

}
