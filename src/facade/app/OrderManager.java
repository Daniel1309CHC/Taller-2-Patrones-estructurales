package facade.app;

// Fachada para el sistema de gestión de pedidos
public class OrderManager {
    private Product product;
    private Customer customer;
    private ShoppingCart shoppingCar;
    private OrderProcess orderProcess;

    public OrderManager() {
        this.product = new Product();
        this.customer = new Customer();
        this.shoppingCar = new ShoppingCart();
        this.orderProcess = new OrderProcess();
    }

    // Métodos para gestionar productos
    public void addProductToInventory(String productName, double price, int quantity) {
        product.addProductToInventory(productName, price, quantity);
    }

    public void removeProductFromInventory(String productName, int quantity) {
        product.removeProductFromInventory(productName, quantity);
    }

    // Métodos para gestionar clientes
    public void registerCustomer(String name, String email, String address) {
        customer.registerCustomer(name, email, address);
    }

    public void updateCustomerAddress(String email, String newAddress) {
        customer.updateCustomerAddress(email, newAddress);
    }

    // Métodos para manejar el carrito de compra
    public void addToCart(String productName, int quantity) {
        shoppingCar.addToCart(productName, quantity);
    }

    public void removeFromCart(String productName, int quantity) {
        shoppingCar.removeFromCart(productName, quantity);
    }

    public void viewCart() {
        shoppingCar.viewCart();
    }

    // Métodos para procesar pedidos
    public void processOrder(String orderId) {
        orderProcess.processOrder(orderId);
    }

    public void cancelOrder(String orderId) {
        orderProcess.cancelOrder(orderId);
    }
}
