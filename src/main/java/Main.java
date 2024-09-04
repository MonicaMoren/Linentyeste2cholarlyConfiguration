import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;

        System.out.println("Por favor, insira sua senha:");

        senha = sc.nextLine();

        while (!senha.equals("2022")) {
            if (senha.equals("2200") || senha.equals("1020")) {
                System.out.println("Senha inválida");
            } else {
                System.out.println("Senha incorreta");
            }
            System.out.println("Digite novamente:");
            senha = sc.nextLine();
        }
        System.out.println("Acesso Permitido");
        sc.close();
    }
}
