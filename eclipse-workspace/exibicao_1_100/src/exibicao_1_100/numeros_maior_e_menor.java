package exibicao_1_100;

import java.util.Scanner;

public class numeros_maior_e_menor {

	public static void main(String[] args) {
		int numero;
		int numero1;
		int numero2;
		for (int i = 1; i <= 100; i++) {

			Scanner entrada = new Scanner(System.in);
			Scanner entrada1 = new Scanner(System.in);
			Scanner entrada2 = new Scanner(System.in);

			System.out.println("\nDigite o primeiro número");
			numero = entrada.nextInt();
			System.out.println("Digite segundo número");
			numero1 = entrada1.nextInt();
			System.out.println("Digite terceiro número");
			numero2 = entrada2.nextInt();

			if (numero > numero1 && numero > numero2 && numero1 > numero2) {
				System.out.println("o Primeiro numero digitado e maior que os outros 2: " + numero);
				System.out.println("o Segundo numero digitado e maior que o terceiro numero: " + numero1);
				System.out.println("Este é o menor número " + numero2);

			} else if (numero1 > numero && numero1 > numero2 && numero > numero2) {
				System.out.println("o Primeiro numero digitado e maior que o Terceiro número " + numero);
				System.out.println("o Segundo numero numero digitado e maior que os otros 2 " + numero1);
				System.out.println("Este é o menor número " + numero2);

			} else if (numero2 > numero && numero2 > numero1 && numero > numero1) {
				System.out.println("o Primeiro numero digitado e maior que o segundo número " + numero);
				System.out.println("Este é o menor número " + numero1);
				System.out.println("o terceiro numero digitado e maior que os otros 2 " + numero2);

			} else if (numero2 == numero && numero2 == numero1 && numero == numero1) {
				System.out.println("o Primeiro numero e igual ao segundo e terceiro " + numero);
				System.out.println("o Segundo numero e igual ao primeiro e terceiro " + numero1);
				System.out.println("o terceiro numero e igual ao primeiro e segundo 2 " + numero2);

			} else if (numero1 > numero && numero1 > numero2 && numero2 > numero) {
				System.out.println("Este é o menor número " + numero);
				System.out.println("o Segundo numero numero digitado e maior que os otros 2 " + numero1);
				System.out.println("o terceiro número e maior que o primeiro numero " + numero2);
			} else {
				System.out.println("opção nao calculada");

			}
		}

	}
}
