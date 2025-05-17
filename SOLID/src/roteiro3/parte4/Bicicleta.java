package roteiro3.parte4;

public class Bicicleta extends VeiculoTransporte {

    public Bicicleta(double distancia) {
        super(distancia); // A distância não é relevante para bicicletas
    }
    
    @Override
    public double calcularTarifa() {
        return 0;
    }
}