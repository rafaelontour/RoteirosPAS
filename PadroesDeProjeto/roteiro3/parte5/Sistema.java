package roteiro3.parte5;

public class Sistema {
    public static void main(String[] args) {
        Painel painel = new Painel();
        ISensor sensorUmidade = new SensorUmidade(0);
        painel.adicionarSensor(sensorUmidade);
        sensorUmidade.adicionarPainel(painel);
        sensorUmidade.atualizarValor(10);
        sensorUmidade.atualizarValor(20);
        sensorUmidade.atualizarValor(25);
        sensorUmidade.atualizarValor(29);
        sensorUmidade.atualizarValor(30);
        sensorUmidade.atualizarValor(33);

        System.out.println("***********************************");

        SensorTemperatura sensorTemperatura = new SensorTemperatura(0);
        painel.adicionarSensor(sensorTemperatura);
        sensorTemperatura.adicionarPainel(painel);
        sensorTemperatura.atualizarValor(10);
        sensorTemperatura.atualizarValor(20);
        sensorTemperatura.atualizarValor(25);
        sensorTemperatura.atualizarValor(29);
        sensorTemperatura.atualizarValor(30);
        sensorTemperatura.atualizarValor(40);

        System.out.println("***********************************");

        SensorPressao sensorPressao = new SensorPressao(0);
        painel.adicionarSensor(sensorPressao);
        sensorPressao.adicionarPainel(painel);
        sensorPressao.atualizarValor(10);
        sensorPressao.atualizarValor(20);
        sensorPressao.atualizarValor(25);
        sensorPressao.atualizarValor(70);
        sensorPressao.atualizarValor(110);
        sensorPressao.atualizarValor(100);
    }
}
