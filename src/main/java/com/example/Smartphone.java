package com.example;

public class Smartphone extends ElectronicDevice{
    private int batteryLevel;
    public Smartphone(String brand, String model, int batteryLevel) {
        super(brand, model);
        this.batteryLevel=batteryLevel;
    }

    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    public String checkBattery() {
        if (this.batteryLevel>20) {
            return "Warning: Battery low!";
        } else {
             return "Battery level is okay:"+this.batteryLevel+"%";
        }
    }

    

    // OPTIONALLY implement the required methods to pass the BonusTest.

}
