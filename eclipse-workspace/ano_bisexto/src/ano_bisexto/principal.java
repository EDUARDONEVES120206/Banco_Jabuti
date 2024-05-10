package ano_bisexto;

import java.util.Scanner;

public class principal {
		
	public static void main(String[] args) {
		
		int ano;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o ano: ");
		ano= entrada.nextInt();
		
		if((ano % 400 ==0 || ( ano % 4==0&& ano % 100!=0))) {
			System.out.println("o ano "+ano+" é bisexto");
		}else  {
			System.out.println("o ano "+ano+"  não é bisexto");
		}

		
		
		
		
		
	}
}
