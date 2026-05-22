import java.util.Scanner;

public class Exercicio_1_para_relembrar {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual ano voce nasceu? ");

        int idade = sc.nextInt();
        int conta = 2026 - idade;

        System.out.println("Voce tem "  + conta +" anos");


    }
}
