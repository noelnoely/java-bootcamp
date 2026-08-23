import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Laptop");
        Order order = new Order(1L, "Nuri", 1500, items);
        items.add("Smartphone");
        System.out.println("Products: " + order.getProducts());
        Order newOrder = order.addProduct("Monitor", 3000);
        System.out.println("Products: " + newOrder.getProducts());
        try {
            order.getProducts().add("Tablet");
        } catch (UnsupportedOperationException e) {
            System.out.println("You cannot add items to a finalized order.");
        }
    }
}