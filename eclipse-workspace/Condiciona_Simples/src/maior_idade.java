// Eduardo Neves
import java.util.Scanner;

public class maior_idade {

	public static void main(String[] args) {
		
		// Declaração de Variaveis
		int id;
		Scanner entrada = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Digite a sua idade: ");
		id= entrada.nextInt();
		
			//Estrutura Condicional
			if(id>=18) {
			System.out.println("Você é maior idade");	
			
			}else if(id<18) {
			System.out.println("Você ainda é menor de idade");
			
			}else {
			System.out.println("Idade Invalida");
			}

	}

}
