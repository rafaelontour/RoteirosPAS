package roteiro6.parte1;

public class RelatorioReserva {
    private MySQLConnection connection;
    
    public RelatorioReserva() {
        this.connection = new MySQLConnection();
    }
    
    public void gerarRelatorio() {
        this.connection.connect();
        System.out.println("Lógica de negócio para geração do relatório");
    }
}
