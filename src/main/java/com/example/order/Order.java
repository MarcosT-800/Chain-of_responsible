// Order.java - Classe Pedido
public class Order {
    private boolean authenticated;
    private boolean valid;
    private boolean cached;
    private boolean fromBlockedIP;

    public Order(boolean authenticated, boolean valid, boolean cached, boolean fromBlockedIP) {
        this.authenticated = authenticated;
        this.valid = valid;
        this.cached = cached;
        this.fromBlockedIP = fromBlockedIP;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public boolean isValid() {
        return valid;
    }

    public boolean isCached() {
        return cached;
    }

    public boolean isFromBlockedIP() {
        return fromBlockedIP;
    }
}
