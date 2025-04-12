import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            double num = sc.nextDouble();
            soma += num;
        }

        double media = soma / 5;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}