import java.util.Scanner;

public class logaritimo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva um numero para saber o fatorial:");
        int numero = sc.nextInt();

        long fatorial = 1;
        for (int i = 1; i <= numero ; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }

}

