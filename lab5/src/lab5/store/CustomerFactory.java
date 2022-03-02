package lab5.store;

public class CustomerFactory {
    private int createdCustomers = 0;

    public Customer spawnCustomer(){
        Customer customer = new Customer(createdCustomers);
        createdCustomers += 1;
        return customer;
    }
}
