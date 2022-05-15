public class App {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco(5);

        Conta conta = new Conta();
        ContaCorrente corrente = new ContaCorrente();
        ContaPoupanca poupanca = new ContaPoupanca();

        ContaPoupanca p2 = new ContaPoupanca(); //teste para pegaTotalContas

        conta.deposita(1000);
        System.out.println("Saldo inicial conta: R$ " + conta.getSaldo());

        corrente.deposita(1000);
        System.out.println("Saldo inicial conta corrente: R$ " + corrente.getSaldo());

        poupanca.deposita(1000);
        System.out.println("Saldo inicial conta poupança: R$ " + poupanca.getSaldo());

        p2.deposita(1000);//teste para pegaTotalContas

        
        // conta.atualiza(0.01);
        // System.out.println("Saldo atualizado conta: R$ " + conta.getSaldo());

        // corrente.atualiza(0.01);
        // System.out.println("Saldo atualizado conta corrente: R$ " + corrente.getSaldo());

        // poupanca.atualiza(0.01);
        // System.out.println("Saldo atualizado conta poupança: R$ " + poupanca.getSaldo());

        AtualizadorDeContas atualizador = new AtualizadorDeContas(0.01);
        atualizador.roda(conta);
        atualizador.roda(corrente);
        atualizador.roda(poupanca);

        atualizador.roda(p2);//teste para pegaTotalContas

        System.out.println("Saldo Total: " + atualizador.getSaldoTotal());

        banco.adiciona(conta);
        banco.adiciona(corrente);
        banco.adiciona(poupanca);

        banco.adiciona(p2);//teste para pegaTotalContas
      

        for (int i = 0; i < banco.pegaTotalDeContas(); i++) {
            atualizador.roda(banco.pegaConta(i));            
        }

        System.out.println("Contas no banco = " + banco.pegaTotalDeContas());      

    }
}
