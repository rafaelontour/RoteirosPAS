package roteiro1.parte3;

public class ChessPlayer extends Player {
    public ChessPlayer(String nome) {
        super(nome);
    }
    
    @Override
    public void definirTatica() {
        System.out.println(super.nome + " - Domina o centro do tabuleiro");
    }

}