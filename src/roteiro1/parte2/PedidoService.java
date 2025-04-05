package roteiro1.parte2;

import java.util.List;

public class PedidoService {
    private MysqlConnection connection;
    private List<String>itens;

    // Refatorando efetivamos o Princípio de Responsabilidade Unica, alta coesão e baixo acoplamento. Essa tecnica é chamada de Injeção de Dependência.
    public PedidoService(MysqlConnection connection,List<String> itens) {
        this.connection = connection;
        this.itens = itens;
    }

    public void processarPedido() {
        this.connection.connet();
        double total = calcularTotal();
        System.out.println("Pedido processado. Valor total: R$ " + total);
    }

    private double calcularTotal() {
        double total = 0;
        for (String item : itens) {
            if (item.equals("Pizza")) total += 30.0;
            else if (item.equals("Bebida")) total += 10.0;
        }
        return total;
    }
}
