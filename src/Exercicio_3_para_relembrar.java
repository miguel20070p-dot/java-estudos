import java.util.Scanner;

public class Exercicio_3_para_relembrar {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua media: ");
        double media = sc.nextDouble();

        if (media >= 6 ) {
            System.out.println("APROVADO");
        }
        else
            System.out.println("REPROVADO");

    }
}
