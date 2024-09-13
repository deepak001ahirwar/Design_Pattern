package com.design.pattern.solidPrinciples;

public class InterfaceSegmented {

    /**Interface Segmented Priciple
     *
     * Interface should be such that client should not implement
     * the unnesscery function that they do not need
     *
     * Solution :  break the functionalty in small Interface
     **/
    public static void main(String[] args) {

    }
}

// Bad code Example
interface RestaurantEmployee {
    void bashDish();
    void servedCustomers();
    void makeFood();
}

class Waiter implements RestaurantEmployee {
    @Override
    public void bashDish() {
        // not appyed here
    }
    @Override
    public void servedCustomers() {
        System.out.println("Serve customers");
    }
    @Override
    public void makeFood() {
        // not applyed here
    }



    // Good code Example for

    interface WaiterOperations {
        void servedCustomers();
        void takeOrder();
    }

    interface ChefOperations {
        void makeFood();
        void cookDish();
    }

    class Waiter2 implements WaiterOperations {
        @Override
        public void servedCustomers() {
            System.out.println("Serve customers");
        }
        @Override
        public void takeOrder() {
            System.out.println( " Take order ");
        }
    }

    class Chef implements ChefOperations {
        @Override
        public void makeFood() {
            System.out.println("Make food");
        }
        @Override
        public void cookDish() {
            System.out.println("Cook dish");
        }
    }
}