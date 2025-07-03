import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalAmount() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }
}

public class ECommerceApp {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 75000);
        Product p2 = new Product("Mouse", 500);
        Product p3 = new Product("Keyboard", 1500);

        Order order1 = new Order(1);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order(2);
        order2.addProduct(p3);

        Customer customer = new Customer("Ravi");
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        System.out.println("Customer: " + customer.getName());
        for (Order order : customer.getOrders()) {
            System.out.println("Order ID: " + order.getOrderId());
            for (Product product : order.getProducts()) {
                System.out.println("- " + product.getName() + ": ₹" + product.getPrice());
            }
            System.out.println("Total: ₹" + order.getTotalAmount());
        }
    }
}
