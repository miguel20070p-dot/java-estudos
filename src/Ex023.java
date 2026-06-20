import java.util.Scanner;

public class Ex023 {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in) ;
        int numero = sc.nextInt();
        int resultado = 1;

        for (int i = numero; i>=1; i--){
            resultado= resultado * i;
        }
        System.out.println(" "+resultado);


    }
}
