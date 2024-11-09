// AbstractHandler.java - Classe base para os Handlers (opcional)
public abstract class AbstractHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void process(Order order) {
        if (nextHandler != null) {
            nextHandler.process(order);
        }
    }
}
