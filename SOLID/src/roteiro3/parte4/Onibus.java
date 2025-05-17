package roteiro3.parte4;

public class Onibus extends VeiculoTransporte implements VeiculoMotorizado {
    private final double tarifaBaseOnibus;
    private double consumoPorKm; // Consumo de combustível por km

    public Onibus(double tarifaBaseOnibus, double distancia) {
        super(distancia); // Chama o construtor da classe pai
        this.tarifaBaseOnibus = tarifaBaseOnibus;
    }
    
    @Override
    public double calcularTarifa() {
        return tarifaBaseOnibus * 1.2; // Aumenta 20% para longas distâncias
    }

    @Override
    public double calcularTotalCombustivel(double consumoPorKm) {
        this.consumoPorKm = consumoPorKm; // Define o consumo de combustível por km
        return getDistancia() * consumoPorKm; // Consumo total de combustível
    }
}