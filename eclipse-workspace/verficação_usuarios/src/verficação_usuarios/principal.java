package verficação_usuarios;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		String usu;
		int senha;
		
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		
		System.out.println("Digite seu usuario");
		usu= entrada.nextLine();
		System.out.println("Digite sua senha");
		senha= entrada.nextInt();
		

		if(usu.equalsIgnoreCase("operador")&& senha==1234){
			System.out.println("Você Logou como Operador ");
			
		}else if(usu.equalsIgnoreCase("operador")&& senha!=1234) {
			System.out.println("A senha esta errada ");
		}
		else if(usu.equalsIgnoreCase("adm")&& senha==9876){
			System.out.println("Bem vindo Administrador! ");
			
		}else if(usu.equalsIgnoreCase("adm")&& senha!=9876) {
				System.out.println("A senha esta errada  ");
		}else  {
				System.out.println("Acesso Negado");
			}
		
	}

}
