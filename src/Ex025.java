import java.util.Scanner;

public class Ex025 {
    static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int numero = sc.nextInt();

         for (int i =1; i<=numero; i++){
             int quadrado = i * i ;
             int cubo = i * i * i;
             System.out.println(i + " "+ quadrado + " " + cubo);
         }

    }
}
