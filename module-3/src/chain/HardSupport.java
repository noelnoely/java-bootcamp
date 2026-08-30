package chain;

public class HardSupport extends Support {
    protected boolean canHandle(int level) {
        return level == 2;
    }

    protected void process(int level) {
        System.out.println("Senior helped");
    }
}