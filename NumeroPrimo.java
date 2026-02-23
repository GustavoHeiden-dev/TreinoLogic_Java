import java.util.Scanner;

public class NumeroPrimo {
     public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        if (Primo(numero)) {
            System.out.println("Primo");
        }
        else {
            System.out.println("Nao Primo");
        }
    }
    public static boolean Primo(int numero){
        if(numero <= 1){return false;}
        if(numero == 2 ){
            return true;
        }
        if (numero % 2 == 0){return false;}

        for (int i = 3; i <= Math.sqrt(numero); i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }
}
