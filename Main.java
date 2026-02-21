public static void main() {
 /* Lendo palavra;
    Scanner sc = new Scanner(System.in);
    System.out.println("escreva uma palavra");
    String palavra = sc.nextLine();

    String vogais = "aeiou";
    int contador = 0;
    String vogaisCon = "";
    for(int i=0;i<palavra.length();i++) {
        char letra = palavra.charAt(i);
        if(vogais.indexOf(letra) != -1){
            contador++;
            vogaisCon = vogaisCon + letra + " ";
        }
        }
    System.out.println("na sua palavra tem "+contador+" vogais");
    System.out.println("e elas sao:" + vogaisCon);
    */
    Scanner sc = new Scanner(System.in);
    System.out.println("escreva um numero para saber o fatorial:");
    int numero = sc.nextInt();

    long fatorial = 1;
    for (int i = 1; i <= numero ; i++) {
       fatorial *= i;
    }
    System.out.println(fatorial);
    }

