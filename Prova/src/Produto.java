import java.util.ArrayList;
import java.util.List;

public class Produto {

    private List<Observador> observadores = new ArrayList<>();
    private int quant;

    private void enviarNot(){
       for(Observador x : observadores){
           x.update();
       }
    }

    public void addProduto(int quant){
        this.quant += quant;
        enviarNot();
    }

    public void subProduto(int quant){
        this.quant -= quant;
        enviarNot();
    }
    public String getQuant(){
       return quant + " produtos em estoque";
    }

    public void inscrever(Observador obs){
        observadores.add(obs);
    }

    public void desinscrever(Observador obs){
        observadores.remove(obs);
    }

}
