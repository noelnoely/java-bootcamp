package decorator;

public abstract class TextDecorator implements Text {
    protected final Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }
}