import java.util.Scanner;

public class semaforo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
		System.out.println("Escolha o núumero entre uma dessas opções\n"
				 + "[0]Verde\n"
				 + "[1]Amarelo\n"
				 + "[2]Vermelho\n"
				 );
        int cor = in.nextInt();
  
        String[] nomesCores = {"Verde", "Amarelo", "Vermelho"};
        int proximaCorIndex = (cor + 1) % 3;
        String resul = nomesCores[proximaCorIndex];
        
        switch(cor){
            case 0:
            System.out.println("Você passou no verde e a próxima cor sera: "+resul);
            break;
            case 1:
            System.out.println("Você passou no amarelo e a próxima cor sera: "+resul);
            break;
            case 2:
            System.out.println("Você passou no vermelho e a próxima cor sera: "+resul);
            break;
            default:
		    System.out.println("Cor inválida, Digite uma das cores presentes no Menu");

        }
    }
}
