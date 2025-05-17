package roteiro2.parte3;

import java.math.BigDecimal;

import roteiro2.parte3.objetos_que_usam_estrategia.ComFreteComum;
import roteiro2.parte3.objetos_que_usam_estrategia.ComFreteExpresso;

public class Main {
    public static void main(String[] args) {
        ComFreteComum comFreteComum = new ComFreteComum();
        ComFreteExpresso comFreteExpresso = new ComFreteExpresso();

        PedidoMoveis pm = new PedidoMoveis("Helano Móveis", new BigDecimal("2500"), comFreteComum);  
        PedidoEletronicos pe = new PedidoEletronicos("Helano Eletro", new BigDecimal("4200"), comFreteComum);

        System.out.println("****************** Mudando envio de frete para expresso ******************");
        pm.alterarEstrategiaFrete(comFreteExpresso);

        System.out.println("****************** Mudando envio de frete para comum ******************");
        pm.alterarEstrategiaFrete(comFreteComum);

        System.out.println("****************** Mudando envio de frete para comum ******************");
        pe.alterarEstrategiaFrete(comFreteComum);
        
        System.out.println("****************** Mudando envio de frete para expresso ******************");
        pe.alterarEstrategiaFrete(comFreteExpresso);

    }
}