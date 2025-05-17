package roteiro3.parte4;

public class Cliente implements Observer {
    private String nome;
    private String email;
    private String telefone;
    private NotificacaoStrategy estrategiaNotificacao; 
    
    public Cliente(String nome, String email, String telefone, NotificacaoStrategy estrategiaNotificacao) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.estrategiaNotificacao = estrategiaNotificacao;
    }
    
    @Override
    public void update(String mensagem) {
        System.out.println("----------- NOTIFICACAO CLIENTE --------------------------------");
        System.out.println("Email enviado para " + nome + " (" + email + ")");
        System.out.println("Mensagem: " + mensagem);
        System.out.println("-------------------------------------------");
    }

    @Override
    public String getTipoObserver() {
        return "CLIENTE";
    } 
} 