package roteiro3.parte1;

public class Bicicleta extends VeiculoTransporte {
    public Bicicleta() {
        super(0); // Bicicletas são gratuitas
    }
    
    @Override
    public double calcularTarifa() {
        throw new UnsupportedOperationException("Bicicletas não têm tarifa!");
    }
}