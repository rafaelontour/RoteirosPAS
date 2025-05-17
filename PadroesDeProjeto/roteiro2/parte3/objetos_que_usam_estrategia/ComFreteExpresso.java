package roteiro2.parte3.objetos_que_usam_estrategia;

import java.math.BigDecimal;
import java.math.RoundingMode;

import roteiro1.parte5.interfaces.EstrategiaFrete;

public class ComFreteExpresso implements EstrategiaFrete {

    @Override
    public BigDecimal calcularFreteExpresso(BigDecimal valor) {
        return valor.multiply(new BigDecimal("0.10")).setScale(2, RoundingMode.UP);
    }

    @Override
    public BigDecimal calcularFreteComum(BigDecimal valor) {
        System.out.print("Frete comum indisponivel para essse pedido -> R$");
        return BigDecimal.ZERO;
    }

    @Override
    public BigDecimal calcularTotal(BigDecimal valor) {
        return valor.add(calcularFreteExpresso(valor));
    }
    
}
