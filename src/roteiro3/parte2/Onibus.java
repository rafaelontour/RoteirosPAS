package roteiro3.parte2;

public class Onibus extends VeiculoTransporte {
    private final double tarifaBaseOnibus;
    public Onibus(double tarifaBaseOnibus) {
        this.tarifaBaseOnibus = tarifaBaseOnibus;
    }
    
    @Override
    public double calcularTarifa() {
        return tarifaBaseOnibus * 1.2; // Aumenta 20% para longas distâncias
    }
}