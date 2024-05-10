//Eduardo Neves
import java.util.Scanner;

public class maior_menor {

	public static void main(String[] args) {
		//Declaração de Variaveis
		double n1;
		double n2;
		//Scanners
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		n1= entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		n2= entrada.nextInt();
		
		//Estrutura Condicional
		if (n1 > n2) {
			System.out.println("o primeiro número: " + n1 + " é maior que o segundo número: " + n2);
		}else if(n2>n1) {
			System.out.println("o segundo número: "+ n2+" é maior que o primeiro número: "+ n1);
		}else {
			System.out.println("o valor do número 1: "+ n1+" é igual o valor do número 2 "+ n2);
		}
		
		

	}

}
