package roteiro4.parte1;

public class CartaoCredito implements MetodoPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " processado no cartão de crédito.");
    }
    
    @Override
    public void gerarFatura() {
        System.out.println("Fatura gerada para o cartão de crédito.");
    }
    
    @Override
    public void validarSaldo() {
        System.out.println("Validando saldo disponível no cartão de crédito.");
    }
}