package roteiro2.parte3.interfaces;

import java.math.BigDecimal;

public interface EstrategiaFrete {
    BigDecimal calcularFreteComum(BigDecimal valor);
    BigDecimal calcularFreteExpresso(BigDecimal valor);
    BigDecimal calcularTotal(BigDecimal valor);
}