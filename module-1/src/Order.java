import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Order {
    private final Long id;
    private final String customerName;
    private final double amount;
    private final List<String> products;

    public Order(Long id, String customerName, double amount, List<String> products) {
        this.id = id;
        this.customerName = customerName;
        this.amount = amount;
        this.products = products == null ? List.of() : List.copyOf(products);
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }

    public List<String> getProducts() {
        return this.products;
    }

    public Order addProduct(String newProduct, double productPrice) {
        List<String> updatedProducts = new ArrayList<>(this.products);
        updatedProducts.add(newProduct);
        double newAmount = this.amount + productPrice;
        return new Order(this.id, this.customerName, newAmount, updatedProducts);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", amount=" + amount +
                ", products=" + products +
                '}';
    }
}
