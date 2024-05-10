import java.util.Scanner;

public class PrincipalSwitch {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Escolha o npumero entre uma dessas opções\n"
				 + "[9]Calouro\n"
				 + "[10]2° ano\n"
				 + "[11]Júnior\n"
				 + "[12]Veterano\n"
				 );
		int grade = in.nextInt();
		switch (grade) {
		case 9:
		System.out.println("Você é um calouro");
		break;
		case 10:
		System.out.println("Você está no segundo ano");
		break;
		case 11:
		System.out.println("Você é um júnior");
		break;
		case 12:
		System.out.println("Você é um veterano");
		break;
		default:
		System.out.println("Nota inválida");
		}//end switch

		
		
		
		
		
		
		
		

	}

}
