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


//        System.out.println("------------------------------");
//        System.out.println("----------Bem Vind@!!---------");
//        System.out.println("------------------------------");
//
//        int menu = 0;
//
//        System.out.println("----------- ECOLHA -----------");
//        System.out.println("------1 - NOVO POR AQUI-------");
//        System.out.println("----- 2 - JA TENHO CADASTRO---");
//        System.out.println("------------------------------");
//
//        String escolha;
//        System.out.print("Escolha um dos números: ");
//        escolha = ler.next();
//
//        Usuario usuario = new Usuario();
//
//        switch (escolha) {
//
//            case "1":
//                System.out.print("Nome do novo discente:");
//                usuario.setNome(ler.next());
//                System.out.print("CPF:");
//                usuario.setCpf(ler.next());
//                System.out.print("E-mail:");
//                usuario.setEmail(ler.next());
//                break;
//
//
//            case "2":
//                String cpfDigitado;
//                System.out.print("Digte seu CPF: ");
//                cpfDigitado = ler.next();
//                if (cpfDigitado.equals(cpfDigitado)) {
//                    System.out.println("CPF Correto");
//                    System.out.println("Tela de acesso permitido");
//                    System.out.println("------------------------");
//                } else {
//                    System.out.println("CPF Incorreto");
//                    System.out.println("Tela de acesso não permitido");
//                    System.out.println("-----------------------------");
//                    System.exit(0);
//                }
//        }
//    }
//    }


//		SEGUNDA PARTE AINDA ELABORANDO.

//		System.out.println("------------ MENU ------------");
//		System.out.println("--- 1 - Cadastro alun@ -------");
//		System.out.println("--- 2 - Cursos disponíveis ---");
//		System.out.println("--- 3 - Nome Professores -----");
//		System.out.println("--- 0 - Sair -----------------");
//		System.out.println("------------------------------");a
//
//
//		}

    }
}