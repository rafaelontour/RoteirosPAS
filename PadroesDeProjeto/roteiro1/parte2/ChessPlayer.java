package roteiro1.parte2;

public class ChessPlayer extends Player {
    public ChessPlayer(String nome) {
        super(nome);
    }
    
    @Override
    public void definirTatica() {
        System.out.println(super.nome + " - Domina o centro do tabuleiro");
    }

    @Override
    public void correr() {
        System.out.println(super.nome + " - Não Corre ! Ele pensa !");
    }
}