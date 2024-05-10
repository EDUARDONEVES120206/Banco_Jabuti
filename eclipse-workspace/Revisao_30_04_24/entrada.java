import java.util.Scanner;

public class entrada {

	public static void main(String[] args) {
		
		// Entrada de Dados		
		int idade; 
		String nome;
		String cargo;
		
		// Biblioteca para Entrada de Dados
		
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		//pedri interação do usuario
		
		System.out.println("Digite a sua idade: ");
		idade= entrada.nextInt();
		System.out.println("Digite seu nome: ");
		nome= entrada1.nextLine();
		System.out.println("Digite sua Profissão: ");
		cargo = entrada2.next();
		//exibindo a idade do usuario
		
		System.out.println("A idade do "+nome+" é "+ idade + " anos"+ " e sua profissão e "+ cargo);
	
		
		
		
		
	}

}
