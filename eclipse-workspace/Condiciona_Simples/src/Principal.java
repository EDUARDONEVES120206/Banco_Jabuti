import java.util.Scanner;

//Eduardo Neves
public class Principal {

	public static void main(String[] args) {
		// Condicional --> Tomada de decisão
		// nOTA DE ALUNO SE >= QUE 5== PASSA
		// SE Menor  QUE 5== recuperação
		
		//Declaração de Variaveis
		double nota;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a sua nota de  a 10: ");
		nota= entrada.nextDouble();
		
		//System.out.println(nota);
		if(nota>10) {
			System.out.println("Nota digitada acima do valor permitido digite novamnete");
		}
		else if(nota>=5 ) {
			System.out.println("Voce foi aprovado sua nota foi: "+ nota);
			
		}else if (nota <5) {
			System.out.println("Voce esta de recuperação: "+ nota);
			
		}else {
			System.out.println("Nota digitada Invaluda, Volte e Digite novamente");
			
		}
		

	}

}
