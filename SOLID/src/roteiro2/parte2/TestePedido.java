package roteiro2.parte2;

import java.util.Arrays; 

public class TestePedido {
    public static void main(String[] args) {
        PedidoService pedido = new PedidoService(Arrays.asList("Camiseta", "Calça", "Jaqueta")); // Desconto de 30%
        pedido.processarPedido(0.1); // Desconto de 10% 
        pedido.processarPedido(0.0); // Sem desconto
        pedido.processarPedido(0.4); // Desconto de 40%, mas não aplicado
    }
}