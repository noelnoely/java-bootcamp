package builder;

public class BuilderApp {
    public static void main(){
        Pizza pizza = new PizzaBuilder()
                .size("Big")
                .dough("Thin")
                .topping("Margarita")
                .build();

        System.out.println(pizza);
    }
}
