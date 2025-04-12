import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("População do país A: ");
            int popA = sc.nextInt();
            System.out.print("Taxa de crescimento de A (%): ");
            double taxaA = sc.nextDouble();

            System.out.print("População do país B: ");
            int popB = sc.nextInt();
            System.out.print("Taxa de crescimento de B (%): ");
            double taxaB = sc.nextDouble();

            if (popA <= 0 || popB <= 0 || taxaA <= 0 || taxaB <= 0) {
                System.out.println("Valores devem ser maiores que zero.");
                continue;
            }

            int anos = 0;
            while (popA <= popB) {
                popA += popA * taxaA / 100;
                popB += popB * taxaB / 100;
                anos++;
            }

            System.out.println("Serão necessários " + anos + " anos.");

            System.out.print("Deseja repetir? (s/n): ");
            sc.nextLine();
            String repetir = sc.nextLine().toLowerCase();
            if (!repetir.equals("s")) {
                break;
            }
        }
    }
}