// Aluno: Eduardo Vicente Ferreira das Neves
// SENAI NAMI JAFET
// Curso Java Oracle
import java.util.Scanner;

public class soma {
	public static void main(String[] args) {
		
		//Insercção de Variaveis
		double num;
		Scanner entrada1 = new Scanner(System.in);
		
		// Inserção de Scanners 
		
		System.out.println("Digite um número entre 1 e 10: ");
		num= entrada1.nextDouble();
		// calculos das contas
		
		if(num<=10) {
		System.out.println("Seu número multiplicado por 1 é igual a: "+ num*1);
		System.out.println("Seu número multiplicado por 2 é igual a: "+ num*2);
		System.out.println("Seu número multiplicado por 3 é igual a: "+ num*3);
		System.out.println("Seu número multiplicado por 4 é igual a: "+ num*4);
		System.out.println("Seu número multiplicado por 5 é igual a: "+ num*5);
		System.out.println("Seu número multiplicado por 6 é igual a: "+ num*6);
		System.out.println("Seu número multiplicado por 7 é igual a: "+ num*7);
		System.out.println("Seu número multiplicado por 8 é igual a: "+ num*8);
		System.out.println("Seu número multiplicado por 9 é igual a: "+ num*9);
		System.out.println("Seu número multiplicado por 10 é igual a: "+ num*10);
		
		}else {
			System.out.println("Digite um número entre 1 e 10");
		}
		}
	}


