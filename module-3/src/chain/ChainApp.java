package chain;

public class ChainApp {
    public static void main() {
        Support junior = new EasySupport();
        Support senior = new HardSupport();

        junior.linkWith(senior);

        junior.handle(1);
        junior.handle(2);
        junior.handle(3);
    }
}