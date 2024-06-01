public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Meu Banco");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Cliente 1");
        banco.adicionarCliente(cliente1);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Cliente 2");
        banco.adicionarCliente(cliente2);

        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente2);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.depositar(100);
        cc.transferir(60, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        banco.listarClientes();
    }
}
