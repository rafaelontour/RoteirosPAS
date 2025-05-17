package roteiro3.parte4;

public abstract class VeiculoTransporte {
    private double distancia;
    
    public VeiculoTransporte(double distancia) {
        this.distancia = distancia;
    }

    public double getDistancia() {
        return distancia;
    }
    
    public abstract double calcularTarifa();
}