package com.rentalSystem;

public class Main {

    public static void main(String[] args) {
        Customer c1=new Customer("Shubham",1);
        Vehical car = new Car("Swift", "Maruti", "MH12AB1234");

        c1.rentVehical(car);
//        car.rent();

    }


}
