import Pessoa.Usuario;
import Produto.Eletronico;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Usuario u1 = new Usuario("yuri@nexti.com", "teste12345");
        Usuario u2 = new Usuario("felipe@felipe.com", "senhausuario2");


        System.out.println(u2.getSenha()); //Aqui estou acessando o atributo senha da class usuario.
        System.out.println(u2.getEmail());
    }
}