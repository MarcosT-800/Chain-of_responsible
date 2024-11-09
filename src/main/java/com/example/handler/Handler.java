// Handler.java - Interface para os Handlers
public interface Handler {
    void setNext(Handler handler);  // Define o próximo handler na corrente
    void process(Order order);      // Processa o pedido
}
