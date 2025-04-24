package roteiro3.parte3;

public class Onibus extends VeiculoTransporte {
    private final double tarifaBaseOnibus;
    private double consumoPorKm;
    public Onibus(double tarifaBaseOnibus, double distancia) {
        super(distancia); // Chama o construtor da classe pai
        this.tarifaBaseOnibus = tarifaBaseOnibus;
    }
    
    @Override
    public double calcularTarifa() {
        return tarifaBaseOnibus * 1.2; // Aumenta 20% para longas distâncias
    }

    @Override
    public double calcularTotalCombustivel(double consumoPorkm) {
        this.consumoPorKm = consumoPorkm;
        return getDistancia() * consumoPorKm; // Consumo total de combustível
    }
}