package com.project;

public class HeroSniper extends Hero{
    String tipeHero = "Fighter";

    HeroSniper(String name){
        super(name);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Tipe : " + this.tipeHero);
    }
}
