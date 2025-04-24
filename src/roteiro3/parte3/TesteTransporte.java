package roteiro3.parte3;

public class TesteTransporte {
    public static void main(String[] args) {
        VeiculoTransporte veiculo1 = new Onibus(5.00, 10.0);
        VeiculoTransporte veiculo2 = new Bicicleta(10.0); // Agora é um VeiculoTransporte válido

        System.out.println("Tarifa Ônibus: R$ " + veiculo1.calcularTarifa());
        System.out.println("Distância Ônibus: " + veiculo1.getDistancia());
        System.out.println("Consumo Total Ônibus: " + veiculo1.calcularTotalCombustivel(12));
        
        System.out.println("Tarifa Bicicleta: R$ " + veiculo2.calcularTarifa());
        System.out.println("Distância Bicicleta: " + veiculo1.getDistancia());
        System.out.println("Consumo Total Bicicleta: " + veiculo2.calcularTotalCombustivel(12));
    }
}