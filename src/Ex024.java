import java.util.Scanner;

public class Ex024 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        for(int i =1; i<=numero; i++){
            if (numero %i ==0) System.out.println(" "+i);
        }
    }
}
