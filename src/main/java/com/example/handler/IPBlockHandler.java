// IPBlockHandler.java - Bloqueia IPs com falhas repetidas
public class IPBlockHandler extends AbstractHandler {
    @Override
    public void process(Order order) {
        if (order.isFromBlockedIP()) {
            System.out.println("IP bloqueado devido a falhas repetidas.");
        } else {
            System.out.println("IP não está bloqueado.");
            super.process(order);
        }
    }
}
