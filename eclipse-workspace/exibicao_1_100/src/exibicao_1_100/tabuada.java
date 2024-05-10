package exibicao_1_100;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        int numero  ;
        Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu usuario");
		numero= entrada.nextInt();
		
        System.out.println("Tabuada do 7:");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}

