package facade.app;

// Subsistema para gestionar productos
class ProductSubsystem {
    public void addProductToInventory(String productName, double price, int quantity) {
        System.out.println("Añadiendo " + quantity + " unidades del producto '" + productName + "' al inventario. Precio: $" + price);
    }

    public void removeProductFromInventory(String productName, int quantity) {
        System.out.println("Quitando " + quantity + " unidades del producto '" + productName + "' del inventario.");
    }
}