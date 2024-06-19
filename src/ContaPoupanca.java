public class ContaPoupanca extends Conta {
    // Método Construtor
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    
    // Implementação do método "imprimirExtrato"
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
