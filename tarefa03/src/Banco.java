public class Banco {
    private Conta[] contas;
    private int totalContas;

    public Banco(int qtd){
        this.contas = new Conta[qtd];
    }

    public void adiciona (Conta c){      
            contas[totalContas] = c;
            totalContas++;       
    }

    public Conta pegaConta(int qtd){
        return contas [qtd];
    }

    public int pegaTotalDeContas(){
        return this.totalContas;
        
    }

}
