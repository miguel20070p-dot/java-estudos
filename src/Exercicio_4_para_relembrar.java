import java.util.Scanner;

public class Exercicio_4_para_relembrar {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura atual: ");
        double temperatura = sc.nextDouble();

        if (temperatura <=15) {
            System.out.println("Frio");

        }
        else if (temperatura <=30   ) {
            System.out.println("Agradavel");
        }
    else
            System.out.println("Quente");

    }

}
