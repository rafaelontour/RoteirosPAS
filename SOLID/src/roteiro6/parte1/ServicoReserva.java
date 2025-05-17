package roteiro6.parte1;

public class ServicoReserva {
    private MySQLConnection connection;

    public ServicoReserva() {
        this.connection = new MySQLConnection();
    }
    
    public void criarReserva() {
        this.connection.connect();
        System.out.println("Lógica de negócio para Reserva do Quarto");
    }
}
