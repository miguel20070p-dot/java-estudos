import java.util.Scanner;

public class Ex018 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combustivel = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (combustivel != 4){
            combustivel = sc.nextInt();
            if (combustivel == 1 ){
                alcool +=1;
            }
            else if (combustivel ==2){
                gasolina +=1;
            }
            else if (combustivel ==3){
                diesel +=1;
            }
            }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " +diesel);

        }
    }

