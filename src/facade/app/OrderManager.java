package facade.app;

// Fachada para el sistema de gestión de pedidos
public class OrderManager {
    private Product productSubsystem;
    private Customer customerSubsystem;
    private ShoppingCart shoppingCartSubsystem;
    private OrderProcess orderProcessingSubsystem;

    public OrderManager() {
        this.productSubsystem = new Product();
        this.customerSubsystem = new Customer();
        this.shoppingCartSubsystem = new ShoppingCart();
        this.orderProcessingSubsystem = new OrderProcess();
    }

    // Métodos para gestionar productos
    public void addProductToInventory(String productName, double price, int quantity) {
        productSubsystem.addProductToInventory(productName, price, quantity);
    }

    public void removeProductFromInventory(String productName, int quantity) {
        productSubsystem.removeProductFromInventory(productName, quantity);
    }

    // Métodos para gestionar clientes
    public void registerCustomer(String name, String email, String address) {
        customerSubsystem.registerCustomer(name, email, address);
    }

    public void updateCustomerAddress(String email, String newAddress) {
        customerSubsystem.updateCustomerAddress(email, newAddress);
    }

    // Métodos para manejar el carrito de compra
    public void addToCart(String productName, int quantity) {
        shoppingCartSubsystem.addToCart(productName, quantity);
    }

    public void removeFromCart(String productName, int quantity) {
        shoppingCartSubsystem.removeFromCart(productName, quantity);
    }

    public void viewCart() {
        shoppingCartSubsystem.viewCart();
    }

    // Métodos para procesar pedidos
    public void processOrder(String orderId) {
        orderProcessingSubsystem.processOrder(orderId);
    }

    public void cancelOrder(String orderId) {
        orderProcessingSubsystem.cancelOrder(orderId);
    }
}
