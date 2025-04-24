package roteiro4.parte4;

public class BoletoBancario extends Pagamento implements PagamentoReembolsavel {
    @Override public void processarPagamento(double valor) {
        System.out.println("Boleto gerado para pagamento de R$ " + valor);
    }
    
    @Override
    public void gerarFatura() {
        System.out.println("Fatura gerada para o boleto bancário.");
    }
    
    @Override
    public void processarReembolso(double valor) {
        System.out.println("Reembolso de R$ " + valor + " deve ser feito via transferência bancária.");
    }
}