
public class Gerente {

    String nome;
    String cpf;
    int senha;

    public Gerente() {
    }

    public Gerente(String nome, String cpf, int senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public static void main(String[] args) {
        Cliente cli = new Cliente();
        Menu menu = new Menu();
        cli.cadastrar();
        if (cli.login() == true) {
            menu.escolhaConta();
        }
    }

}
