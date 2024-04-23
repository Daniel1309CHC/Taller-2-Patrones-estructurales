package facade.app;

// Subsistema para gestionar clientes
class Customer {
    public void registerCustomer(String name, String email, String address) {
        System.out.println("Registrando cliente: " + name + " - Email: " + email + " - Dirección: " + address);
    }

    public void updateCustomerAddress(String email, String newAddress) {
        System.out.println("Actualizando dirección del cliente con email '" + email + "' a: " + newAddress);
    }
}