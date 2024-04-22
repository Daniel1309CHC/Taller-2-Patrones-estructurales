package facade;

import facade.app.OrderManager;

public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();


        // Agregar productos al inventario
        orderManager.addProductToInventory("Pc", 999.99, 5);
        orderManager.addProductToInventory("Movil", 599.99, 10);

        // Registrar nuevos clientes
        orderManager.registerCustomer("Juan Perez", "juan@email.com", "Direccion 1");
        orderManager.registerCustomer("Santiago Martinez", "santiago@email.com", "Direccion 2");

        // Actualizar la dirección del cliente
        orderManager.updateCustomerAddress("juan@email.com", "Direcccion actualizada");

        // Agregar productos al carrito de compra
        orderManager.addToCart("Pc", 2);
        orderManager.addToCart("Movil", 3);

        // Ver el carrito de compra
        orderManager.viewCart();

        // Eliminar productos del carrito de compra
        orderManager.removeFromCart("Movil", 1);

        // Eliminar del inventario
        orderManager.removeProductFromInventory("Movil",2);

        // Procesar el pedido
        orderManager.processOrder("123456");

        // Cancelar el pedido
        orderManager.cancelOrder("654321");
    }
}