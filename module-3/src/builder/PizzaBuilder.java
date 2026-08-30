package builder;

public class PizzaBuilder {
    private String size;
    private String dough = "thin";
    private String topping = "cheese";


    public PizzaBuilder size(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder dough(String dough) {
        this.dough = dough;
        return this;
    }

    public PizzaBuilder topping(String topping) {
        this.topping = topping;
        return this;
    }

    public Pizza build() {
        if (size == null) {
            throw new IllegalStateException("Size is required");
        }
        return new Pizza(size, dough, topping);
    }


}
