package roteiro1.parte2;

public class SoccerPlayer extends Player {
    public SoccerPlayer(String nome) {
        super(nome);
    }
    
    @Override
    public void definirTatica() {
        System.out.println(super.nome + " Trabalha em equipe !");
    }

    
}