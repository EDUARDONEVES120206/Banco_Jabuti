
import javax.swing.JOptionPane;

public class Menu {

    Conta conta;
    Cliente cli;
    int opcao;
    double dinheiro;

    public Menu() {
        conta = new Conta();
        cli = new Cliente();
        opcao = -1;
        dinheiro = 0.0;

    }

    public void escolhaConta() {
        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Insira a opção desejada:"
                    + "\n1- Deposito"
                    + "\n2- Saque"
                    + "\n3- Consultar Saldo"
                    + "\n0- Sair"));
            switch (opcao) {
                case 1:
                    dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a ser depositado"));
                    conta.deposita(dinheiro);
                    break;
                case 2:
                    dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor a ser sacado"));
                    conta.saque(dinheiro);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "O seu saldo é" + conta.valorsaldo());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado por utilizar o banco jabuti");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opção inválida");

            }
        }
    }
}
