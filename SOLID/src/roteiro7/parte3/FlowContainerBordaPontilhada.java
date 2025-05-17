package roteiro7.parte3;

import java.util.ArrayList;

public class FlowContainerBordaPontilhada extends FlowContainer {
    
    public FlowContainerBordaPontilhada(ArrayList<String> elements) {
        super();
    }

    @Override
    public void doLayout() {
        System.out.println("O Container utilizado é FlowContainerBordaSolida");
        System.out.println("Este container contém uma borda sólida");
        System.out.println("Estes são os elementos presentes no container ");
        System.out.println(super.elements);
        System.out.println("Usando o método dispose como herança para fechar o container");
        this.dispose();
        System.out.println("-------------------------");
    }
}
