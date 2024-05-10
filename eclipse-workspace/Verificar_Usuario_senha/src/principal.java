import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// verificar se usuario e senha estão corretos
		// usuario= adm 
		// senha = 1234
		// Estilo Netflix e Instagram
		
		String usu = "adm";
		int senha= 123;
		
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		
		System.out.println("Digite seu usuario");
		usu= entrada.nextLine();
		System.out.println("Digite sua senha");
		senha= entrada.nextInt();
		
		if(usu.equalsIgnoreCase("adm")&& senha==123){
		System.out.println("Você Logou!!! ");
		
		}else if(usu.equalsIgnoreCase("adm")&& senha!=123) {
			System.out.println("A senha esta errada ");
			
		}else  {
			System.out.println("Seu usuario esta errado");
		}
			
	}

}
