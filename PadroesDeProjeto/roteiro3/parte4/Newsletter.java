package roteiro3.parte4;

import java.util.ArrayList;

public class Newsletter {
    private ArrayList<Observer> observers;
    public Newsletter() {
        this.observers = new ArrayList<>();
    }
    
    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void removerCliente(Observer observer) {
        observers.remove(observer);
    }
    
    public void enviarMensagem(String mensagem) {
        for (Observer observer : observers) {
            observer.update(mensagem);
        }
    }
} 