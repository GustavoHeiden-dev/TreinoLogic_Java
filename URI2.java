import java.util.Scanner;

public class URI2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double calc= 0 ;

        if (num < 2000) {
            System.out.println("Isento");
        }
        if (num > 2000) {
            double sobra = Math.min(num , 3000) - 2000;
            calc += sobra* 0.08 ;
        }
        if (num > 3000) {
            double sobra = Math.min(num , 4500) - 3000;
            calc += sobra* 0.18 ;
        }
        if (num > 4500) {
            double sobra = num - 4500;
            calc += sobra* 0.28 ;
        }


        System.out.println("R$ "+calc);
    }
}