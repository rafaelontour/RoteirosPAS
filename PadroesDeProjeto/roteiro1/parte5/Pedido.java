package roteiro1.parte5;

import java.math.BigDecimal;

import roteiro1.parte5.interfaces.EstrategiaFrete;

public abstract class Pedido  { 
    private BigDecimal valor;
    private BigDecimal valorComFrete;
    private EstrategiaFrete estrategiaFrete;

    public Pedido(BigDecimal valor, EstrategiaFrete estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
        this.valor = valor;
        this.valorComFrete = this.estrategiaFrete.calcularTotal(this.valor);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void alterarEstrategiaFrete(EstrategiaFrete estrategiaFrete) {
        this.valorComFrete = estrategiaFrete.calcularTotal(this.valor);
        this.estrategiaFrete = estrategiaFrete;
    }

    public BigDecimal calcularFreteComum() {
        return estrategiaFrete.calcularFreteComum(this.valor);
    }

    public BigDecimal calcularFreteExpresso() {
        return estrategiaFrete.calcularFreteExpresso(this.valor);
    }

    public BigDecimal verTotalComFrete() {
        return this.valorComFrete;
    }
}
