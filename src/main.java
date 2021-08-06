import Pessoa.Usuario;
import Produto.Eletronico;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Usuario u1 = new Usuario("yuri@nexti.com", "teste12345");
        Usuario u2 = new Usuario("joabefilipe@gmail.com", "senhausuario2");
        Usuario u3 = new Usuario("patrick@kcirtap.com", "4321");
        Usuario u4 = new Usuario("manu021rj@gmail.com", "12345");



        System.out.println(u2.getEmail() +" - "+ u1.getEmail() + " - "+ u3.getEmail());
        System.out.println(u2.getSenha()); //Aqui estou acessando o atributo senha da class usuario.

    }
}