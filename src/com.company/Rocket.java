package com.company;

import com.company.Interface.SpaceShip;

public class Rocket implements SpaceShip{
    protected int cost;
    protected int weight;
    protected int maxWeight;
    protected double chanceOfLaunchExplosion;
    protected double chanceOfLandingCrash;
    protected int cargoCarried;
    protected int cargoLimit;

    public boolean launch(){
        return true;
    }

    public boolean land(){
        return true;
    }

    public boolean canCarry(Item item){
        int carry = this.cargoCarried + item.getWeight() + this.weight;
        return this.cargoLimit >= carry;
    }

    public void carry(Item item){
        if (canCarry(item)){
            this.cargoCarried= this.cargoCarried+item.getWeight();
            System.out.println("Ya cargó "+this.cargoCarried);
        }
        else{
            System.out.println("Error No Cargó");
        }
    }
}
