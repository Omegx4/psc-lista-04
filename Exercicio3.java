import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        while (true) {
            System.out.print("Nome: ");
            nome = sc.nextLine();
            if (nome.length() <= 3) {
                System.out.println("O nome deve ter mais de 3 caracteres.");
                continue;
            }

            System.out.print("Idade: ");
            idade = sc.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("Idade inválida.");
                continue;
            }

            System.out.print("Salário: ");
            salario = sc.nextDouble();
            sc.nextLine();
            if (salario <= 0) {
                System.out.println("Salário inválido.");
                continue;
            }

            System.out.print("Sexo (f/m): ");
            sexo = sc.nextLine().toLowerCase();
            if (!sexo.equals("f") && !sexo.equals("m")) {
                System.out.println("Sexo inválido.");
                continue;
            }

            System.out.print("Estado civil (s/c/v/d): ");
            estadoCivil = sc.nextLine().toLowerCase();
            if (!estadoCivil.equals("s") && !estadoCivil.equals("c") &&
                !estadoCivil.equals("v") && !estadoCivil.equals("d")) {
                System.out.println("Estado civil inválido.");
                continue;
            }

            break;
        }
    }
}