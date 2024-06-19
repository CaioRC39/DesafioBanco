import java.util.List;

public class Banco {
    // Atributos
    private String nome;
    private List<Conta> contas;

    // Getter
    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    //Métodos
    public List<Cliente> clientes() {
        return contas.stream().map(Conta::getCliente).toList();
    }
}
