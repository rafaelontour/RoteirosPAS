package roteiro7.parte3;

public class GridContainerBordaPontilhada extends GridContainer {

    public GridContainerBordaPontilhada(int lineMax, int ColumnMax) {
        super(lineMax, ColumnMax);

    }

    @Override 
    public void doLayout() {
        System.out.println("O Container utilizado é GridContainer");
        System.out.println("Este container contém uma borda pontilhada");
        System.out.println("Estes são os elementos presentes no container ");
        System.out.println("Arrays.deepToString(elements)");
        System.out.println("Usando o método dispose como herança para fechar o container");
        this.dispose();
        System.out.println("-------------------------");
    }
}