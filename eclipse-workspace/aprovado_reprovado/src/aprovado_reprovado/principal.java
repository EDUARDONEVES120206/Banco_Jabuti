package aprovado_reprovado;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		double nota1;
		double nota2;
		double nota3;
		
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		System.out.println("Digite a 1° nota");
		nota1= entrada.nextDouble();
		System.out.println("Digite a 2° nota");
		nota2= entrada.nextDouble();
		System.out.println("Digite a 3° nota");
		nota3= entrada2.nextDouble();
		double media= (nota1 +nota2+ nota3)/3;
		
		if(media>4 && media<6) {
			System.out.println("Você esta de recuperação e sua media foi: "+ media);
		}else if(media>6) {
			System.out.println("Você esta de aprovado e sua media foi: "+ media);
		}else {
			System.out.println("Você esta de reprovado e sua media foi: "+ media);
		}
		
		

	}

}
