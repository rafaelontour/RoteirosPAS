package roteiro3.parte5;

import java.util.ArrayList;
import java.util.List;

public class Painel implements Observer {
    private List<ISensor> sensores;

    public Painel() {
        this.sensores = new ArrayList<>();
    }

    public void adicionarSensor(ISensor sensor) {
        this.sensores.add(sensor);
    }

    public void removerSensor(ISensor sensor) {
        this.sensores.remove(sensor);
    }

    @Override
    public void receberMensagem(Class<?> classe, float valor) {
        for (ISensor sensor : sensores) {
            if (classe.isInstance(sensor)) {
                sensor.imprimirInfo(valor);
            }
        }
        
    }
}