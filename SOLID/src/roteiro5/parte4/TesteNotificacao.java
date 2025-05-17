package roteiro5.parte4;

public class TesteNotificacao {
    public static void main(String[] args) {
        Notificacao email = new NotificacaoEmail(); Notificacao sms = new NotificacaoSMS();
        Notificacao push = new NotificacaoPush();
        Notificacao whatsapp = new NotificacaoWhatsApp();

        NotificacaoService serviceEmail = new NotificacaoService(email);
        NotificacaoService serviceSms = new NotificacaoService(sms);
        NotificacaoService servicePush = new NotificacaoService(push);
        NotificacaoService serviceWhatsapp = new NotificacaoService(whatsapp);

        
        serviceEmail.enviarNotificacao("Bem-vindo ao sistema!");
        serviceSms.enviarNotificacao("Seu código de verificação é 1234.");
        servicePush.enviarNotificacao(" Vocé tem uma nova mensagem.");
        serviceWhatsapp.enviarNotificacao("Vocé tem uma nova mensagem.");
    }
}