package roteiro2.parte3;

import java.math.BigDecimal;
import java.math.RoundingMode;

import roteiro1.parte5.interfaces.EstrategiaFrete;
import roteiro1.parte5.objetos_que_usam_estrategia.ComFreteComum;
import roteiro2.parte3.objetos_que_usam_estrategia.ComFreteExpresso;

public class PedidoEletronicos extends Pedido {
    private String setor;

    public PedidoEletronicos(String setor, BigDecimal valor, EstrategiaFrete estrategiaFrete) {
        super(valor, estrategiaFrete);
        this.setor = setor;
    }

    @Override
    public BigDecimal calcularFreteComum() {
        if (!(this.getEstrategiaFrete() instanceof ComFreteComum)) {
            System.out.println("Frete comum indisponivel para essse pedido -> R$0");
            return new BigDecimal("0");
        }

        return this.getValor().multiply(new BigDecimal(0.05)).setScale(2, RoundingMode.UP);
    }

    @Override
    public BigDecimal calcularFreteExpresso() {

        if (!(this.getEstrategiaFrete() instanceof ComFreteExpresso)) {
            System.out.println("Frete expresso indisponivel para essse pedido -> R$0");
            return new BigDecimal("0");
        }

        return this.getValor().multiply(new BigDecimal("0.10")).setScale(2, RoundingMode.UP);
    }

    @Override
    public void imprimirDados() {
        System.out.println("Setor: " + this.getSetor() + " - Valor: R$" + this.getValor());
        System.out.println("Frete comum: R$" + this.calcularFreteComum());
        System.out.println(this.calcularFreteExpresso());
        System.out.println("Total: R$" + this.verTotalComFrete());
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
