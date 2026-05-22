import java.util.Scanner;

public class Ex012 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 CACHORRO QUENTE / R$4,00\n" +
                           "2 X-SALADA / R$4,50\n" +
                           "3 X-BACON / R$5,00\n" +
                           "4 TORRADA SIMPLES / R$2,00\n" +
                           "5 REFRIGERANTE / R$1,50\n");

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double preco = 0.0;

        if (codigo == 1){
            preco = 4.00;
        }
        else if (codigo == 2){
            preco =4.50;
        }
        else if (codigo == 3){
            preco = 5.0;
        }
        else if(codigo == 4){
            preco = 2.00;
        }
        else if (codigo == 5){
            preco = 1.50;
        }
        System.out.printf("TOTAL: %.2f",preco * quantidade );


    }
}
