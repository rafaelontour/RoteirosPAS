package roteiro1.parte5;

import java.math.BigDecimal;

import roteiro1.parte5.interfaces.EstrategiaFrete;

public class PedidoMoveis extends Pedido {
    private String setor;

    public PedidoMoveis(String setor, BigDecimal valor, EstrategiaFrete estrategiaFrete) {
        super(valor, estrategiaFrete);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
