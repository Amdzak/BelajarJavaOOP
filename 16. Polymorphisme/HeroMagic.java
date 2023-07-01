package com.project;

public class HeroMagic extends Hero{
    String tipeHero = "Fighter";

    HeroMagic(String name){
        super(name);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Tipe : " + this.tipeHero);
    }
}
