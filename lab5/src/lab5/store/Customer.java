package lab5.store;

public class Customer {
    private CustomerState customerState;
    private int customerID;
    
    public static enum CustomerState{
    	INQUEUE,INSTORE,NEGLECTED,PAYING,ALIVE,DEAD
    }
  /* private int inQueue = 0;
    private int inStore = 1;
    private int neglected = 2;
    private int paying = 3;
    private int alive = 4;
    private int dead = 5;*/
    
    
    public Customer(int id) {
        this.customerID = id;
        this.customerState=CustomerState.ALIVE;
    }

    public void setState(int id){
        
    }

    public int getID() {
        return customerID;
    }
    public void changeState(CustomerState index) {
        this.customerState = index;
    }
    public CustomerState getState(){
        return customerState;
    }

    
}
