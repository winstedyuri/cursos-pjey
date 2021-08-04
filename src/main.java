import Produto.Eletronico;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Eletronico eletronico = new Eletronico();
        eletronico.setVoltagem("A Voltagem é: 220v");


        System.out.println(eletronico.getVoltagem());
        eletronico.setVoltagem("110V");
        System.out.println(eletronico.getVoltagem());

    }
}