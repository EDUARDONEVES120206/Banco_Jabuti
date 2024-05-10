import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// verificar se usuario e senha estão corretos
		// usuario= adm 
		// senha = 1234
		// Estilo Netflix e Instagram
		
		String usu = "Operador";
		int senha= 123;
		
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		
		System.out.println("Digite seu usuario");
		usu= entrada.nextLine();
		
		
		if(usu.equalsIgnoreCase("Operador")) {
		System.out.println("Digite a Senha");
		senha= entrada.nextInt();
		
			if(senha==123) {
				System.out.println("Você Logou!!!");
			}else {
				System.out.println("Senha incorreta");
			}
		
		}else  {
			System.out.println("usuario incorreto");
		}
		
			
	}

}
	