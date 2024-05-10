package classificar_idade;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		
		
		int idade;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a sua idade");
		idade= entrada.nextInt();
		
		
		if(idade >=1&& idade<=13) {
			System.out.println("Você é uma criança com: "+idade +" anos");	
			
			}else if(idade >13&& idade<=20) {
			System.out.println("Você é uma adolescente com: "+idade +" anos");
			
			}else if(idade >20&& idade<=60) {
			System.out.println("Você é uma adulto com: "+idade +" anos");
			
		}else if(idade >60&& idade<=120)  {
			System.out.println("Você é uma Idoso com: "+idade +" anos");
		}else {
			System.out.println("Idade Invalida");
		}

	}

}
