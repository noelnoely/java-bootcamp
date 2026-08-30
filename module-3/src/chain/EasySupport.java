package chain;

public class EasySupport extends Support {
    protected boolean canHandle(int level) {
        return level == 1;
    }

    protected void process(int level) {
        System.out.println("Junior helped");
    }
}