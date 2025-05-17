package roteiro6.parte3;

public class TesteConexao {
    public static void main(String[] args) {
        Connection connection = new MySQLConnection();
        ServicoQuarto quarto  = new ServicoQuarto(connection);
        quarto.verificarQuarto();

        ServicoReserva reserva = new ServicoReserva(connection);
        reserva.criarReserva();
        
        RelatorioReserva relatorio = new RelatorioReserva(connection);
        relatorio.gerarRelatorio();
    }
}