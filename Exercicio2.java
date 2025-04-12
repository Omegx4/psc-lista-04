import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, senha;

        while (true) {
            System.out.print("Digite o nome do usuário: ");
            usuario = sc.nextLine();

            System.out.print("Digite a senha: ");
            senha = sc.nextLine();

            if (senha.equals(usuario)) {
                System.out.println("Erro: a senha não pode ser igual ao nome do usuário.");
            } else {
                break;
            }
        }
    }
}