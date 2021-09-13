package Pessoa;

public class Cliente extends Pessoa {
    private int clientId;
    private String telefone;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente(int clientId, String telefone) {
        this.clientId = clientId;
        this.telefone = telefone;
    }
}
