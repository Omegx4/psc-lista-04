import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior número é: " + maior);
    }
}