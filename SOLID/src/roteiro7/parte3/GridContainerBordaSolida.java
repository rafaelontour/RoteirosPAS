package roteiro7.parte3;

import java.util.Arrays;

public class GridContainerBordaSolida extends GridContainer {
    
    public GridContainerBordaSolida() {
        super();
    }
    
    @Override
    public void doLayout() {
        System.out.println("O Container utilizado é o GridContainer");
        System.out.println("Este container contêm bordas solidas");
        System.out.println("Estes são os elementos presentes no container");
        System.out.println(Arrays.toString(super.elements));
        System.out.println("Usando o método dispose como herança para fechar o container");
        this.dispose();
        System.out.println("--------------------------------");
    }
}