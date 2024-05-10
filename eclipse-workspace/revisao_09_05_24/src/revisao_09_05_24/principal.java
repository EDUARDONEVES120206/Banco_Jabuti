package revisao_09_05_24;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		//if , else if, else, if-else if
		// verificação de media de notas
		
		double nota1;
		double nota2;
		
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		
		System.out.println("Digite a 1° nota");
		nota1= entrada.nextDouble();
		System.out.println("Digite a 2° nota");
		nota2= entrada.nextDouble();
		double nf= (nota1 +nota2)/2;
		
		if(nf>=5) {
			System.out.println("Você foi aprovado e sua nota foi: "+nf);	
		}else{
			System.out.println("Você foi reprovado e sua nota foi: "+nf);
		}
		
		
		
		
		
		
		

	}

}
