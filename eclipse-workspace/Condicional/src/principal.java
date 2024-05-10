// Aluno: Eduardo Vicente Ferreira das Neves
// Curso de Java Oracle- Foundantiond
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/*Sinal de Semafaro
		passar== verde
		parar= vermelho
		atenção = amarelo
		*/
		
		//Inserção de Variaveis
	
		String cor = null;
		
		Scanner entrada = new Scanner(System.in);
		
		// Menu Simples
		System.out.println("Escolha entre uma dessas opções\n"
						 + "[1]Verde\n"
						 + "[2]Amarelo\n"
						 + "[3]Vermelho\n"
						 + "Digite a cor do sinal na hora em que você passou");
		
		cor= entrada.nextLine();
		
		//Estrutura Condicional
		if(cor.equals("verde")){
			System.out.println("Tudo bem passar no verde!!!");
		
		}else if(cor.equals("amarelo")) {
			System.out.println(" Cuidado você passou no amarelo!!!");
			
		}else if (cor.equals("vermelho")) {
			System.out.println("Você passou no sinal fechado, é sera multado");
			
		}else {
			System.out.println("Opção invalida");
			
		}
		
	}

}
