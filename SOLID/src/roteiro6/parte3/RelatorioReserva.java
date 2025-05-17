package roteiro6.parte3;

public class RelatorioReserva {
    private final Connection connection;
    
    public RelatorioReserva(Connection c) {
        this.connection = c;
    }
    
    public void gerarRelatorio() {
        this.connection.connect();
        System.out.println("Lógica de negócio para geração do relatório");
    }
}
