import javax.swing.*;
import java.util.Scanner;

public class Ex007 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x < 12) {
            System.out.println("Bom Dia!");
        }
        else if (x < 18){
            System.out.println("Boa Tarde");
    }
        else
            System.out.println("Boa Noite");

        sc.close();
            }

    }
