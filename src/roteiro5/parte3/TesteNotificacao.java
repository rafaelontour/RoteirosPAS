package roteiro5.parte3;

public class TesteNotificacao {
    public static void main(String[] args) {
        Notificacao email = new NotificacaoEmail(); Notificacao sms = new NotificacaoSMS();
        Notificacao push = new NotificacaoPush();
        
        email.enviar("Bem-vindo ao sistema!");
        sms.enviar("Seu código de verificação é 1234.");
        push.enviar("Você tem uma nova mensagem.");
    }
}