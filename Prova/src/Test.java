public class Test {
    public static void main(String[] args) {

        Produto prod = new Produto();
        Deposito dep = new Deposito(prod);
        Gerencia ger = new Gerencia(prod);

        System.out.println("Antes da alteração de estado");
        prod.addProduto(5);
        System.out.println("Depois");






    }
}