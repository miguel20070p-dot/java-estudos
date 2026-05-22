import java.util.Scanner;

public class Ex008 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();

        if (num % 2 == 0)
            System.out.println("PAR");
        else
            System.out.println("ÍMPAR");

        sc.close();
    }
}
