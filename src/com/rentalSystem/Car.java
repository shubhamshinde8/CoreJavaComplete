package com.rentalSystem;

public class Car extends Vehical implements Rentable{


    public Car(String model,String brand,String registrationNo) {
    }

    @Override
    public void rent() {

    }


    @Override
    public void returnVehical() {

    }

    @Override
    public double calculatePrice(int days) {
        days=days*1000;
        return days;
    }

    @Override
    void showDetails() {

    }
}
