package strategy;

public class StrategyApp {
    public static void main() {
        VpnContext vpnContext = new VpnContext();

        vpnContext.setStrategy(new SecureVpnStrategy());
        vpnContext.connect("Sweden");

        vpnContext.setStrategy(new WifiVpnStrategy());
        vpnContext.connect("Denmark");

        vpnContext.setStrategy(new MobileVpnStrategy());
        vpnContext.connect("Norway");

    }
}
