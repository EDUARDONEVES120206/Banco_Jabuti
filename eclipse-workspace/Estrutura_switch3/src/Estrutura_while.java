public class Estrutura_while {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0; 
        
        // Enquanto i for menor ou igual a 10, o loop continuará
        while (i <= 10) {
            sum += i; 
            i++; 
        }
        
        System.out.println("A soma dos números de 1 a 10 é: " + sum); 
    }
}
