package facade.app;

// Subsistema para gestionar carritos de compra
public class ShoppingCartSubsystem {
    public void addToCart(String productName, int quantity) {
        System.out.println("Añadiendo " + quantity + " unidades del producto '" + productName + "' al carrito.");
    }

    public void removeFromCart(String productName, int quantity) {
        System.out.println("Quitando " + quantity + " unidades del producto '" + productName + "' del carrito.");
    }

    public void viewCart() {
        System.out.println("Viendo contenido del carrito.");
    }
}