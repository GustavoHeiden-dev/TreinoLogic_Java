public static void main() {

    Scanner sc = new Scanner(System.in);
    System.out.println("escreva uma palavra");
    String palavra = sc.nextLine().toLowerCase();

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


    }

