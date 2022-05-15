public class ContaCorrente extends Conta{


    @Override   
    public void atualiza(double taxa){
        this.saldo += this.saldo * 2 * taxa;
    }

    @Override
    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }

    
}
