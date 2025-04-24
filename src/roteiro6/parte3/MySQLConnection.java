package roteiro6.parte3;

public class MySQLConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("Conectando com o MySQL");
    }
}
