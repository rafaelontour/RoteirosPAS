package roteiro2.parte2;

public class PagamentoDinheiro extends Pagamento {
    
    public PagamentoDinheiro(double valor, Gateway gateway) {
        super(valor, gateway);
    }
    
    public double calcularTaxa() {
        return 0;
    }
    
    public double calcularDesconto() {
        return this.valor*0.1;
    }
}