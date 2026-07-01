import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String status;
    private List<Observer> observers = new ArrayList<>();

    public void adicionarObserver(Observer observer){
        observers.add(observer);
    }

    public void removerObserver(Observer observer){
        observers.remove(observer);
    }

    public void notificarObservers(){
        for (Observer o : observers){
            o.update(this);
        }
    }

    public void setStatusPedido(String status) {
        this.status = status;
        notificarObservers();
    }

    public String getStatus() {
        return status;
    }
}
