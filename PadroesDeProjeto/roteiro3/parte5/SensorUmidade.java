package roteiro3.parte5;

import java.util.ArrayList;
import java.util.List;

public class SensorUmidade implements ISensor {
    private float valor;
    private List<Observer> paineis = new ArrayList<>();
    
    public SensorUmidade(float valor) {
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
        if (!(valor >= 30)) {
            System.out.println("Umidade atualizada: " + valor + "%");
            return;
        }

        System.out.println("--->> ALERTA DE UMIDADE ALTA!! <<--- Umidade: " + this.valor + "%");
    }

    private void enviarMensagem() {
        for (Observer painel : paineis) {
            painel.receberMensagem(SensorUmidade.class, this.valor);
        }
    }
}
