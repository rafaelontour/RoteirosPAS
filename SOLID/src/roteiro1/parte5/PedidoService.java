package roteiro1.parte5;

import java.util.List;

public class PedidoService {
    private final MysqlConnection connection;
    private final CalculadoraPreco calculadora;
    private final List<String>itens;

    // Refatorando efetivamos o Princípio de Responsabilidade Unica, alta coesão e baixo acoplamento. Essa tecnica é chamada de Injeção de Dependência.
    public PedidoService(MysqlConnection connection,List<String> itens) {
        this.connection = connection;
        this.calculadora = new CalculadoraPreco();
        this.itens = itens;
    }

    public void processarPedido() {
        this.connection.connet();
        double total = this.calculadora.calcularTotal(itens);
        System.out.println("Pedido processado. Valor total: R$ " + total);
    }
}
