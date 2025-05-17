package roteiro1.parte3;

public class CardPlayer extends Player {
    public CardPlayer(String nome) {
        super(nome);
    }
    
    @Override
    public void definirTatica() {
        System.out.println(super.nome + " - É um jogador muito calmo");
    }
}