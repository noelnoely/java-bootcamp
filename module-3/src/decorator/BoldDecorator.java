package decorator;

public class BoldDecorator extends TextDecorator {
    public BoldDecorator(Text text) {
        super(text);
    }

    public String print() {
        return "*" + text.print() + "*";
    }
}

