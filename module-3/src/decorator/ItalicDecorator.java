package decorator;

public class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(Text text) {
        super(text);
    }

    public String print() {
        return "_" + text.print() + "_";
    }
}