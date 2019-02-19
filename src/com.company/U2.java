package com.company;

import java.util.Random;

public class U2 extends Rocket {
    Random rand= new Random();
    @Override
    public boolean launch(){
        double aleatorio = rand.nextInt(1);
        chanceOfLaunchExplosion=(0.04*cargoCarried/cargoLimit);
        return (this.chanceOfLaunchExplosion<aleatorio);
    }

    @Override
    public boolean land(){
        double aleatorio = rand.nextInt(1);
        chanceOfLandingCrash=(0.08*cargoCarried/cargoLimit);
        return (this.chanceOfLaunchExplosion<aleatorio);
    }
}
