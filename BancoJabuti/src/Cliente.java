
import javax.swing.JOptionPane;

public class Cliente {

    String nome;
    int senha;
    String cpf;

    public Cliente() {
        this("", 0, "");
    }

    public Cliente(String nome, int senha, String cpf) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
    }

    public void cadastrar() {
        int confsenha;
        nome = JOptionPane.showInputDialog("digite o seu nome: ");
        do {
            senha = Integer.parseInt(JOptionPane.showInputDialog("Insira sua senha: "));
            confsenha = Integer.parseInt(JOptionPane.showInputDialog("confirme sua senha: "));
        } while (confsenha != senha);
        cpf = JOptionPane.showInputDialog("insira seu cpf");
        JOptionPane.showMessageDialog(null, "cliente cadastrado com sucesso.");
    }

    public void consultar(String nome, int senha) {
        this.nome = nome;
        this.senha = senha;
        JOptionPane.showMessageDialog(null, "Esses são os dados do seu cadastro" + "\n" + nome + "\n" + senha);
    }

    public boolean login() {
        int verificaSenha;
        verificaSenha = Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha: "));
        if (verificaSenha == senha) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "senha incorreta");
            return false;
        }

    }

}
