// ValidationHandler.java - Valida dados do pedido
public class ValidationHandler extends AbstractHandler {
    @Override
    public void process(Order order) {
        if (order.isValid()) {
            System.out.println("Pedido validado com sucesso.");
            super.process(order);
        } else {
            System.out.println("Falha na validação do pedido.");
        }
    }
}
