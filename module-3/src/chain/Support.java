package chain;

public abstract class Support {
    private Support next;

    public Support linkWith(Support next) {
        this.next = next;
        return next;
    }

    public void handle(int level) {
        if (canHandle(level)) {
            process(level);
        } else if (next != null) {
            next.handle(level);
        } else {
            System.out.println("No one can help");
        }
    }

    protected abstract boolean canHandle(int level);

    protected abstract void process(int level);
}