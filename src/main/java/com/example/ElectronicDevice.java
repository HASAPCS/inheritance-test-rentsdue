package com.example;

public class ElectronicDevice {
    private String brand;
    private String model;
    public ElectronicDevice(String brand, String model) {
        this.brand=brand;
        this.model=model;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setBrand(String newBrand) {
        this.brand=newBrand;
    }

    public void setModel(String newModel) {
        this.model=newModel;
    } 

    // OPTIONALLY implement the required methods to pass the BonusTest.

}
