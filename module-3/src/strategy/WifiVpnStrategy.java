package strategy;

public class WifiVpnStrategy implements VpnStrategy{
    @Override
    public void connect(String server) {
        System.out.println("Wi-Fi VPN: connect to " + server);
    }
}
