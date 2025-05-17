package roteiro4.parte4;

public class TestePagamento {
    public static void main(String[] args) {
        System.out.println("\n PAGAMENTO CARTAO DE CREDITO");
        Pagamento cartao = new CartaoCredito();
        cartao.gerarFatura();
        cartao.processarPagamento(100.00);
        if (cartao instanceof PagamentoReembolsavel) {
            ((PagamentoReembolsavel) cartao).processarReembolso(50.00);
        }
        
        System.out.println("\n PAGAMENTO BOLETO BANCARIO");
        Pagamento boleto = new BoletoBancario();
        boleto.gerarFatura();
        boleto.processarPagamento(200.00);
        if (boleto instanceof PagamentoReembolsavel) {
            ((PagamentoReembolsavel) boleto).processarReembolso(100.00);
        }
        
        System.out.println("\n PAGAMENTO CRIPTO");
        Pagamento cripto = new Criptomoeda();
        cripto.gerarFatura();
        // try {
        //  cripto.gerarFatura();
        // } catch (UnsupportedOperationException e) {
        //     System.out.println("ERRO - Gerar Fatura : " + e.getMessage());
        // }
        cripto.processarPagamento(300.00);
        if (cripto instanceof PagamentoReembolsavel) {
            ((PagamentoReembolsavel) cripto).processarReembolso(100.00);
        }
    }
}