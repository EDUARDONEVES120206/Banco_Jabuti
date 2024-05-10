import java.util.Scanner;

public class Par_impar {
	public static void main(String[] args) {

		int numero;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número: ");
		numero = entrada.nextInt();

		if (numero % 2 == 0) {
				
			System.out.println("Seu número é "+ numero+ " e ele é Par. " );
			
			}
		 else {
			System.out.println("Se número é "+ numero + " e ele é Impar. " );
		}
		
	}
}
