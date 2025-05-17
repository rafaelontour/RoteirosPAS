package roteiro3.parte5;

import java.util.ArrayList;
import java.util.List;

public class SensorPressao implements ISensor {
    private float valor;
    private List<Observer> paineis = new ArrayList<>();
    
    public SensorPressao(float valor) {
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
        if (!(valor >= 100)) {
            System.out.println("Pressão atualizada: " + valor + "Pa");
            return;
        }

        System.out.println("--->> ALERTA DE PRESSÃO ALTA!! <<--- Pressão: " + this.valor + "Pa");
    }

    private void enviarMensagem() {
        for (Observer painel : paineis) {
            painel.receberMensagem(SensorPressao.class, this.valor);
        }
    }
}
