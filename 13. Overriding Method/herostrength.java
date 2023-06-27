package com.project;

public class herostrength extends hero{
    double kekuatan;

    // overriding method display dari class hero
    void display(){
        System.out.println("\nHero Strength");
        System.out.println("nama : " + this.name);
        System.out.println("Kekuatan : " + this.kekuatan);
    }
}
