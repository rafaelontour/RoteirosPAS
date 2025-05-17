package roteiro3.parte4;

public class Fornecedor implements Observer {
    private String nome;
    private String email;
    private String telefone;
    private String cnpj;
    private NotificacaoStrategy estrategiaNotificacao; 

    public Fornecedor(String nome, String email, String cnpj, String telefone, NotificacaoStrategy estrategiaNotificacao) {
        this.nome = nome;
        this.email = email;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.estrategiaNotificacao = estrategiaNotificacao;
    }
    
    @Override
    public void update(String mensagem) {
        String destinatario = (estrategiaNotificacao instanceof NotificacaoEmail) ? email : telefone;

        StringBuilder mensagemFormatada = new StringBuilder();
        mensagemFormatada.append("---------------NOTIFICACAO " + getTipoObserver() + "------------------\n");
        mensagemFormatada.append("Notificação enviada para " + nome + " (" + destinatario + ")\n");
        mensagemFormatada.append(mensagem+"\n");
        mensagemFormatada.append("-----------------------------------------------------------------------\n");
        this.estrategiaNotificacao.enviarMensagem(destinatario, mensagemFormatada.toString());
    } 

    @Override
    public String getTipoObserver() {
        return "FORNECEDOR";
    } 
}