package roteiro2.parte3;

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

        this.templateMethod(this);
    }

    public EstrategiaFrete getEstrategiaFrete() {
        return estrategiaFrete;
    }

    public abstract BigDecimal calcularFreteComum();

    public abstract BigDecimal calcularFreteExpresso();

    public abstract void imprimirDados();

    public BigDecimal verTotalComFrete() {
        return this.valorComFrete;
    }

    public void templateMethod(Pedido p) {
        this.imprimirDados();
    }
}
