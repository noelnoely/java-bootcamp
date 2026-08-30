package strategy;

public class SecureVpnStrategy implements VpnStrategy {
    @Override
    public void connect(String server) {
        System.out.println("Secure VPN: connect to " + server);
    }
}
