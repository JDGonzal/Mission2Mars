package com.company;

import java.util.Random;

public class U1 extends Rocket {
    Random rand= new Random();
    @Override
    public boolean launch(){
        double aleatorio = rand.nextInt(1);
        chanceOfLaunchExplosion=(0.05*cargoCarried/cargoLimit);
        return (this.chanceOfLaunchExplosion<aleatorio);
    }

    @Override
    public boolean land(){
        double aleatorio = rand.nextInt(1);
        chanceOfLandingCrash=(0.01*cargoCarried/cargoLimit);
        return (this.chanceOfLaunchExplosion<aleatorio);
    }
}
