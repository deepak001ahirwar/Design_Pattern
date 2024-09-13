package com.design.pattern.structural.adapter;

public class AdapterRunner {
    public static void main(String[] args) {

        /***
         * that allows the interface of an existing class to be used as another interface.
         * It acts as a bridge between two incompatible interfaces, making them work together
         */


        WeightMachine babiesObject = new WeightMachineForBabies();
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(babiesObject);

        System.out.println(" Weight: "+weightMachineAdapter.getWeightInKilograms());

    }
}


//Adaptee 

interface  WeightMachine {
    public double getWeightInPound();
}

class WeightMachineForBabies  implements WeightMachine {

    @Override
    public double getWeightInPound() {
        // Implement logic to get weight from baby machine
        return 28;
    }
}
// Adapter

interface WeightMachineAdapter   {
    public double getWeightInKilograms();
}

class WeightMachineAdapterImpl implements WeightMachineAdapter {
    private WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKilograms() {
        return weightMachine.getWeightInPound() * 0.45;
    }
}