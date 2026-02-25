import java.util.Scanner;

public class inverternumero {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva uma sequencia de numero\nex: 1234 :");
        String num = sc.nextLine();
        String invert = new StringBuilder(num).reverse().toString();
        System.out.println(invert);

        //inverter vetor
        int[] vetor = new int[3];
        System.out.println("escreva 3 numeros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posiçao "+i+":");
            vetor[i] = sc.nextInt();
        }
        int tamanhoVetor = vetor.length;
        int[] vetorInverso = new int[tamanhoVetor];
        int tamanhoBaseZero = tamanhoVetor - 1;
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorInverso[i] = vetor[tamanhoBaseZero - i];
            System.out.print(vetorInverso[i]);
        }
    }

}
