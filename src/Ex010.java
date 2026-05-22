import javax.swing.*;
import java.util.Scanner;
public class Ex010 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        if (num <0)
            System.out.println("NEGATIVO");

        else
            System.out.println("POSITIVO");



    }
}
