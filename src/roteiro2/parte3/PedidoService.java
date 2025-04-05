package roteiro2.parte3;
import java.util.List; 

public class PedidoService {
    private final List<String> itens;
    private final double total; 
    private final RegraDesconto regraDesconto;

    public PedidoService(List<String> itens, RegraDesconto regraDesconto) {
        this.itens = itens;
        this.regraDesconto = regraDesconto;
        this.total = calcularTotal();
    }
    
    public PedidoService(List<String> itens) {
        this.itens = itens;
        this.regraDesconto = new DescontoLivre(0.0); // Desconto padrão de 0%
        this.total = calcularTotal();
    } 
    
    
    private double calcularTotal() {
        double total2 = 0.0;

        for (String item : itens) {
            if (item.equals("Camiseta")) total2 += 50.0;
            else if (item.equals("Calça")) total2 += 100.0;
            else if (item.equals("Jaqueta")) total2 += 200.0;
        } 

        System.out.println("Total calculado: R$ " + total2); // Log do total calculado
        
        return total2; 
    }
    
    public void processarPedido() { 
        double valorFinal = regraDesconto.calcular(total);
        System.out.println("Pedido processado. Valor final com desconto: R$ " + valorFinal);
    }
}