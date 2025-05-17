package roteiro1.parte5;

import java.math.BigDecimal;

import roteiro1.parte5.objetos_que_usam_estrategia.ComFreteComum;
import roteiro1.parte5.objetos_que_usam_estrategia.ComFreteExpresso;

public class Main {
    public static void main(String[] args) {
        ComFreteComum comFreteComum = new ComFreteComum();
        ComFreteExpresso comFreteExpresso = new ComFreteExpresso();

        PedidoMoveis pm = new PedidoMoveis("Helano Móveis", new BigDecimal("2500"), comFreteComum);  
        PedidoEletronicos pe = new PedidoEletronicos("Helano Eletro", new BigDecimal("4200"), comFreteComum);

        System.out.println("Setor: " + pm.getSetor() + " - Valor: R$" + pm.getValor());
        System.out.println("Frete comum: R$" + pm.calcularFreteComum());
        System.out.println(pm.calcularFreteExpresso());
        System.out.println("Total: R$" + pm.verTotalComFrete());

        System.out.println("****************** Mudando envio de frete para expresso ******************");
        pm.alterarEstrategiaFrete(comFreteExpresso);
        System.out.println("Setor: " + pm.getSetor() + " - Valor: R$" + pm.getValor());
        System.out.println(pm.calcularFreteComum());
        System.out.println("Frete expresso: R$" + pm.calcularFreteExpresso());
        System.out.println("Total: R$" + pm.verTotalComFrete());

        System.out.println("****************** Mudando envio de frete para comum ******************");
        pe.alterarEstrategiaFrete(comFreteComum);
        System.out.println("Setor: " + pe.getSetor() + " - Valor: R$" + pe.getValor());
        System.out.println("Frete comum: R$" + pe.calcularFreteComum());
        System.out.println(pe.calcularFreteExpresso());
        System.out.println("Total: R$" + pe.verTotalComFrete());

        System.out.println("****************** Mudando envio de frete para expresso ******************");
        pe.alterarEstrategiaFrete(comFreteExpresso);
        System.out.println("Setor: " + pe.getSetor() + " - Valor: R$" + pe.getValor());
        System.out.println(pe.calcularFreteComum());
        System.out.println("Frete expresso: R$" + pe.calcularFreteExpresso());
        System.out.println("Total: R$" + pe.verTotalComFrete());
    }
}
