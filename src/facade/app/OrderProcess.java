package facade.app;

// Subsistema para procesar pedidos
class OrderProcess {
    public void processOrder(String orderId) {
        System.out.println("Pedido procesado con ID: " + orderId);
    }

    public void cancelOrder(String orderId) {
        System.out.println("Cancelando pedido con ID: " + orderId);
    }
}