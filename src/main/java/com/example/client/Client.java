// Client.java - Código Cliente
public class Client {
    public static void main(String[] args) {
        // Criando o pedido
        Order order = new Order(true, true, false, false);

        // Criando os handlers
        Handler authHandler = new AuthenticationHandler();
        Handler validationHandler = new ValidationHandler();
        Handler cacheHandler = new CacheHandler();
        Handler ipBlockHandler = new IPBlockHandler();

        // Definindo a corrente de responsabilidade
        authHandler.setNext(validationHandler);
        validationHandler.setNext(cacheHandler);
        cacheHandler.setNext(ipBlockHandler);

        // Enviando o pedido para a corrente
        authHandler.process(order);
    }
}
