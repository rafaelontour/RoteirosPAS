package roteiro1.parte4;

import java.util.List;

public class PedidoService {
    private MysqlConnection connection;
    private List<String>itens;

    // Viola o Princípio de Responsabilidade Unica, baixa coesão e alto acoplamento.
    public PedidoService(List<String> itens) {
        this.connection = new MysqlConnection();
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
            if (item.equals("Pizza")) {
                total += 30.0;
                double desconto = 0.1 * total; // 10% de desconto
                total -= desconto; // Aplicando o desconto
            } 
            else if (item.equals("Bebida")) {
                total += 10.0;
            } else if(item.equals("Pizza e Bebida")) {
                total += 40.0;
                double desconto = 0.15 * total;
                total -= desconto; // Aplicando o desconto
            }
    
        }
        return total;
    }

}
