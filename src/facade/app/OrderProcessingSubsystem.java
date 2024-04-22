package facade.app;

// Subsistema para procesar pedidos
class OrderProcessingSubsystem {
    public void processOrder(String orderId) {
        System.out.println("Procesando pedido con ID: " + orderId);
    }

    public void cancelOrder(String orderId) {
        System.out.println("Cancelando pedido con ID: " + orderId);
    }
}