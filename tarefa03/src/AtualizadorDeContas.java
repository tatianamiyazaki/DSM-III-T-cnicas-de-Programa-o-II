public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;

    AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public double getSaldoTotal(){
        return this.saldoTotal;
    }

    public void setSaldoTotal(double valor) {
        this.saldoTotal += valor;
    }

    void roda(Conta conta) {
        // aqui voce imprime o saldo anterior, atualiza a conta,
        // e depois imprime o saldo final
        // lembrando de somar o saldo final ao atributo saldoTotal
        System.out.println("Saldo Anterior: R$ " + conta.getSaldo());
        conta.atualiza(this.selic);
        System.out.println("Saldo Final: R$ "+ conta.getSaldo());
        setSaldoTotal(conta.getSaldo());     
     

    }
        // outros métodos, colocar o getter para saldoTotal!

}
