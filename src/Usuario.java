import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("----------Bem Vind@!!---------");
        System.out.println("------------------------------");

        int menu = 0;

        System.out.println("----------- ECOLHA -----------");
        System.out.println("------1 - NOVO POR AQUI-------");
        System.out.println("----- 2 - JA TENHO CADASTRO---");
        System.out.println("------------------------------");

        String escolha;
        System.out.print("Escolha um dos números: ");
        escolha = ler.next();


        switch (menu) {

            case 1:
                System.out.print("Nome do novo discente:");
                System.out.print("CPF:");
                System.out.print("E-mail:");
                break;


            case 2:
                String cpfDigitado;
                System.out.print("Digte seu CPF: ");
                cpfDigitado = ler.next();
                if (cpfDigitado.equals(cpfDigitado)) {
                    System.out.println("CPF Correto");
                    System.out.println("Tela de acesso permitido");
                    System.out.println("------------------------");
                } else {
                    System.out.println("CPF Incorreto");
                    System.out.println("Tela de acesso não permitido");
                    System.out.println("-----------------------------");
                    System.exit(0);
                }
        }
    }
}


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

