// CacheHandler.java - Verifica cache
public class CacheHandler extends AbstractHandler {
    @Override
    public void process(Order order) {
        if (order.isCached()) {
            System.out.println("Pedido encontrado no cache.");
        } else {
            System.out.println("Pedido não encontrado no cache, processando...");
            super.process(order);
        }
    }
}
