package roteiro3.parte5;

import java.util.ArrayList;
import java.util.List;

public class SensorTemperatura implements ISensor {
    private float valor;
    private List<Observer> paineis = new ArrayList<>();
    
    public SensorTemperatura(float valor) {
        this.valor = valor;

        this.enviarMensagem();
    }

    @Override
    public void atualizarValor(float valor) {
        this.valor = valor;
        this.enviarMensagem();
    }

    @Override
    public void adicionarPainel(Painel painel) {
        this.paineis.add(painel);
    }

    @Override
    public void imprimirInfo(float valor) {
        if (!(valor >= 40)) {
            System.out.println("Temperatura atualizada: " + valor + "º");
            return;
        }

        System.out.println("--->> ALERTA DE TEMPERATURA ALTA!! <<--- Temperatura: " + this.valor + "º");
    }

    private void enviarMensagem() {
        for (Observer painel : paineis) {
            painel.receberMensagem(SensorTemperatura.class, this.valor);
        }
    }
}
