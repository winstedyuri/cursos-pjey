import jdk.jfr.internal.tool.Main;
import java.util.List;
import Pessoa.Pessoa;
import java.util.ArrayList;
import java.util.Scanner;

class CadastroPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList listaDePessoas = new ArrayList();
        Pessoa pessoa = new Pessoa();
        int op = 0;

        System.out.println("Bem vind@\n Digite 1 para cadastrar usuário ou 0 para sair:");
        op = scanner.nextInt();

        while (op != 0) {
            System.out.println("Bem vindo ao sistema de cadastros de usuários");
            System.out.println("Digite o nome do usuário");
            pessoa.setNome(scanner.nextLine());

            System.out.println("Digite seu CPF");
            pessoa.getCpf(scanner.nextLine());

            System.out.println("Digite a data de nascimento:");
            pessoa.getDataNascimento(scanner.nextLine());

            listaDePessoas.add(pessoa);
            pessoa = new Pessoa();

            System.out.println("Ok. Uma pessoa foi adicionada no nosso cadastro.\nDigite 1 para cadastrar mais usuários ou 0 para sair !");
            op = scanner.nextInt();

            if (op == 0) {
                break;
            }
        }
    }
}

