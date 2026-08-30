package decorator;

public class DecoratorApp {
    public static void main() {
        Text text = new PlainText("Hello");
        text = new BoldDecorator(text);
        text = new ItalicDecorator(text);

        System.out.println(text.print());
    }
}