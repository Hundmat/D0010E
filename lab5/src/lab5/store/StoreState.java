package lab5.store;
import lab5.random.*;

public class StoreState {

    //Private dynamic variables
    private int activeCashiers, 
    neglectedCustomers, 
    currentCustomers;
    


    
    
    //Private static variables
    private static int cashiers, 
    maxCustomersInStore, 
    customerSpeed, 
    cashierSpeed,
    customersPerHour;

    /**
     * @param timeOpen How long time the store has open
     * @param seed takes a seed from driver 
     * @param cashiers parameter for changing number of cashiers in store
     * @param maxCustomersInStore parameter for chaning the max count of persons in store
     * @param customerArrivalRate how many customers per hour
     * @param cashierSlow How long time the slowest cashier can do one customer
     * @param cashierFast -//- fast a cashier can do one customer
     * @param cashierSlow How much time the slowest customer takes
     * @param cashierFast -//- fastest customer
     */



    public StoreState(
    int seed,
    int timeOpen,
    int cashiers,
    int maxCustomersInStore,
    int customersPerHour,
    int cashierSlow,
    int cashierFast,
    int customerSlow,
    int customerFast) {

        //Creating the static variables from parameters
        this.cashiers = cashiers;
        this.maxCustomersInStore = maxCustomersInStore;
        this.cashierSpeed = (cashierFast-cashierSlow)/2;

        UniformRandomStream customerArrivalRate = new UniformRandomStream(customerSlow,customerFast,seed);
        



    }

    //public nextCustomerArrivalRate(){

        
    
    public int getActiveCashiers(){
        return activeCashiers;
    }
    public int getCustomerArrivalRate(){
        return customerArrivalRate;
    }
    public int getNeglectedCustomers(){
        return neglectedCustomers;
    }
    public int currentCustomers(){
        return currentCustomers;
    }

}
