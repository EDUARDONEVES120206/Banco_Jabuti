
import javax.swing.JOptionPane;

public class Conta {

    int num;
    double saldo;
//construtor vazio

    public Conta() {
        this(0, 0.0);
    }
//construtor com parâmetros                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     

    public Conta(int num, double saldo) {
        this.num = num;
        this.saldo = saldo;
    }
//metodo deposito

    public void deposita(double valor) {
        this.saldo = saldo + valor;
        JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso");
    }
//metodo saque

    public void saque(double valor) {
        this.saldo = saldo - valor;
        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");
    }
//metodo ver saldo

    public double valorsaldo() {
        return saldo;
    }
}
