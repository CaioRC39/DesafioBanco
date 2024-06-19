public class ContaCorrente extends Conta {
    // Método Construtor
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    
    // Implementação do método "imprimirExtrato"
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}