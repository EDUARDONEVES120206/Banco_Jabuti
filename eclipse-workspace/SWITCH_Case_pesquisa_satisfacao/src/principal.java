import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        // programa para pesquisa de satisfação
        // pedir para o usuário escolher uma opção
        // 1 - muito insatisfeito
        // 2 - insatisfeito
        // 3 - satisfeito
        // 4 - muito satisfeito
        // 5 - extremamente satisfeito

        int escolha;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Escolha seu nível de Satisfação\n"
                    + "[1] Muito Insatisfeito\n"
                    + "[2] Insatisfeito\n"
                    + "[3] Satisfeito\n"
                    + "[4] Muito Satisfeito\n"
                    + "[5] Extremamente Satisfeito\n"
                    + "[0] Sair\n"
            );
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Nosso Cliente está Muito Insatisfeito");
                    break;
                case 2:
                    System.out.println("Nosso Cliente está Insatisfeito");
                    break;
                case 3:
                    System.out.println("Nosso Cliente está Satisfeito");
                    break;
                case 4:
                    System.out.println("Nosso Cliente está Muito Satisfeito");
                    break;
                case 5:
                    System.out.println("Nosso Cliente está Extremamente Satisfeito");
                    break;
                case 0:
                    System.out.println("Você saiu do nosso programa");
                    break;
                default:
                    System.out.println("Opção Inválida, retorne e digite uma opção válida.");
            }
        } while (escolha != 0);
    }
}
