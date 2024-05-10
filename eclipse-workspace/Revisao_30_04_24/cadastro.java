// Aluno: Eduardo Vicente Ferreira das Neves
import java.util.Scanner;

public class cadastro {
	public static void main(String[] args) {
		
		String nome;
		int idade;
		String endereco;
		String profissao;
		String telefone ;
		String email;
		String cpf;
		String rg;
		double doubleVar1 = 3.1; double doubleVar2 = 3.1;
		//lamdionad
		
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Scanner entrada3 = new Scanner(System.in);
		Scanner entrada4 = new Scanner(System.in);
		Scanner entrada5 = new Scanner(System.in);
		Scanner entrada6 = new Scanner(System.in);
		Scanner entrada7 = new Scanner(System.in);
		Scanner entrada8 = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome= entrada.nextLine();
		System.out.println("Digite sua idadee: ");
		idade= entrada2.nextInt();
		System.out.println("Digite seu endereço: ");
		endereco= entrada3.nextLine();
		System.out.println("Digite sua profissão ");
		profissao= entrada4.nextLine();
		System.out.println("Digite seu telefone: ");
		telefone= entrada5.nextLine();
		System.out.println("Digite seu email: ");
		email= entrada.nextLine();
		System.out.println("Digite seu cpf: ");
		cpf= entrada.nextLine();
		System.out.println("Digite seu Rg ");
		rg= entrada.nextLine();
		
		System.out.println("A idade do "+nome+" é "+ idade + " anos"+ " e sua profissão e "+ profissao+
				" seu endereço é"+ endereco+ 
				"\n seu telefone é"+telefone+" seu email e "+email+"seu CPF e "+ cpf+"seu rg é "+ rg);
		
		
		
		
		
		
	}
}
