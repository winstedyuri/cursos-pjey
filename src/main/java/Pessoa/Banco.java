package Pessoa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Banco {

    public void main(String[] args) throws SQLException {

        // cria var
        Connection conexao = null;

        try {
            Class.forName("com.myslq.jdbc.Driver");
            conexao = DriverManager.getConnection("jbdc:mysql://localhost/banco", "pessoa", "cpf");
            //Retorna consulta
            ResultSet Cliente = conexao.createStatement().executeQuery(("SELECT * FROM CLIENTE"));
            //Podendo consultar as informações cliente.
            while (Cliente.next()) {
                Object pessoa = null;
                System.out.println("Nome: " + Cliente.getString(getClass(null)));
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
    }

    private int getClass(Object pessoa) {
        return 0;
    }

}
