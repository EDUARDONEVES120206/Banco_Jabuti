import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        int pedido = 0;
        int total_pedido=0;
        int valorTotal = 0;

        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Escolha um lanche do cardapio\n" +
                    "[1] X-Burguer    R$12,00\n" +
                    "[2] X-Salada     R$15,00\n" +
                    "[3] X-Bacon      R$18,00\n" +
                    "[4] X-coxinha 	 R$8,00\n" +
                    "[5] Misto Quente R$12,00\n" +
                    "[0] Sair\n");
            pedido = entrada.nextInt();

            switch (pedido) {
                case 1:
                    System.out.println("Você pediu um X-burguer.");
                    System.out.println("Deseja algo mais continue pedindo: ");
                    valorTotal += 12; 
                    total_pedido += 1;
                    break;
                case 2:
                    System.out.println("Você pediu um X-Salada.");
                    System.out.println("Deseja algo mais continue pedindo: ");
                    valorTotal += 15;
                    total_pedido += 1;
                    break;
                case 3:
                    System.out.println("Você pediu um X-Bacon.");
                    System.out.println("Deseja algo mais continue pedindo: ");
                    valorTotal += 18;
                    total_pedido += 1;
                    break;
                case 4:
                    System.out.println("Você pediu uma Coxinha.");
                    System.out.println("Deseja algo mais continue pedindo: ");
                    valorTotal += 8;
                    total_pedido += 1;
                    break;
                case 5:
                    System.out.println("Você pediu um Misto Quente.");
                    System.out.println("Deseja algo mais continue pedindo: ");
                    valorTotal += 12;
                    total_pedido += 1;
                    break;
                case 0:
                    System.out.println("Você saiu do nosso programa");
                    break;
                default:
                    System.out.println("Opção Invalida, retorne e digite uma opção valida.");
            }
        } while (pedido != 0);

        System.out.println("Total a pagar: R$" + valorTotal);
        System.out.println("o Total de itens pedidos foi: "+ total_pedido);

    }
}
