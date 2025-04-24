package roteiro5.parte2;

public class NotificacaoPush implements Notificacao {
    public void enviar(String mensagem) {
        System.out.println("Enviando Push Notification: " + mensagem);
    }
}
