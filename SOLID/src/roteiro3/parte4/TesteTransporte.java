package roteiro3.parte4;

public class TesteTransporte {
    public static void main(String[] args) {
        VeiculoTransporte veiculo1 = new Onibus(5.00, 10.0);
        VeiculoTransporte veiculo2 = new Bicicleta(10.0); // Agora é um VeiculoTransporte válido 

        System.out.println("Tarifa Ônibus: R$ " + veiculo1.calcularTarifa());
        System.out.println("Distância Ônibus: " + veiculo1.getDistancia());
        System.out.println("Tarifa Bicicleta: R$ " + veiculo2.calcularTarifa());
        System.out.println("Distância Bicicleta: " + veiculo1.getDistancia());

        System.out.println("CALCULO DE CONSUMO DA VIAGEM");
        
        if (veiculo1 instanceof Onibus) {
            System.out.println("Consumo Veiculo 1: " + ((Onibus)veiculo1).calcularTotalCombustivel(12));
        } else {
            System.out.println("Veiculo 1: Não é um veículo motorizado");
        } 
    
        if (veiculo2 instanceof Onibus) {
            System.out.println("Consumo Veiculo 2: " + ((Onibus)veiculo2).calcularTotalCombustivel(12));
        } else {
            System.out.println("Veiculo 2: Não é um veículo motorizado");
        }
    }
}