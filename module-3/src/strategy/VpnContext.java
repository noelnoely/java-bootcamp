package strategy;

public class VpnContext {
    private VpnStrategy strategy;

    public void setStrategy(VpnStrategy strategy) {
        this.strategy = strategy;
    }

    public void connect(String server) {
        if (strategy == null) {
            System.out.println("Select the connection mode");
            return;
        }
        strategy.connect(server);
    }
}
