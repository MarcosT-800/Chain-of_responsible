// AuthenticationHandler.java - Verifica autenticação
public class AuthenticationHandler extends AbstractHandler {
    @Override
    public void process(Order order) {
        if (order.isAuthenticated()) {
            System.out.println("Autenticação bem-sucedida.");
            super.process(order);
        } else {
            System.out.println("Falha na autenticação.");
        }
    }
}
