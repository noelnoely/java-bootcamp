package strategy;

public class MobileVpnStrategy implements VpnStrategy {
    @Override
    public void connect(String server) {
        System.out.println("Mobile VPN: connect to " + server);
    }
}
