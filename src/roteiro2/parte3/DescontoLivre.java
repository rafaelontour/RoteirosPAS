package roteiro2.parte3;

public class DescontoLivre implements RegraDesconto {
    private final double desconto;
    
    public DescontoLivre(double desconto) { 
        this.desconto = desconto;
    } 
    
    @Override
    public double calcular(double total) {

        System.out.println("Desconto livre: " + desconto); // Log do desconto aplicado
        if (desconto > 0 && desconto <= 0.3) {  // Máx. 30% 
            return total - (total * desconto); 
        } 
        
        return total;
    }
}