package com.hugo.model;

public class Calculator {

    private User owner;
    public Boolean on = false;

    public Calculator(){

    }
    public Calculator(User owner) {
        this.owner = owner;
        owner.setCalculator(this);
    }

    public User getOwner() {
        return owner;
    }
    public void setOwner(User owner) {
        this.owner = owner;
    }
    public void turnOn(){
        this.on = true;
    }
    public void turnOff(){
        this.on = false;
    }

}
