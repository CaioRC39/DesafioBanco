public class Principal {
    public static void main(String[] args) {
        // Criação do clinete
        Cliente caio = new Cliente();
        caio.setNome("Caio");
        
        // Criação das contas
        Conta corrente = new ContaCorrente(caio);
        Conta poupanca = new ContaPoupanca(caio);

        // Uso das contas
        corrente.depositar(100);
        corrente.transferir(100, poupanca);
        
        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        
    }
}
