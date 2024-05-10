
import java.util.Scanner;

public class Estrutura_while_break {
    public static void main(String[] args) {
        
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Adivinhe o número secreto (ou digite -1 para desistir): ");
            int palpite = scanner.nextInt();
        
            if (palpite == -1) {
                System.out.println("Desistiu! O número secreto era: " + numeroSecreto);
                break; // Sai do loop
            }
           
            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número secreto: " + numeroSecreto);
                break; 
            } else if (palpite < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
        }
        
        scanner.close();
    }
}
