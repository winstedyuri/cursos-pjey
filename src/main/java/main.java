import Pessoa.Usuario;
import Produto.Eletronico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws SQLException {

        // cria var
        Connection conexao = null;

        try {
            Class.forName("com.myslq.jdbc.Driver");
            conexao = DriverManager.getConnection("jbdc:mysql://localhost/banco","usuario","senha");
            //Retorna consulta
            ResultSet rsCliente = conexao.createStatement().executeQuery(("SELECT * FROM CLIENTE"));
            //Podendo consultar as informações cliente.
            while (rsCliente.next()) {
                System.out.println("Nome: " + rsCliente.getString("nome"));
            }


        } catch (ClassNotFoundException ex) {
            System.out.println("Driver de banco de dados não localizado.");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao acessar o banco: " + ex.getMessage());
        } finally {
            if (conexao != null) {
                conexao.close();
            }
        }

        Scanner ler = new Scanner(System.in);
        Usuario u1 = new Usuario("yuri@nexti.com", "teste12345");
        Usuario u2 = new Usuario("joabefilipe@gmail.com", "senhausuario2");
        Usuario u3 = new Usuario("patrick@kcirtap.com", "4321");
        Usuario u4 = new Usuario("manu021rj@gmail.com", "12345");


        System.out.println(u2.getEmail() +" - "+ u1.getEmail() + " - "+ u3.getEmail());
        //Aqui estou acessando o atributo senha da class usuario.
        System.out.println(u2.getSenha());

    }
}