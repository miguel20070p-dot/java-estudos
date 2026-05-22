import java.util.Scanner;
public class Ex009 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        sc.nextLine();
        int num2 = sc.nextInt();

        if(num1 % num2 ==0 || num2 % num1 ==0 )
            System.out.println("São Multiplos");
        else
            System.out.println(("Não são Multiplos"));

        sc.close();
    }
}
