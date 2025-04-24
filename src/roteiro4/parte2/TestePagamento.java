package roteiro4.parte2;
public class TestePagamento {
    public static void main(String[] args) {
        System.out.println("\n PAGAMENTO CARTAO DE CREDITO");
        MetodoPagamento cartao = new CartaoCredito();

        if (cartao instanceof CartaoCredito) {
            // ((CartaoCredito)cartao).gerarFatura();
            ((MetodoPagamentoComFatura)cartao).gerarFatura();
        }
        cartao.processarPagamento(100.00);
        
        System.out.println("\n PAGAMENTO BOLETO BANCARIO");
        MetodoPagamento boleto = new BoletoBancario();
        boleto.processarPagamento(200.00);
        
        System.out.println("\n PAGAMENTO CRIPTO");
        MetodoPagamento cripto = new Criptomoeda();
        cripto.processarPagamento(300.00);
    }
}