package roteiro3.parte1;

public class Onibus extends VeiculoTransporte {
    public Onibus(double tarifaBase) {
        super(tarifaBase);
    }
    
    @Override
    public double calcularTarifa() {
        return tarifaBase * 1.2; // Aumenta 20% para longas distâncias
    }
}