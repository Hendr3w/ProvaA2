public class Gerencia extends Observador{

    public Gerencia(Produto prod){
        this.prod = prod;
        this.prod.inscrever(this);
    }

    @Override
    void update() {
        System.out.println("Gerencia Recebeu uma notificação. Novo estado: " + prod.getQuant());
    }
}
