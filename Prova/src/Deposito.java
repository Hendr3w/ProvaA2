public class Deposito extends Observador{
    public Deposito(Produto prod){
        this.prod = prod;
        this.prod.inscrever(this);
    }

    @Override
    void update() {
        System.out.println("Deposito recebeu uma notificação. Novo estado: " + prod.getQuant());
    }
}
