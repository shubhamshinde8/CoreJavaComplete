package com.rentalSystem;

import java.util.List;

public class Customer {

    private String name;
    private int id;

    private List<Vehical> rentedVehical;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void rentVehical(Vehical v){
        rentedVehical.add(v);
        System.out.println(name+" ranted : "+v.getModel());
    }

    public void showRentedVehical(){
        System.out.println(name + " has rented:");
        for (Vehical v : rentedVehical) {
            v.showDetails();
        }
    }


}

