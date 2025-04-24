package roteiro6.parte3;

public class ServicoReserva {
    private final Connection connection;

    public ServicoReserva(Connection c) {
        this.connection = c;
    }
    
    public void criarReserva() {
        this.connection.connect();
        System.out.println("Lógica de negócio para Reserva do Quarto");
    }
}
