package com.project;

public class HeroFighter extends Hero{
    String tipeHero = "Fighter";

    HeroFighter(String name){
        super(name);
    }

    @Override
    void display(){
        super.display(); //mengambil metdhos diplay dan menambahkan syntax baru
        System.out.println("Tipe : " + this.tipeHero);
    }

    void showoff(){
        System.out.println("Showoff Dari tipe Fighter");
    }
}
