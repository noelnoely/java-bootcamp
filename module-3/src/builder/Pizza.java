package builder;

public class Pizza {
    private final String size;
    private final String dough;
    private final String topping;

    public Pizza(String size, String dough, String topping) {
        this.size = size;
        this.dough = dough;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", dough='" + dough + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}
